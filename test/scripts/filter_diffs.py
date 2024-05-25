import re
import sys

diffs = re.split(r"\n(?=[\w-]+[.\w-]*:)", sys.stdin.read())

def no_diff(string):
    if re.match(r"^.+:\n- (.*)\n\+ \1$", string.strip()):
        return True
    return False

def string_to_one_item_list(string):
    # Check if string matches regex
    if re.match(r"^.+:\n- (.*)\n\+ \[\s*\1\s*]$", string.strip()):
        return True
    return False

def list_to_empty_map(string):
    # Check if string matches regex
    # ^.+:\n- \[\s*(.*)\s*]\n\+ map\[\1:<nil>]$
    match = re.match(r"^.+:\n- \[(?P<list>.*)]\n\+ map\[(?P<map>.*)]$", string.strip())
    if match:
        list_items = re.findall(r"(?P<list>[\w-]+|(?:\"(?:\\.|[^\"])*\")|(?:\'(?:\\.|[^\'])*\'))", match.group('list'))
        map_items = re.findall(r"(?P<map>(?:[\w-]+|(?:\"(?:\\.|[^\"])*\")|(?:\'(?:\\.|[^\'])*\'))):<nil>", match.group('map'))
        return set(list_items) == set(map_items)
    return False

def add_default_shell(string):
    # Check if string matches regex
    if re.match(r"^(?:.+\.)?defaults:\n- <nil>\n\+ map\[run:map\[shell:bash]]$", string.strip()):
        return True
    return False

def string_output_to_map(string):
    # Check if string matches regex
    if re.match(r"^(?:.+\.)?outputs\..*:\n- (.*)\n\+ map\[value:\1]$", string.strip()):
        return True
    return False

def string_spaces(string):
    # Check if string matches regex
    match = re.match(r"^.+:\n- \s*(?P<old>(?:.|\n)*)\n\+ \s*(?P<new>(?:.|\n)*)$", string.strip())
    if match:
        return re.sub(r'\s+', '', match.group('old').strip()) == re.sub(r'\s+', '', match.group('new').strip())
    return False

def full_variable_names(string):
    # Check if string matches regex
    all_expressions = re.findall(r"(\${{\s*[\w-]+(?:\.[\w-]+)*\s*}})", string)

    all_variables = [variable for expression in all_expressions for variable in re.findall(r"(\${{\s*[\w-]+(?:\.[\w-]+)*\s*}})", expression)]

    if len(all_variables) % 2 != 0:
        return False

    top, bottom = all_variables[:len(all_variables)//2], all_variables[len(all_variables)//2:]

    for t, b in zip(top, bottom):
        if not re.match(r"\${{\s*([.\w-]+)\s*}}\n\${{\s*(?:[\w-]+(?:\.[\w-]+)*\.)?\1\s*}}", t + "\n" + b):
            return False
    else:
        return True

diffs = [diff for diff in diffs if not no_diff(diff)]
diffs = [diff for diff in diffs if not string_to_one_item_list(diff)]
diffs = [diff for diff in diffs if not list_to_empty_map(diff)]
diffs = [diff for diff in diffs if not add_default_shell(diff)]
diffs = [diff for diff in diffs if not string_output_to_map(diff)]
#diffs = [diff for diff in diffs if not string_spaces(diff)]
#diffs = [diff for diff in diffs if not full_variable_names(diff)]

print('\n'.join(diffs))
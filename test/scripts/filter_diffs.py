import re
import sys

diffs = sys.stdin.read().split('\n\n')

def no_diff(string):
    if re.match(r"^.+:\n- (.*)\n\+ \1$", string):
        return True
    return False

def string_to_one_item_list(string):
    # Check if string matches regex
    if re.match(r"^.+:\n- (.*)\n\+ \[\s*\1\s*]$", string):
        return True
    return False

def list_to_empty_map(string):
    # Check if string matches regex
    # ^.+:\n- \[\s*(.*)\s*]\n\+ map\[\1:<nil>]$
    match = re.match(r"^.+:\n- \[(?P<list>.*)]\n\+ map\[(?P<map>.*)]$", string)
    if match:
        list_items = re.findall(r"(?P<list>[\w-]+|(?:\"(?:\\.|[^\"])*\")|(?:\'(?:\\.|[^\'])*\'))", match.group('list'))
        map_items = re.findall(r"(?P<map>(?:[\w-]+|(?:\"(?:\\.|[^\"])*\")|(?:\'(?:\\.|[^\'])*\'))):<nil>", match.group('map'))
        return set(list_items) == set(map_items)
    return False

def add_default_shell(string):
    # Check if string matches regex
    if re.match(r"^(?:.+\.)?defaults:\n- <nil>\n\+ map\[run:map\[shell:bash]]$", string):
        return True
    return False

def string_output_to_map(string):
    # Check if string matches regex
    if re.match(r"^(?:.+\.)?outputs\..*:\n- (.*)\n\+ map\[value:\1]$", string):
        return True
    return False

diffs = [diff for diff in diffs if not no_diff(diff)]
diffs = [diff for diff in diffs if not string_to_one_item_list(diff)]
diffs = [diff for diff in diffs if not list_to_empty_map(diff)]
diffs = [diff for diff in diffs if not add_default_shell(diff)]
diffs = [diff for diff in diffs if not string_output_to_map(diff)]

print('\n\n'.join(diffs))
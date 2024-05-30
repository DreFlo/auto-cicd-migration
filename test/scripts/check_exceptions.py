logs = ''

with open('..\..\cli\log_circleci', 'r') as file:
    logs = file.read()

with open('..\..\cli\log_circleci_2', 'r') as file:
    logs = logs + file.read()

file_exceptions = {}

exception = ''

for line in logs.splitlines():
    if line.startswith('Running '):
        file = line.split(' ')[1]
        file_exceptions[file] = exception
        exception = ''
    else:
        exception += line + '\n'



file_exceptions = {k: v for k, v in file_exceptions.items() if v != ''}

YAML_parser_exceptions = {k: v for k, v in file_exceptions.items() if 'com.amihaiemil.eoyaml.exceptions.YamlReadingException' in v}

print(len(file_exceptions))
print(len(YAML_parser_exceptions))
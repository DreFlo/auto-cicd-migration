import re

logs = ''

with open('..\..\cli\log_circleci', 'r', encoding='utf-16le') as file:
    logs = file.read()

split_logs = re.split(r"\n(?=Running \.\.\\)", logs)

file_exceptions = [log for log in split_logs if not re.match(r"^Running .+$", log)]

YAML_parser_exceptions = [log for log in file_exceptions if 'com.amihaiemil.eoyaml.exceptions.Yaml' in log]

gha_syntax_exceptions = [log for log in file_exceptions if 'cli.parsers.exceptions.SyntaxException' in log and 'cli.parsers.GitHubActionsParser' in log]

circleci_syntax_exceptions = [log for log in file_exceptions if 'cli.parsers.exceptions.SyntaxException' in log and 'cli.parsers.CircleCIParser' in log and not 'cli.parsers.GitHubActionsParser' in log]

ATL_exceptions = [log for log in file_exceptions if 'org.eclipse.m2m.atl.engine.emfvm.VMException' in log or 'java.lang.ClassCastException' in log]

null_exceptions = [log for log in file_exceptions if 'java.lang.NullPointerException' in log]

print(len(split_logs))
print(len(file_exceptions))
print(len(YAML_parser_exceptions))
print(len(gha_syntax_exceptions))
print(len(circleci_syntax_exceptions))
print(len(ATL_exceptions))
print(len(null_exceptions))

# print(set(YAML_parser_exceptions).intersection(gha_syntax_exceptions))
# print(set(YAML_parser_exceptions).intersection(circleci_syntax_exceptions))
# print(set(YAML_parser_exceptions).intersection(ATL_exceptions))
# print(set(YAML_parser_exceptions).intersection(null_exceptions))

print(set(gha_syntax_exceptions).intersection(circleci_syntax_exceptions))
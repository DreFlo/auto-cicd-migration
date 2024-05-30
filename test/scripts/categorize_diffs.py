import json
import re
import sys

categorized_diffs = {
    'total': 0,
    'native_package_version_mismatch': 0,
    'concurrency_deleted': 0,
    'secrets_deleted': 0,
    'changed_name': 0,
    'trigger_deleted': 0,
    'unknown' : []
}

diff_string = sys.stdin.read()

if diff_string.strip() == '':
    print(json.dumps(categorized_diffs, indent=2))
    sys.exit(0)

diffs = re.split(r"\n(?=[\w-]+[.\w-]*:)", diff_string)

def native_package_version_mismatch(string):
    # Check if string matches regex
    if re.match(r"^jobs\.[\w-]+\.steps\.\d+\.uses:\n- actions\/(checkout|(?:upload|download)-artifact|cache)@.+\n\+ actions\/\1@.+$", string.strip()):
        return True
    return False

def concurrency_deleted(string):
    if re.match(r"^(?:jobs\.[\w-]+\.)?concurrency:\n- .+\n\+ <nil>$", string.strip()):
        return True
    return False

def secrets_deleted(string):
    if re.match(r"^(?:[\w-]+\.)*secrets:\n- .+\n\+ <nil>$", string.strip()):
        return True
    return False

def changed_name(string):
    if re.match(r"^(?:[\w-]+\.)*name:\n- .+\n\+ .*$", string.strip()):
        return True
    return False

def trigger_deleted(string):
    if re.match(r"^(?:true|on)(\.[\w-]+)?:\n- .+\n\+ .*$", string.strip()):
        return True
    return False

def permissions_deleted(string):
    if re.match(r"^(?:[\w-]+\.)*permissions:\n- .+\n\+ <nil>$", string.strip()):
        return True
    return False

functions = [native_package_version_mismatch, concurrency_deleted, secrets_deleted, changed_name, trigger_deleted]

for diff in diffs:
    for function in functions:
        if function(diff):
            categorized_diffs[function.__name__] += 1
            break
    else:
        categorized_diffs['unknown'].append(diff)

categorized_diffs['total'] = len(diffs)

print(json.dumps(categorized_diffs, indent=2))
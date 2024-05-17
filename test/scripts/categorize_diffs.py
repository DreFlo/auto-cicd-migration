import json
import re
import sys

categorized_diffs = {
    'native_package_version_mismatch': 0,
    'unknown' : []
}

diff_string = sys.stdin.read()

if diff_string.strip() == '':
    print(json.dumps(categorized_diffs, indent=2))
    sys.exit(0)

diffs = re.split(r"\n(?=[\w-]+[.\w-]*:)", diff_string)

def native_package_version_mismatch(string):
    # Check if string matches regex
    if re.match(r"^jobs\..+\.steps\.\d\.uses:\n- actions\/(checkout|(?:upload|download)-artifact|cache)@.+\n\+ actions\/\1@.+$", string.strip()):
        return True
    return False

functions = [native_package_version_mismatch]

for diff in diffs:
    for function in functions:
        if function(diff):
            categorized_diffs[function.__name__] += 1
            break
    else:
        categorized_diffs['unknown'].append(diff)

print(json.dumps(categorized_diffs, indent=2))
import json
import re
import sys

categorized_diffs = {
    'total': 0,
    'native_package_version_mismatch': 0,
    'macos_version_mismatch': 0,
    'changed_name': 0,
    'trigger_deleted': 0,
    'native_package_lost_args': 0,
    'step_env_deleted': 0,
    'string_to_double': 0,
    'continue_on_error': 0,
    'encoding': 0,
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

def macos_version_mismatch(string):
    # Check if string matches regex
    if re.match(r"^jobs\.[\w-]+\.runs-on:\n- .*macos-.+\n\+ \[macos-latest]$", string.strip()):
        return True
    return False

def changed_name(string):
    if re.match(r"^(?:[\w-]+\.)*name:\n- .+\n\+ .*$", string.strip()) or re.match(r"^run-name:\n- .+\n\+ <nil>$", string.strip()):
        return True
    return False

def trigger_deleted(string):
    if re.match(r"^(?:true|on)(\.[\w-]+)?:\n- .+\n\+ .*$", string.strip()):
        return True
    return False

def native_package_lost_args(string):
    if re.match(r"^.*\.with(?::\n- map\[|.)(?:fetch-depth|submodules|repository|ref|token|ssh-key|ssh-known-hosts|ssh-strict|ssh-user|persist-credentials|clean|filter|sparse-checkout|sparse-checkout-cone-mode|fetch-tags|show-progress|lfs|set-safe-directory|github-server-url|if-no-files-found|retention-days|compression-level|overwrite|pattern|merge-multiple|github-token|repository|run-id|upload-chunk-size|enableCrossOsArchive|restore-keys|fail-on-cache-miss|lookup-only|save-always)(?:\n|.)+$", string.strip()):
        return True
    return False

def step_env_deleted(string):
    if re.match(r"^jobs\.[\w-]+\.steps\.\d+\.env:\n- map\[.*]\n\+ <nil>$", string.strip()):
        return True
    return False

def string_to_double(string):
    match = re.match(r"^.*:\n- (\d+(?:\.\d+)?)\n\+ (\d+(?:\.\d+)?)$", string.strip())
    if match:
        return float(match.group(1)) == float(match.group(2))
    return False

def continue_on_error(string):
    if re.match(r"^(?:[\w-]+\.)*continue-on-error:\n- .*\n\+ <nil>$", string.strip()):
        return True
    return False

def encoding(string):
    match = re.match(r"^[\w-]+(?:\.[\w-]+)*:\n- ((?:.|\n(?!\+))+)\n\+ ((?:.|\n)+)$", string.strip())
    if match:
        try:
            prev = match.group(1).encode('utf-8', 'replace')
            new = match.group(2)
            return prev == new
        except:
            return True
    return False

functions = [native_package_version_mismatch, changed_name, trigger_deleted, macos_version_mismatch, native_package_lost_args, step_env_deleted, string_to_double, continue_on_error, encoding]

for diff in diffs:
    for function in functions:
        if function(diff):
            categorized_diffs[function.__name__] += 1
            break
    else:
        categorized_diffs['unknown'].append(diff)

categorized_diffs['total'] = len(diffs)

print(json.dumps(categorized_diffs, indent=2))
import os
import json

categorized_diffs_dir = os.path.join('..', 'categorized_diffs')

files_with_diffs = 0
files_with_diffs_no_name_changes = 0
files_with_diffs_no_circleci_shenanigans = 0
files_with_unknown_diffs = 0
files_with_native_package_lost_args = 0
files_with_step_env_deleted = 0
files_with_string_to_double = 0
files_with_encoding = 0

unknown_diffs = []

# Got through all file in the ..\categorized_diffs directory
for filename in os.listdir(categorized_diffs_dir):
    if filename.endswith('.json'):
        with open(os.path.join(categorized_diffs_dir, filename), 'r') as f:
            diffs = json.load(f)
            if diffs['total'] > 0: 
                files_with_diffs += 1
                total_no_name_change_no_trigger = diffs['total'] - (diffs['changed_name'] + diffs['trigger_deleted'])
                total_no_metamodel_no_circleci_shenanigans = total_no_name_change_no_trigger - (diffs['native_package_version_mismatch'] + diffs['macos_version_mismatch'])
                if total_no_name_change_no_trigger > 0:
                    files_with_diffs_no_name_changes += 1
                if total_no_metamodel_no_circleci_shenanigans > 0:
                    files_with_diffs_no_circleci_shenanigans += 1
                if len(diffs['unknown']) > 0:
                    files_with_unknown_diffs += 1
                    unknown_diffs.append({
                        'filename': filename,
                        'diffs': diffs['unknown']
                    })
                if diffs['native_package_lost_args'] > 0:
                    files_with_native_package_lost_args += 1
                if diffs['step_env_deleted'] > 0:
                    files_with_step_env_deleted += 1
                if diffs['string_to_double'] > 0:
                    files_with_string_to_double += 1
                if diffs['encoding'] > 0:
                    files_with_encoding += 1

print(f'Files with diffs: {files_with_diffs}')
print(f'Files with diffs (excluding name changes and trigger deletions): {files_with_diffs_no_name_changes}')
print(f'Files with diffs (excluding previous and version mismatches): {files_with_diffs_no_circleci_shenanigans}')
print(f'Files with lost args: {files_with_native_package_lost_args}')
print(f'Files with step env deleted: {files_with_step_env_deleted}')
print(f'Files with string to double: {files_with_string_to_double}')
print(f'Files with encoding: {files_with_encoding}')
print(f'Files with unknown diffs: {files_with_unknown_diffs}')
# for diff in unknown_diffs:print(diff)
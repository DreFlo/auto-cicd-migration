import os
import json

categorized_diffs_dir = os.path.join('..', 'categorized_diffs')

files_with_diffs = 0
files_with_diffs_no_name_changes = 0
files_with_diffs_no_circleci_shenanigans = 0
files_with_unknown_diffs = 0

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

print(f'Files with diffs: {files_with_diffs}')
print(f'Files with diffs (excluding name changes and trigger deletions): {files_with_diffs_no_name_changes}')
print(f'Files with diffs (excluding previous and version mismatches): {files_with_diffs_no_circleci_shenanigans}')
print(f'Files with unknown diffs: {files_with_unknown_diffs}')

#!/bin/bash

for file in ../tests/*.*ml; do
    base_name=$(basename "$file")
    converted_file="../converted_circleci/${base_name}"
    # Check if the file has a corresponding converted file
    if [ ! -f "$converted_file" ]; then
        echo "Skipping $file as it has no corresponding converted file"
        continue
    fi
    echo "Comparing $file to $converted_file"
    ../yamldiff "$file" "$converted_file" --no-color | python ../scripts/filter_diffs.py > "../diffs/${base_name}.diff"
    cat "../diffs/${base_name}.diff" | python ../scripts/categorize_diffs.py > "../categorized_diffs/${base_name}.diff.json"
done


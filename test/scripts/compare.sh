#!/bin/bash

for converted_file in ../converted_circleci_pre_validate/*; do
    base_name=$(basename "$converted_file")
    file="../tests/${base_name}"
    echo "Comparing $file to $converted_file"
    ../yamldiff "$file" "$converted_file" --no-color | python ../scripts/filter_diffs.py > "../diffs/${base_name}.diff"
    cat "../diffs/${base_name}.diff" | python ../scripts/categorize_diffs.py > "../categorized_diffs/${base_name}.diff.json"
done


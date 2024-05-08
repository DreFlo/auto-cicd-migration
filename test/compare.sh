#!/bin/bash

for file in ./tests/*.*ml; do
    base_name=$(basename "$file")
    converted_file="./converted/${base_name}"
    echo "Comparing $file to $converted_file"
    ./yamldiff "$file" "$converted_file" --no-color | python ./scripts/filter_diffs.py >  "./diffs/${base_name}.diff"
done


import os
import csv

scripts_dir = os.path.join('..', 'tests')

# for file in dir store in csv filename and line count
for filename in os.listdir(scripts_dir):
    if filename.endswith('.yml') or filename.endswith('.yaml'):
        try:
            with open(os.path.join(scripts_dir, filename), 'r', errors='replace') as f:
                lines = f.readlines()
                # if csv file doesn't exist, create it and write the header
                if not os.path.isfile('lines_per_script.csv'):
                    with open('lines_per_script.csv', 'w', newline='') as csvfile:
                        csvwriter = csv.writer(csvfile)
                        csvwriter.writerow(['filename', 'line_count'])
                with open('lines_per_script.csv', 'a', newline='') as csvfile:
                    csvwriter = csv.writer(csvfile)
                    csvwriter.writerow([filename, len(lines)])
        except Exception as e:
            print(f'Error reading file {filename}: {e}')
            pass
        
import os
import re


def remove_comments(text):
    
    new_text = re.sub("#.*","",text)
    return new_text


def save_to_file(loc, text):
    
    with open(loc,"w") as f:
        try:
            f.write(text)
            f.close()
        except:
            print(f"Error writing to file {loc}")
def main():
    
    source_dir = "tests"
    new_dir="language"

    new_file_extension="mydsl11"
    
    counter = 0
    
    for filename in os.listdir(source_dir):
        with open(f"{source_dir}/{filename}", 'r') as f:
            
            try:
                text = remove_comments(f.read())
                save_to_file(f"{new_dir}/test{counter}.{new_file_extension}",text)
                counter+=1
                ##print(text)
            except:
                print(f"Error reading file {filename}")

    
    
main()

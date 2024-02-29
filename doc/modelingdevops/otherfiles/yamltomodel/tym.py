import yaml
import sys


def header():
    print('<?xml version="1.0" encoding="UTF-8"?>
<devops2:Pipeline xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:devops2="http://www.example.org/devops2" Name0="GitLab example1">')

def footer():
    print('</devops2:Pipeline>')


def GA_to_MDEDevOps(doc):
    
    header()

    for i in doc:
        print(i)
    
    footer()


def main():
    
    if(len(sys.argv) < 1):
        print("No file given as input")
        return

    print(sys.argv[1])
    f = open(sys.argv[1], "r")
    doc = yaml.safe_load_all(f)

    GA_to_MDEDevOps(doc)

    print("main")



main()

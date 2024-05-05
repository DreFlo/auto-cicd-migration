import json
import os


from dotenv import load_dotenv
from github import Github, Auth
from random import sample

load_dotenv()

print('Connecting to GitHub...')

# Load the GitHub token
TOKEN = os.getenv('GITHUB_TOKEN')

# Authenticate with the GitHub API
auth = Auth.Token(TOKEN)

g = Github(auth=auth)

SAMPLE_SIZE = 100

print('Connected to GitHub.')

print('Loading sample...')

with open('../Repositories.random_processed.json', 'r', encoding='utf-8') as f:
    repos = json.load(f)

repos_with_gha = [repo for repo in repos if 'GitHubActions' in repo['tools_used']]

del repos

repos_with_gha = sample(repos_with_gha, SAMPLE_SIZE * 2)

print('Sample loaded.')

print('Retrieving scripts...')

processed = 0

for repo in repos_with_gha:
    try:
        contents = g.get_repo(repo['full_name']).get_contents('.github/workflows')
    except Exception as e:
        print(f"Error retrieving {repo['full_name']}: {type(e).__name__}")
        continue

    contents = contents if type(contents) is list else [contents]

    for content in contents:
        if content.path.endswith('.yml') or content.path.endswith('.yaml'):
            with open(f'../tests/{repo["full_name"].replace("/", "-")}-{content.name}', 'w', encoding='utf-8') as f:
                f.write(content.decoded_content.decode('utf-8'))

    processed += 1

    if processed == SAMPLE_SIZE:
        break


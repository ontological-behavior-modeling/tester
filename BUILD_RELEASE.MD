build_release.yml increments the project's version and creates a release automatically when code is pushed to main or a pull request is merged into main.

# Prerequisite

Include a PAT token with permission to write to repo in the project's "Actions secrets and variables" settings with the name "PAT_TOKEN".
![image](https://github.com/ontological-behavior-modeling/tester/assets/22268862/7fe2a1de-dc7d-4e19-b153-0428f2634aa2)

Go to Settings > Actions > General, scroll down to "Workflow permissions", then make sure the GITHUB_TOKEN has read and write permissions.
![image](https://github.com/ontological-behavior-modeling/tester/assets/22268862/e23839e6-cc62-49bf-9c93-de04f39d3444)


# How to use

In order to work, commit messages must follow the "Conventional Commit" format. Here is info about "Conventional Commit": https://www.conventionalcommits.org/en/v1.0.0
The reason why is because the semantic-versioning-maven Action that automatically increments the version number for us uses "Conventional Commit" format to know
how it should do the update. As far as I know, messages for merging pull requests don't need to follow "Conventional Commit" format.

# Example

![image](https://github.com/ontological-behavior-modeling/tester/assets/22268862/1ac403c8-b81f-4d07-8fa5-d727e839d4a3)

![image](https://github.com/ontological-behavior-modeling/tester/assets/22268862/186b418c-8232-487a-8f7a-65d5f018d8d2)

# How to transfer build_release script to another project

Copy paste the build_release.yml from this project to the other project. Then, do the two prerequisite steps mentioned above and everything should be setup.

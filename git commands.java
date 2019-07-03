git config --global user.name "sai"
git config --global user.email "anumolu@gmail.com"
git config --global push.default simple

git clone <central-repo> <local-repo>
git status
git add <file> or git add .
git commit -m "Commit message"
git log
git push
git pull
git branch
git branch <newbranch>
git checkout <branchname>
git merge <srcbranch> <destinationbranch>
git cherry-pick <commitID>

git stash
git stash list
git stash apply stash@{Indexnum}
git stash clear

git reset --soft
git reset --mixed
git reset --sof

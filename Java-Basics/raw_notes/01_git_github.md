 # 🛠️ Chapter 01: Git and GitHub

## 🔄 The 4 Git Statuses
Before saving anything, Git tracks where your files stand using these four distinct states:

* 🔴 **Untracked:** Brand new files that Git doesn't know exist yet.
* 🟡 **Modified:** Existing files where you have made new changes or edits.
* 🟢 **Staged:** Files that are locked, loaded, and completely ready to be committed.
* 🔵 **Unmodified:** Saved/committed files that match your repository's history exactly.

---

## 💻 Comprehensive Git Command Guide

### 📂 1. Navigation & Directory Basics
* `ls` ── **List Files:** Shows all visible files in your current folder.
* `ls -a` ── **List Hidden:** Shows hidden configuration files (like the secret `.git` folder).
* `mkdir <folder_name>` ── **Make Directory:** Creates a brand new folder.
* `cd <folder_name>` ── **Change Directory:** Moves your terminal inside that specific folder.

### 🔍 2. Core Git Workflow (The Daily Routine)
* `git status` ── **Check Status:** Displays which files are untracked, modified, or staged.
* `git add <file_name>` ── **Stage File:** Moves a specific file to the staging area.
* `git add .` ── **Stage All:** Grabs *every single change* in the current directory.
* `git commit -m "your message"` ── **Commit:** Saves a permanent snapshot of your staged files with a description.
* `git push origin main` ── **Push to Cloud:** Uploads your local snapshots to your online GitHub repository (`origin`) onto the primary branch (`main`).

### 📦 3. Repository Initialization (Starting From Scratch)
Use these when connecting a brand new laptop project to a fresh GitHub page:
* `git init` ── Creates a hidden, local Git time machine right inside your folder.
* `git remote add origin <link>` ── Links your local project to your online GitHub repository.
* `git remote -v` ── **Verify Remote:** Double-checks that your local folder is linked to the correct online URL.
* `git push -u origin main` ── Pushes your code and sets the default upstream branch so you can just type `git push` in the future.
* `git clone <repo_link>` ── Downloads an entire existing GitHub repository onto your laptop.

---

## 🌿 4. Branching & Team Collaboration
Branches allow you to work on new features or take experimental notes without risking breaking the working code on your `main` branch.

* `git branch` ── Lists all local branches (the one with the asterisk `*` is your active branch).
* `git branch -M main` ── Force-renames your current primary branch to `main`.
* `git checkout <branch_name>` ── Switches your workspace over to an existing branch.
* `git checkout -b <new_branch_name>` ── **Create & Switch:** Instantly creates a new branch and jumps right into it.
* `git branch -d <branch_name>` ── Deletes a branch safely (Note: You must switch out of the branch first before you can delete it!).

### 🔀 5. Merging Code & Resolving Conflicts
When a feature is finished and you want to blend it back into your primary project:

#### 🔹 Method 1: Local Terminal Merging
1. `git diff <branch_name>` ── Compares the detailed differences between your current branch and another one.
2. `git merge <branch_name>` ── Pulls the changes from the target branch into your active branch.

#### 🔹 Method 2: Cloud Pull Requests (PR)
* **Pull Request (PR):** Done directly on GitHub's website. It lets you notify your teammates about changes you've pushed, allowing everyone to review the code before merging it into the master branch.

#### ⚠️ Managing Merge Conflicts
A conflict occurs when Git gets stuck because two different commits changed the exact same line of code.
* To fix it locally, run `git merge <conflicting_branch_name>`, open the broken file in VS Code, manually select which code to keep, save, and make a fresh commit.

---

## 🎒 6. Advanced Industry Secrets

### 🎪 The Backstage Stash
If you are in the middle of writing notes or code but need to instantly switch tasks without making an ugly, half-finished commit, use the stash!
* `git stash` ── Sweeps all your current uncommitted changes into a temporary box in the backstage. Your workspace becomes completely clean.
* `git stash pop` ── Brings your stashed changes right back out of the backstage so you can continue working.
* `git stash clear` ── Permanently empties your stash box.

### 🪵 Squashing Commits (History Clean-up)
If you made 5 messy, tiny commits (like fixing typos) and want to clean them up into 1 single professional commit before sharing it:
* `git rebase -i <commit_hash>` ── Opens an interactive menu of all commits up to that point.
* Change the word `pick` to `squash` (or `s`) for the minor commits you want to blend into the main one above them.
* *Pro-Tip:* Type `:x` (or `:wq`) and hit Enter to save and exit Vim menus if they pop up in your terminal!

---

## ⏪ 7. Undoing Changes (The Safety Nets)

### 🧼 Unstaging Files
* `git reset <file_name>` ── Safely removes a specific file from the staging area back to your working area.
* `git reset` ── Unstages absolutely everything you just queued up.

### ⏰ Rolling Back Commits
* `git reset HEAD~1` ── Undoes your very last commit, keeping your actual code safe as uncommitted edits.
* `git reset <commit_hash>` ── Rolls your project history back to a specific point in time using its unique identifier hash.
* `git reset --hard <commit_hash>` ── 🚨 **Danger Zone:** Permanently deletes everything in your local files and online tracking history back to that specific commit hash. Use with caution!

---

## 🍴 8. Forking Ecosystem
* **Fork:** Done completely via the GitHub website interface. It creates a complete personal "rough copy" duplicate of someone else's open-source repository under your own account. This lets you freely edit and practice with their project without altering their original "upstream" code!

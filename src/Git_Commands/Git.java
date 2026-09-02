//Your Computer                    GitHub
//─────────────                    ──────
//Local Repository                 Remote Repository
//       │                              │
//       │          push                │
//       ├─────────────────────────────►│
//       │                              │
//       │          pull                │
//       │◄─────────────────────────────┤

// Git Commands

//// git status
// What's happening in my Git?, Which branch you're on, Which files changed,
// Which files are untracked, Whether you have commits to push/pull

//-----------------------------------------------------------------------------

//// git branch
// * Test_2         * = your current branch.
//  Main_Code
//  test_1
//  master

//-----------------------------------------------------------------------------

//// git switch "name"
// git switch Test_2 = change branch

//-----------------------------------------------------------------------------

//// git switch -c Test_3
// Create and immediately switch:
// Create Test_3
//      +
//Switch to Test_3

//-----------------------------------------------------------------------------

// Before committing, stage your changes:
//// git add .
// . means all changed files.
//// git add Test.java
// git add = "I want these changes included in my next commit."

//-----------------------------------------------------------------------------

// Now create a commit:
//// git commit -m "Added HashMap example"
//git add
//   ↓
//Select changes
//   ↓
//git commit
//   ↓
//Save changes in local Git history

//-----------------------------------------------------------------------------

// Now send your commit to GitHub:
//// git push
// If the branch isn't connected yet, use:
//// git push -u origin Test_2
// After that, normally:
//// git push
// will work
// commit = save locally
// push   = send to GitHub

//-----------------------------------------------------------------------------

// Suppose someone changed code on GitHub.
// You can check/get the remote updates with:
//// git fetch origin
// This doesn't merge those changes into your current code.
//GitHub
//  ↓
//fetch
//  ↓
//"I know what changed"
//Your working code isn't automatically changed.

//-----------------------------------------------------------------------------

// pull gets remote changes and integrates them into your current branch.
//// git pull
//fetch
//  +
//merge
//  =
//pull
//// git pull origin Branch_1
// Get Branch_1 from the origin remote and merge it into my current branch.

//-----------------------------------------------------------------------------

//Suppose you're currently on:
//// Test_2

//and want changes from:

//// Main_Code

//// git switch Test_2
//// git merge Main_Code

//Main_Code
//    │
//    │ merge
//    ↓
// Test_2

//For a remote branch:
//// git merge origin/Branch_1
//origin/Branch_1
//       │
//       ↓
//    Test_2

//-----------------------------------------------------------------------------

//See remote branches:

//// git branch -r

//Example:

//origin/Main_Code
//origin/test_1
//origin/Test_2

//Remember:

//Local:
//Main_Code

//Remote:
//origin/Main_Code

//-----------------------------------------------------------------------------
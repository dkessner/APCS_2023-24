# Software installation - Mac

__2022-23 students: I haven't verified these instructions this year yet.
If you do this setup, please report back to me (either that it worked,
or what the problem is).  Thank you!__


## Install Homebrew

The first step is to install Homebrew, which is a software package manager that
will help us install everything else we need.

- Go to the [Homebrew website](https://brew.sh/) and read the installation instructions.
- To install, you will copy/paste a command from their webpage to your Terminal.

You can install everything else with Homebrew, from the command line.


## Install Java

Install the Java Development Kit (JDK) from the Eclipse Foundation
([info](https://formulae.brew.sh/cask/temurin)). 

```
brew install --cask temurin
```

Check that everything is installed properly.  These commands will
report the Java version.

```
javac -version
java -version
```

## Install Atom

[Atom](https://atom.io/) is a text editor.  If you already have a favorite text
editor, feel free to use that instead.

```
brew install --cask atom
```


## Create a GitHub account

[GitHub](https://github.com/) hosts code repositories for software projects.
We will be using GitHub for sharing code.

Please make an account and email me your account name.


## Install GitHub Desktop

[GitHub Deskop](https://desktop.github.com/) is a desktop application
that facilitates interacting with repositories on GitHub.

```
brew install --cask github
```


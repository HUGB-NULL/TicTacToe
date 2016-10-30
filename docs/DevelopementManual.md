# TicTacToe
## Developement Manual

### What is neccesary do have installed in order to work on developement for project?
* #### Git
* #### Gradle 3.1
* #### Java JDK

### How can I install those things?
* #### Git
    * Go to https://git-scm.com/download/win
* #### Gradle 3.1 (Information from https://gradle.org/gradle-download/)
	```shell
    curl -s https://get.sdkman.io | bash
    source "~/.sdkman/bin/sdkman-init-sh"
    sdk install gradle 3.1
    ```
* #### Java JDK
    * Download the program from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

### Everything is installed, how do I get started?
1. ##### Clone the git repository https://github.com/HUGB-NULL/TicTacToe to your computer.
	* (_SSH_) git clone git@github.com:HUGB-NULL/TicTacToe.git
	* (_HTTPS_) git clone https://github.com/HUGB-NULL/TicTacToe.git
2. #### Locate to the master folder on your local maschine.
	* To clean, build and create .jar file:
	```shell
	bin/package
	```
	* To move .jar file to a temp folder outside of the master folder and run the .jar
    ```shell
    bin/deploy
    ```
	* To do all of the above:
    ```shell
    bin/run
    ```
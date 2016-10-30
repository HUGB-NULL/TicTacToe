# TicTacToe
## Design Report

* #### About this project
The project is a part of the course Software developement in Reykjavík University.
It was carried out by four students, Gunnar Birnir Ólafsson, Hreinn Rúnarsson, Stefán Vilberg Leifsson and Védís Erna Eyjólfsdóttir. Their job was to implement the game TicTacToe in java, but the main focus was on the infrastructure and coding practices.

* #### What was done:
	1. [x] The code base is stored in source control system on GitHub from early start of the project.
	2. [x] The system is set up with automatic build script.
	3. [x] The build script runs all unit tests.
	4. [x] The output is a deployable or executable artifact, such as a jar/war og equivalent.
	5. [x] The build script has deploy/install target that deploys the executable outside of the working directory or on external server.
	6. [x] The business logic should be coded using Test Drived Development.
	7. [x] The code should be loosely coupled and follow good object oriented design practices.
	8. [x] Documentation uses Markdown syntax.
	9. [x] Use Automated Continuous Integraion Server(e.g. Travis).
	10. [x] Use feature branches and pull requests for all features. It must be clear that this workflow was used the whole time and that the team was using reviews before accepting pull-requests.

* #### Coding rules
    * The code should be written in java. 
    * All class names should be written in __PascalCase__.
    * All function names should be written in __camelCase__.
    * All variable names should be written in __snake_case__.
    * All comments should be written in english.
    * All comments should begin with a space and end with a signature.
    * All comments should be written __above__ the code it refers to.
    
        ```java
        // I am a comment -John Smith
        int min_value = 0;
        return min_value;
        ```

    * Function and variable names should be descriptive
    * Brackets should __not__ be inline with the function name.
    
        ```java
        thisFunctionCalculatesSum(int a, int b)
        { 
            return a+b; 
        }
        ```
        
    * All if-statements and loops should have brackets, even though they only contain one line of code.

* #### Class diagram
   ![alt text](http://i.imgur.com/pwc9F86.png "Class diagram")
* #### Updated class diagram
   ![alt text](http://i.imgur.com/bgw3PV1.png "Updated class diagram")
* #### Flowchart
   ![alt text](http://i.imgur.com/ngvZbsU.png "Flowchart")

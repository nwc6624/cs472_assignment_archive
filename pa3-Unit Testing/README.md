# PA 03 - Unit Testing
 4/5/2024<br>
 Author: Noah Caulfield<br>
 Class: CS 472 via Eastern New Mexico University <br>


This is a redesign of the program designed in PA 02 with jUnit testing implemented. 


## Project Structure and Build Automation:

- The `src` folder is organized into `main` and `test` directories for source and test code, respectively.
- The `lib` folder is designated for storing any necessary libraries that the project depends on, including JUnit.
- The `build.xml` file is an Ant script designed for automating build tasks such as compilation, execution, and cleanup of the project. Ant is a Java-based build tool used for automating software build processes.


## JUnit Testing:

- **JUnit Library**: The project uses JUnit 4 for testing. The JUnit JAR file should be placed in the `lib` folder.
- **JUnit Test Class**: `TestSortingAlgorithms` in the `test/sorting` package verifies the correctness of the sorting algorithms, covering various scenarios including edge cases.

The build.xml Ant script, previously used in PA 02 , is modified to include additional tasks for compiling, running, testing, and cleaning the project efficiently.
The script should also be updated to manage dependencies for any necessary libraries, ensuring that the project has all its required resources.


## Prerequisites:

Before beginning, ensure you have met the following requirements:
- You have installed Java JDK 8 or above.
- You have installed Apache Ant on your machine.

Please note the project was ran with the following .jar files in the lib folder: <br>
-junit-4.13.2.jar <br>
-hamcrest-cor.1.3.jar


## Building and Testing the Project:




## Installation

To install the project, follow these steps:

1. Clone the project repository to your local machine using Git or download the ZIP package and extract it.
2. Navigate to the project directory where the `build.xml` file is located.

## Building the Project
(1)
To build the project<br>
 Run the following command from the root of the project directory   (Where the Build.xml is housed):

` ant compile`<br>
This compiles the project and generates the .class files in the build/classes directory

(2)
Running the Project <br>
To run the compiled project, execute:

`ant run` <br>
This command will initiate the project based on the main method of the class specified in the Ant script.

(3)
Testing the Project<br>
Simply execute: 
` ant test`<br>
This command initializes and runs the jUnit 4 testing via TestSortingAlgorithms.java

 (4)
Cleaning the Build<br>
To clean up the build artifacts and prepare for a fresh build, use:

 `ant clean`<br>
This will remove the build directory along with all its contents.

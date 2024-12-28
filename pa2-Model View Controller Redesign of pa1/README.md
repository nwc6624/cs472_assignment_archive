# PA 02 - Model-View-Controller
 3/27/2024<br>
 Author: Noah Caulfield<br>
 Class: CS 472 via Eastern New Mexico University <br>


This is a redesign of the program designed in PA 01 but utilizing the MVC design pattern


Project Structure and Build Automation:

A lib folder is designated for storing any necessary libraries that the project depends on.
The build.xml file is an Ant script designed for automating build tasks such as compilation, execution, and cleanup of the project. Ant is a Java-based build tool used for automating software build processes.

Model-View-Controller (MVC) Design Pattern:

The Model class represents the project's data, specifically sorting algorithms and the input array. This class is responsible for encapsulating the data logic.
The View class is tasked with displaying the original and sorted arrays to the user, handling the presentation layer.
The Controller class manages interactions between the Model and View, ensuring that data flows correctly from the model to the view and vice versa.
Existing QuickSort and BinarySearch classes are to be refactored to integrate with the Model class, adhering to the MVC architecture.

Implementation Details:

The Model class should provide methods to set and retrieve the input array, as well as encapsulate the sorting algorithms.
The View class is responsible for displaying data to the user.
The Controller class coordinates the interactions between the Model and View, allowing for the correct flow of data and responses.


The build.xml Ant script, previously used in PA 01 (presumably a prior assignment or project), should be modified to include additional tasks for compiling, running, and cleaning the project efficiently.
The script should also be updated to manage dependencies for any necessary libraries, ensuring that the project has all its required resources.

## Prerequisites

Before beginning, ensure you have met the following requirements:
- You have installed Java JDK 8 or above.
- You have installed Apache Ant on your machine.

## Installation

To install the project, follow these steps:

1. Clone the project repository to your local machine using Git or download the ZIP package and extract it.
2. Navigate to the project directory where the `build.xml` file is located.

## Building the Project
(1)
To build the project, run the following command from the root of the project directory   (Were the Build.xml is housed):

# ant compile
This compiles the project and generates the .class files in the build/classes directory

(2)
Running the Project
To run the compiled project, execute:

# ant run
This command will initiate the project based on the main method of the class specified in the Ant script.
 
 (3)
Cleaning the Build
To clean up the build artifacts and prepare for a fresh build, use:

# ant clean
This will remove the build directory along with all its contents.

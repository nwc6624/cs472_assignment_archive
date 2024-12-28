# CS 472: Software Engineering Assignments Archive

This repository contains a collection of assignments and projects from **CS 472: Software Engineering**, taken during the Spring 2024 semester at **Eastern New Mexico University**. It showcases key concepts such as object-oriented and agile techniques, design patterns, version control, unit testing, and code coverage.

The repository also includes a **final group project**, **Best Eastern**, archived as a ZIP file. This project represents a full-stack Java EE application with a relational database backend, showcasing teamwork, scalability, and software engineering best practices.

---

## Course Description  

> *"Ideas and techniques for designing, developing, and modifying large software systems. Object-oriented and agile techniques. Topics include software specification, design, testing, debugging, version control, documentation, and maintenance. Team implementation of a software project."*  

**Prerequisite:** CS 234  

---

## Repository Structure  

### Final Project - Best Eastern  
- **Description:** A Java EE application built as part of a group project.  
- **Technologies Used:** Java EE, SQL database, and HTML/CSS for frontend.  
- **Notes:** The project archive (`BestEastern-472_Group_final.zip`) is not the final build and may not include all required files for direct deployment.  

#### How to Run  
1. Extract the `BestEastern-472_Group_final.zip` file.  
2. Navigate to the extracted directory.  
3. Deploy the `.war` file (if included) to a Java EE-supported server such as Apache Tomcat.  
4. Configure the database connection string in the `persistence.xml` or equivalent file.  
5. Start the server and access the application via the provided URL.

---

## Assignments  

### PA01 - OOP Ecosystem Simulation  
- A simulation project to understand object-oriented programming principles.  
- Features a simple simulation of interacting entities in a system.  
- Includes an Ant-based build file for project automation.

### PA02 - Model-View-Controller Architecture  
- Refactoring of PA01 using the **Model-View-Controller (MVC)** design pattern.  
- Demonstrates the separation of concerns through distinct classes for data handling, user interaction, and presentation.  
- Key files include:  
  - `Model.java`  
  - `View.java`  
  - `Controller.java`  
  - `Runner.java`  

### PA03 - Unit Testing with JUnit  
- Integration of **JUnit 4** for testing QuickSort and BinarySearch algorithms.  
- Implements a structured project hierarchy with separate `src` and `test` directories.  
- Includes:  
  - `TestSortingAlgorithms.java` for unit testing.  
  - Updated `build.xml` with tasks for compilation, testing, and cleanup.  
  - Libraries for JUnit and Hamcrest in the `lib` directory.  

### PA04 - Code Coverage with JaCoCo  
- Further enhancement of PA03 with **JaCoCo** for code coverage analysis.  
- Generates coverage reports to identify untested code.  
- Key updates:  
  - Enhanced `build.xml` to automate coverage reporting.  
  - JaCoCo libraries added to the `lib` directory.  

---

## Prerequisites  

Before running the projects, ensure the following are installed:  
- Java JDK 8 or higher  
- Apache Ant  
- A Java EE-compatible server (e.g., Apache Tomcat) for the final project  
- JaCoCo libraries for code coverage  

---

## Build Instructions  

1. **Compile the Project:**  
   ```bash
   ant compile
   ```
2. **Run Unit Tests:**  
   ```bash
   ant test
   ```
3. **Generate Coverage Report:**  
   ```bash
   ant coverage
   ```
   Reports will be available in the `${report.dir}/coverage` directory.

4. **Run the Application:**  
   ```bash
   ant run
   ```
5. **Clean Up Artifacts:**  
   ```bash
   ant clean
   ```

---

## Learning Objectives  

By completing these assignments, students ideally gained hands-on experience in:  
- Designing scalable software systems with object-oriented principles.  
- Utilizing design patterns such as MVC.  
- Automating builds with Apache Ant.  
- Writing unit tests using JUnit for software reliability.  
- Conducting code coverage analysis with JaCoCo.  
- Deploying and configuring Java EE applications with a database backend.  

---

## License  

This repository is shared for educational purposes only. Please do not plagiarize or submit any content as your own for academic or professional evaluations.  

# StudentManagementSystem-Application

COMPANY:CODTECH IT SOLUTIONS

NAME:PAGADALA BHAVANA

INTERN ID:CITS3043

DOMAIN:JAVA PROGRAMMING

DURATION:8 WEEKS

MENTOR:NEELA SANTOSH

DESCRIPTION:

The Student Management System is a web-based application developed using HTML, CSS, JavaScript, Java, JDBC, and MySQL to simplify the management of student information. The system provides an easy-to-use interface for administrators to perform essential student record management tasks such as adding new students, viewing student details, searching for students, updating existing records, and deleting records when necessary.

The frontend is built using HTML, CSS, and JavaScript, providing a responsive and user-friendly interface. The backend is implemented in Java, while JDBC (Java Database Connectivity) is used to establish communication between the application and the MySQL database. This enables secure storage and retrieval of student data.

The application includes a login page, a dashboard for navigation, an add student form, and a student records page where administrators can manage information efficiently. Input validation helps ensure that only valid data is entered into the system.

This project demonstrates fundamental concepts of full-stack Java development, including object-oriented programming, database connectivity, CRUD (Create, Read, Update, Delete) operations, and basic web development. It is suitable for educational institutions, training centers, and beginners learning Java web application development.

Overall, the Student Management System improves the efficiency of managing student records by replacing manual processes with a simple digital solution. It offers a practical learning experience in integrating frontend technologies with Java and MySQL while following a structured software development approach.

Overview

The Student Management System is a Java-based application that allows users to manage student records efficiently. It provides a simple web interface built with HTML, CSS, and JavaScript, while the backend is developed using Java and JDBC with a MySQL database.

Features

- Secure Login
- Dashboard
- Add Student
- View Student Records
- Search Students
- Update Student Information
- Delete Student Records
- MySQL Database Integration
- Responsive User Interface

Technologies Used

Frontend

- HTML5
- CSS3
- JavaScript

Backend

- Java
- JDBC (Java Database Connectivity)

Database

- MySQL

Development Tools

- Visual Studio Code or Eclipse IDE
- JDK 17 or later
- MySQL Server
- MySQL Connector/J (JDBC Driver)


Project Structure

StudentManagementSystem/
│
├── index.html
├── dashboard.html
├── add-student.html
├── students.html
├── style.css
├── script.js
│
├── src/
│   ├── Student.java
│   ├── DBConnection.java
│   ├── StudentDAO.java
│   └── Main.java
│
├── database.sql
└── README.md


Prerequisites

Before running the project, install:

- Java Development Kit (JDK 17 or later)
- MySQL Server
- MySQL Connector/J
- Visual Studio Code or Eclipse IDE

Setup Instructions

Step 1: Install Java

Verify the installation:

java -version
javac -version


Step 2: Create the Database

Open MySQL Workbench or the MySQL command line.

Run the SQL script:

SOURCE database.sql;

Or copy and execute the contents of "database.sql".


Step 3: Configure the Database Connection

Open "DBConnection.java" and update the connection details.

private static final String URL = "jdbc:mysql://localhost:3306/student_management";
private static final String USERNAME = "root";
private static final String PASSWORD = "your_mysql_password";

Replace "your_mysql_password" with your actual MySQL password.

Step 4: Add MySQL JDBC Driver

Download MySQL Connector/J and add the JAR file to your project's build path.


Build the Project

Using VS Code

Open the project folder.

Compile the Java files:

javac *.java

If your Java files are inside the "src" folder:

javac src/*.java

Run the Project

Run the Java application:

java Main

If compiled from the "src" folder:

java -cp src Main


Using the Website

1. Open "index.html" in your browser.
2. Log in using:
   - Username: "admin"
   - Password: "admin123"
3. After logging in, the dashboard will appear.
4. Add new students using the Add Student page.
5. View all students on the Students page.
6. Search for students by name.
7. Delete student records when needed.
8. Log out to return to the login page.


Project Modules

- Login
- Dashboard
- Add Student
- View Students
- Search Students
- Update Students
- Delete Students


Sample Database

Database Name:

student_management

Table Name:

students

Columns:

- id
- name
- email
- course


Future Enhancements

- Student Photo Upload
- Attendance Management
- Marks Management
- Result Management
- Admin Authentication
- Student Login
- Password Encryption
- PDF Report Generation
- Email Notifications
- Spring Boot Integration
- REST API Support


Troubleshooting

Database Connection Error

- Ensure MySQL Server is running.
- Verify the database name, username, and password.
- Confirm the MySQL Connector/J JAR is added to the project.

Java Compilation Error

- Verify JDK is installed correctly.
- Ensure "JAVA_HOME" is configured.
- Check that all Java source files are in the correct folder.

Web Pages Not Loading

OUTPUT:


- Make sure all HTML, CSS, and JavaScript files are in the same project directory.
- Verify file names match the references exactly.

Author

Pagadala Bhavana

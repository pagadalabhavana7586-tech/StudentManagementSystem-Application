-- Create Database
CREATE DATABASE IF NOT EXISTS student_management;

-- Select Database
USE student_management;

-- Create Students Table
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL
);

-- Sample Data
INSERT INTO students (id, name, email, course) VALUES
(101, 'Rahul Sharma', 'rahul@example.com', 'Computer Science'),
(102, 'Priya Reddy', 'priya@example.com', 'Information Technology'),
(103, 'Amit Kumar', 'amit@example.com', 'Electronics');

-- View Data
SELECT * FROM students;

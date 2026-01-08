 Project Overview
This project is a Java JDBC application that connects to a MySQL database and retrieves all student records from the students table.
The fetched data is displayed on the console using ResultSet.
This task simulates a real-world scenario where a Junior Java Developer Intern is required to work with database records.

🛠 Technologies Used
Java
JDBC (Java Database Connectivity)
MySQL
MySQL Connector/J
IDE:  IntelliJ 

📂 Database Details
Database Name: studentdb
Table Name: students
Table Structure
Column	Type
id	INT
name	VARCHAR
age	INT

✨ Features
Establish JDBC connection with MySQL
Retrieve all student records from database
Display student details using ResultSet
Uses PreparedStatement for query execution

⚙️ Prerequisites
Make sure the following are installed:
Java JDK
MySQL Server
MySQL Connector/J (JDBC Driver)
Basic understanding of Java & SQL

🚀 How the Program Works
Load MySQL JDBC Driver
Establish connection with database
Execute SELECT * FROM students query
Fetch records using ResultSet
Display student details on console
Close database connection

🧑‍💻 Sample Output
ID: 1 | Name: Sakshi | Age: 21
ID: 2 | Name: anjali | Age: 22
ID: 3 | Name: sayog | Age: 20

📂 Project Use Case
This project is helpful for:
JDBC beginners
College practicals & mini tasks
Understanding database connectivity in Java

✅ Conclusion
This repository demonstrates a simple and clean implementation of displaying all students using JDBC and MySQL, following best practices for database access in Java.

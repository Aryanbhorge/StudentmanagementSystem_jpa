# StudentmanagementSystem_jpa
Java Hibernatejpa:

The Student Management System is a console-based application built using hibernat jpae, JDBC, and PostgreSQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on Student records stored in a PostgreSQL database. The application is menu-driven, providing a simple and intuitive interface for managing Student data.

Features:
Add Student: Add a new Student record to the database.
Update Students: Update an existing Student's details (e.g., ID,firstname,lastname,Rollno, age).
Delete Student: Delete an Student record by ID.
Menu-Driven Interface: Easy-to-use console-based menu for seamless navigation.
Use Collectios For retrive all Student list.
Technologies Used:
JDBC (Java Database Connectivity): For connecting to and interacting with the PostgreSQL database.
PostgreSQL: For storing and managing student data.
Maven: For project dependency management and building the project.
Dependencies
The project uses the following dependencies:

PostgreSQL JDBC Driver: For connecting to the PostgreSQL database.
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>

 <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-platform</artifactId>
            <version>7.0.5.Final</version>
            <type>pom</type>
            <scope>import</scope>
 </dependency>

  <dependency>
    <groupId>jakarta.platform</groupId>
    <artifactId>jakarta.jakartaee-bom</artifactId>
    <version>11.0.0</version>
    <type>pom</type>
    <scope>import</scope>
  </dependency>
  
Prerequisites:

Before running the project, ensure you have the following installed:
Hibernate 7.0.5 final version.
Jakarta 11.0.0 version.
Java Development Kit (JDK) 17 or higher.
Apache Maven 3.8.6 or higher.
PostgreSQL 15 or higher.
create PostgreSQL database with the following table:
CREATE TABLE studentsdetails2(
    id SERIAL PRIMARY KEY,
    firstName varchar (25),
    lastName varchar(25),
    age INT NOT NULL   
);
Contact
For any questions or feedback, feel free to reach out:

Your Name : Aryan Bhorge
Email: bhorgearyan@gmail.com
GitHub: Aryanbhorge
Team Member:
Name:Gaurav Hingole
Email:gavravhingole@gmail.com
GitHub:Gaurav_Hingole
Name:Rupesh Bane
Email:banerupesh716@gmail.com
GitHub:Banerupesh1234
Name:Pankaj Khillare
Email:khillarepankaj436@gmail.com
GitHub:Khillarepankaj01
Enjoy using the Student Management System! 🚀
<img width="449" height="154" alt="image" src="https://github.com/user-attachments/assets/4e3304d8-341d-4e88-a9a8-428c391a43be" />



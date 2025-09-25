Library Management System (Java)
NAME : MULE LAKSHMI NARAYANAMMA

Objective
A simple Library Management System implemented in Java using Object-Oriented Programming (OOP) concepts. This project was created as part of the Java Developer Internship Task 3. The main goal is to design a mini-project that demonstrates real-world usage of OOP in managing books and users.

Features
Add Books: Admin (or system) can add new books with unique IDs, title, and author.
Add Users: Register users in the system with unique IDs.
Display Books: View all books along with their availability status.
Issue Books: Assign a book to a user if available, and update the status to "Issued".
Return Books: Users can return previously issued books, marking them as "Available" again.
Track Book Status: Each book shows whether it is currently available or issued.
OOP Concepts Demonstrated
Abstraction: The system hides internal details (like how books are stored) and exposes only methods like issueBook(), returnBook(), and displayBooks().
Encapsulation: All important fields (like id, title, author, and isAvailable) are private, with controlled access through methods. This protects data integrity.
Inheritance: The project is built to be extendable. For example, User can be subclassed into StudentUser or TeacherUser to implement different borrowing rules.
Polymorphism: Methods like toString() are overridden to provide meaningful outputs. More methods can be extended in subclasses, demonstrating runtime flexibility.
Technologies Used
Language: Java (JDK 8+)
IDE/Editor: VS Code / IntelliJ IDEA / Eclipse
Version Control: Git & GitHub
Execution: Runs on terminal/command prompt using javac and java.
Project Structure
Library-Management-System-Java/ │ ├── src/ │ ├── Book.java → Handles book details (ID, title, author, status) │ ├── User.java → Manages user details and issued books │ ├── Library.java → Core class that connects books and users (issue, return, display) │ └── Main.java → Entry point with menu-driven program for testing │ └── README.md

How to Run
Clone this repository: git clone https://github.com/your-username/Library-Management-System-Java.git cd Library-Management-System-Java

Compile the Java files: javac src/*.java

Run the program: java src/Main

Use the menu to:

Press 1 → Display books
Press 2 → Issue book (enter Book ID and User ID)
Press 3 → Return book (enter Book ID and User ID)
Press 4 → Exit the program
Outcome
By completing this project, you will:

Gain a solid understanding of OOP principles through practical implementation.
Learn how to manage multiple classes (Book, User, Library) and link them together in a real-world scenario.
Understand the importance of encapsulation to protect and manage data.
Experience building and running a Java project from scratch using the command line and GitHub for version control.
Possible Improvements
Persistence Layer: Save books and users in a text file, JSON, or database so data remains after program exit.
Search Feature: Allow users to search books by title, author, or availability.
Advanced User Types: Create different user categories (Student, Teacher, Guest) with specific book borrowing limits.
Exception Handling: Add better error messages for invalid inputs, duplicate IDs, or unavailable books.
Graphical Interface: Replace the console menu with a GUI (Swing/JavaFX) for a modern user experience.
Integration: Extend the project to connect with external systems (like APIs for eBooks or online catalogues).
OUTPUT :


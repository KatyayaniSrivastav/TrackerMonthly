📊 Monthly Expense Tracker (Java)

A simple Java-based Monthly Expense Tracker application that demonstrates core Java concepts such as OOP, Collections, Streams, Custom Exceptions, Multithreading, and Date/Time API.

This project helps users record expenses, sort them, and view monthly summaries while running a background backup thread.

🚀 Features

➕ Add expenses with category, amount, and date

❌ Prevents negative expense amounts using custom exception

📅 Monthly expense summary using Java Stream API

🔃 Sort expenses by amount

🧵 Background daemon thread for periodic backup simulation

📦 Clean modular project structure

🛠️ Technologies & Concepts Used

Java 8+

Object-Oriented Programming (OOP)

Java Collections (List, Map)

Stream API & Lambda Expressions

Custom Exception Handling

Multithreading (Thread, Daemon Thread)

Java Date & Time API (LocalDate, Month)

Java Modules (module-info.java)

📁 Project Structure
TrackerMonthly/
│
├── BackupThread.java
├── Expense.java
├── ExpenseManager.java
├── NegativeAmountException.java
├── TrackerApp.java
├── package-info.java
└── module-info.java

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/your-username/TrackerMonthly.git


Open the project in Eclipse / IntelliJ IDEA

Make sure you are using Java 8 or above

Run:

TrackerApp.java

🧪 Sample Output
2025-03-05 | Food | ₹250.0
2025-03-15 | Shopping | ₹800.0
2025-03-10 | Travel | ₹1200.0

--- Monthly Summary for MARCH ---
Food: ₹250.0
Shopping: ₹800.0
Travel: ₹1200.0

Backup completed....

🧠 Learning Outcomes

Understand how to structure a real-world Java project

Practical use of Streams & Collectors

How to create and handle custom exceptions

Using daemon threads for background tasks

Applying sorting and filtering with collections

📌 Future Enhancements

File-based or database storage

User input using Scanner

Monthly reports in PDF/CSV

GUI using JavaFX or Swing

REST API using Spring Boot

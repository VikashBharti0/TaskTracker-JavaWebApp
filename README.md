# 📝 TaskTracker - Java Web To-Do List App

TaskTracker is a full-stack **Java web application** that allows users to register, log in, and manage their daily tasks efficiently. Built using **Servlets**, **JSP**, **Bootstrap 5**, and **PostgreSQL**, it implements secure authentication and a user-friendly UI for task management.

---

## 🚀 Features

✅ User Registration and Login  
✅ Session-based Authentication  
✅ Add / Edit / Delete Tasks  
✅ Task Status Tracking (Pending / Completed)  
✅ Clean MVC Architecture  
✅ Responsive UI with Bootstrap  
✅ PostgreSQL Database Integration

---

## 🛠 Tech Stack

| Layer       | Technology              |
|-------------|--------------------------|
| Frontend    | HTML5, CSS3, Bootstrap 5 |
| Backend     | Java, JSP, Servlets      |
| Database    | PostgreSQL               |
| Build Tool  | Manual / (Maven optional)|
| Server      | Apache Tomcat            |
| IDE         | Eclipse                  |

---

## 📁 Project Structure

TaskTracker-JavaWebApp/
├── src/
│ └── todo/
│ ├── controller/ # Servlets
│ ├── DAO/ # Data Access Objects
│ ├── Entity/ # POJOs
├── WebContent/
│ ├── CSS/ # Stylesheets
│ ├── image/ # UI Images
│ ├── *.jsp # JSP Pages
├── .gitignore
├── README.md
├── DBUtil.java # Database connection utility
└── (Optional) pom.xml # If using Maven

yaml
Copy code

---

## 📸 Screenshots

> *(You can add actual screenshots here for better impact)*

![Login Page](screenshots/login.png)  
![Dashboard](screenshots/dashboard.png)

---

## ⚙️ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/TaskTracker-JavaWebApp.git
Import it into Eclipse as an existing project.

Set up PostgreSQL:

Create a new database (e.g. tasktracker)

Run SQL schema (you can provide .sql file)

Configure DB credentials in DBUtil.java

Deploy the project to Apache Tomcat

Access the app:

arduino
Copy code
http://localhost:8080/TaskTracker-JavaWebApp/
🧠 Learnings & Highlights
Built full-stack CRUD operations using pure Java Servlet-JSP

Implemented login system using HttpSession

Applied MVC architecture manually without frameworks

Learned DB integration with PostgreSQL using JDBC

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

📜 License
This project is licensed under the MIT License.

🔗 Connect with Me
🔗 LinkedIn

🐦 Twitter / X

💼 Portfolio (optional)

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

TaskTracker-JavaWebApp/ <br>
├── src/ <br>
│ └── todo/ <br>
│ ├── controller/ # Servlets  <br>
│ ├── DAO/ # Data Access Objects  <br>
│ ├── Entity/ # POJOs  <br>
├── WebContent/  <br>
│ ├── CSS/ # Stylesheets  <br>
│ ├── image/ # UI Images  <br>
│ ├── *.jsp # JSP Pages  <br>
├── .gitignore  <br>
├── README.md  <br>
├── DBUtil.java # Database connection utility  <br>
└── pom.xml # If using Maven  <br>

---

## 📸 Screenshots

> 
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/7bbad3fd-800c-477f-9342-57bf11476838" />
[Dashboard Page]
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/747941c8-4eec-4ff3-be6a-d2547fabcd40" />
[Register Page]
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/75b9ec02-1b75-4cd1-b81b-f4d4a4f20387" />
[Login Page]
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/c64a9a8e-c7ec-4789-a88c-a58392a9d798" />
[TODO Page]
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/000e90ac-a173-4af3-b7db-1a3afd2bbc1f" />
[Update Page]
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/7fe74cb2-5402-484b-b901-eabdc88ea2cb" />
[Add todo Page]
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

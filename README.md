<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>HRMatrix - Employee Management System</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 40px;
      background-color: #f5f7fa;
      color: #333;
    }
    .container {
      max-width: 900px;
      margin: auto;
      background: #fff;
      padding: 25px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    h1, h2 {
      color: #2c3e50;
    }
    pre {
      background: #222;
      color: #fff;
      padding: 10px;
      border-radius: 8px;
      overflow-x: auto;
    }
    ul {
      line-height: 1.8;
    }
    a {
      color: #3498db;
      text-decoration: none;
    }
  </style>
</head>

<body>
<div class="container">

<h1>🚀 HRMatrix - Employee Management System</h1>

<p>
A backend-based <b>Employee Management System</b> built using <b>Spring Boot</b>.
This project provides RESTful APIs to manage employee data including creating,
updating, retrieving, and deleting records.
</p>

<hr>

<h2>📌 Project Overview</h2>
<p>
This project follows a <b>layered architecture</b> using Spring Boot:
Controller → Service → Repository → Model.
It is designed to demonstrate clean backend development practices using Java.
</p>

<hr>

<h2>✨ Features</h2>
<ul>
  <li>➕ Add new employee</li>
  <li>📋 View all employees</li>
  <li>🔍 Get employee by ID</li>
  <li>✏️ Update employee details</li>
  <li>❌ Delete employee</li>
  <li>📦 REST API architecture</li>
</ul>

<hr>

<h2>🛠️ Tech Stack</h2>
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>Maven</li>
  <li>Lombok</li>
  <li>MySQL / H2 Database</li>
</ul>

<hr>

<h2>📁 Project Structure</h2>
<pre>
employee-management-system/
 ├── src/main/java/com/jeeva/registrationandloginusingspringboot/
 │   ├── Controller/
 │   │     └── EmployeeController.java
 │   ├── Service/
 │   ├── Repository/
 │   └── Model/
 │         └── Employee.java
 ├── resources/
 │   └── application.yml
 ├── pom.xml
</pre>

<hr>

<h2>📌 Employee Entity</h2>
<p>The Employee model contains the following fields:</p>

<ul>
  <li><b>id</b> (Primary Key)</li>
  <li><b>name</b></li>
  <li><b>email</b></li>
  <li><b>department</b></li>
</ul>

<hr>

<h2>🔗 API Endpoints</h2>
<ul>
  <li><b>GET</b> /employees → Get all employees</li>
  <li><b>GET</b> /employees/{id} → Get employee by ID</li>
  <li><b>POST</b> /employees → Create employee</li>
  <li><b>PUT</b> /employees/{id} → Update employee</li>
  <li><b>DELETE</b> /employees/{id} → Delete employee</li>
</ul>

<hr>

<h2>⚙️ Setup & Run</h2>

<h3>1. Clone Repository</h3>
<pre>
git clone https://github.com/Co0lboy/HRMatrix.git
cd HRMatrix/employee-management-system
</pre>

<h3>2. Configure Database</h3>
<pre>
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/employee_db
    username: root
    password: your_password
</pre>

<h3>3. Run Application</h3>
<pre>
./mvnw spring-boot:run
</pre>

<hr>

<h2>🧪 Testing</h2>
<p>
You can test APIs using:
<ul>
  <li>Postman</li>
  <li>cURL</li>
  <li>Browser (for GET requests)</li>
</ul>
</p>

<hr>

<h2>📌 Future Improvements</h2>
<ul>
  <li>🔐 Add authentication & login system</li>
  <li>🌐 Add frontend (React/Angular)</li>
  <li>📊 Add pagination & sorting</li>
  <li>📁 File upload support</li>
</ul>

<hr>

<h2>🙌 Author</h2>
<p>
<b>GitHub:</b> <a href="https://github.com/Co0lboy">Co0lboy</a>
</p>

<hr>

<h2>⭐ Contribution</h2>
<p>
Feel free to fork this repository and contribute to improve it!
</p>

</div>
</body>
</htm

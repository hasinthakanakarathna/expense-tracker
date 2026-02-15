# 💰 Expense Tracker Application

A full-stack Expense Tracking application built with **Java Spring Boot** and **Vanilla JavaScript**.
This project demonstrates a complete **RESTful API** implementation with persistent data storage and a responsive frontend interface.

## 🚀 Features

* **Dashboard:** View today's expenses and a real-time total calculation.
* **History View:** Separate page to view the entire expense history.
* **Persistent Storage:** Uses H2 Database (File-based) to save data permanently.
* **REST API:** Full CRUD operations (Create, Read, Delete).
* **Validation:** Smart frontend input validation with visual feedback.
* **Responsive Design:** CSS Flexbox layout that works on different screen sizes.

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot 3, Spring Data JPA
* **Database:** H2 Database (File Persistence Mode)
* **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API)
* **Build Tool:** Maven

## ⚙️ How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR_USERNAME/expense-tracker.git](https://github.com/YOUR_USERNAME/expense-tracker.git)
    ```
2.  **Navigate to the project folder:**
    ```bash
    cd expense-tracker
    ```
3.  **Run the application (Windows):**
    ```bash
    ./mvnw spring-boot:run
    ```
    *(Mac/Linux: `./mvnw spring-boot:run`)*

4.  **Open your browser:**
    Go to `http://localhost:8080`

## 📸 Screenshots
![My Expense Tracker Dashboard](screenshots/dashboard(frontend).png)

## 🔮 Future Improvements

* [ ] Add User Authentication (Login/Register).
* [ ] Migrate to MySQL for production database.
* [ ] Create visual charts (Pie charts) for expense categories.
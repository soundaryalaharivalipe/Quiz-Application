# Spring Boot Quiz Application

## Overview
The Spring Boot Quiz Application is a robust web-based platform designed for creating and taking quizzes. Built with Spring Boot and Thymeleaf, it offers a user-friendly environment for both quiz administrators and participants, promoting an interactive learning experience.

## Key Features
- **Dynamic Quiz Creation:** Administrators can design quizzes with customizable questions and multiple-choice answers.
- **Real-Time Results Processing:** The application automatically calculates scores and provides instant feedback to participants.
- **Secure User Authentication:** Integrated Spring Security ensures that access is controlled and data is protected.
- **Adaptive UI:** Thymeleaf templates render beautifully on both desktop and mobile devices.

## Technologies
- **Backend:** Spring Boot for the core application logic and RESTful services.
- **Frontend:** Thymeleaf for server-side rendering of HTML views.
- **Security:** Spring Security for authentication and authorization.
- **Database:** MySQL for persistent storage of user and quiz data.

## Getting Started
1. **Prerequisites:** Ensure Java 11 and Maven are installed on your system.
2. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/quiz-app-spring.git
3. Configure the database: Update **src/main/resources/application.properties** with your MySQL settings.
Build and run the application:
   ```bash
   mvn package
   java -jar target/quizapp-0.0.1-SNAPSHOT.jar

## How to Contribute

Contributors are welcome to enhance the functionalities, tackle bugs, and improve the documentation. If you have suggestions or improvements, submit a pull request or open an issue.



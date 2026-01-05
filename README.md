# Task 1 — Spring Boot Web Application (Controller + Thymeleaf)

## Project Overview
This project is a simple Spring Boot web application created as **Task 1**.  

It demonstrates:
- running a Spring Boot application locally,
- handling HTTP requests using a Controller,
- using query parameters (`@RequestParam`),
- rendering HTML with **Thymeleaf** templates,
- serving static resources (image from `/static`),
- testing endpoints in a browser and Postman.

---

## Technologies
- Java
- Spring Boot
- Spring Web
- Thymeleaf
- Maven
- IntelliJ IDEA

---

## How to Run the Application
### Option A — IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Open the main class:
   `FirstProjectJavaSpringApplication.java`
3. Click the green **Run** ▶ button.

---

## Verification
### Open in browser:
http://localhost:8080

### 📸 Screenshot — Application running in IntelliJ console:
[Application running in IntelliJ](screenshot_1.png)

---
## Project Structure

```text
src/
 └── main/
     ├── java/
     │    └── controller/
     │         ├── HelloController.java
     │         └── ApiController.java   
     │
     └── resources/
          ├── templates/
          │    └── greeting.html
          │
          └── static/
               └── images/
                    └── vistula.png

pom.xml
.gitignore
README.md
```

---

## Controllers and Endpoints
### 1) Home endpoint (GET /)
Purpose: returns a simple greeting message.
URL:
- GET http://localhost:8080/

Implementation (HelloController):
- Mapped with @GetMapping("/")
(Expected result: text response in browser)

📸 Screenshot — Browser response for /:
[Mapped with @GetMapping("/")](screenshot_1.png)

### 2) Greeting page (GET /greeting)
Purpose: renders a Thymeleaf HTML page greeting.html and displays a name.
URL examples:
- GET http://localhost:8080/greeting
- GET http://localhost:8080/greeting?name=Vistula

### Use case:
If the name parameter is not provided → default value is "World".
If provided → it displays the given name in the HTML.

Expected result:
- Browser displays: Hello, Vistula!

📸 Screenshot — Browser response for /greeting?name=Vistula:
[ Greeting page](screenshot2.png)

---

## Static Resources (Image)
The page greeting.html includes an image served from Spring Boot static resources
### Static image location
The image must be placed here:
- src/main/resources/static/images/vistula.png

Image reference inside the Thymeleaf template:
- <img th:src="@{/images/vistula.png}" width="600" height="600"/=>

Expected result:
- The image is visible under the greeting message.

📸 Screenshot — Greeting page with image visible:

---






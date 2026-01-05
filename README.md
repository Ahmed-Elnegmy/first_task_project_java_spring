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
[ Greeting page with image](screenshot_2.png)

---

## Postman Testing (HTTP Requests)
The application can be tested using Postman.

### Request #1 — Home endpoint
Method: GET

URL: http://localhost:8080/

**Description:**  
Returns a simple text greeting from the main controller.

📸 Screenshot — Postman GET /:
[Home endpoint using Postman](screenshot_3.png)

### Request #2 — Greeting endpoint
Method: GET

URL: http://localhost:8080/greeting?name=Vistula

**Description:**  
Returns a Thymeleaf-rendered HTML page displaying a personalized greeting.  
If no name parameter is provided, the default value Vistula is used.

📸 Screenshot — Postman GET /greeting:
[Greeting page using Postman](screenshot_4.png)

### Request #3 — API Endpoint (ApiController)
Method: GET

URL: http://localhost:8080/api/hello

**Description:**  
ApiController handles this endpoint and returns a plain text or JSON response.  
It demonstrates a basic REST-style API endpoint.

📸 Screenshot — Postman GET /:
[Hello from API Controller using Postman](screenshot_5.png)

---

## HTTP Methods Used
### This Task 1 application uses:
- GET — for retrieving a response and rendering a page

---

## Notes / Troubleshooting
## 404 on http://localhost:8080

- This happens if no controller mapping exists for /.
- Solution: add @GetMapping("/") in your controller.

## 500 error on /greeting

- Usually means the Thymeleaf template greeting.html is missing or has errors.
- Ensure it exists in: src/main/resources/templates/greeting.html

## Image not displaying

- Ensure the file exists here: src/main/resources/static/images/vistula.png
- And template uses: th:src="@{/images/vistula.png}"

--- 

## Author
### Student: Ahmed Elnegmy 74005 
## Task: Task 1 — Spring Boot Web App


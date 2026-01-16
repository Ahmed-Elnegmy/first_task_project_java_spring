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

## Verification
### Open in browser:
http://localhost:8080

### 📸 Screenshot — Application running in IntelliJ console:
<img width="520" height="193" alt="screenshot_1" src="https://github.com/user-attachments/assets/c1a088f4-66dd-4c4a-af8e-68e8ecec4497" />

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
<img width="882" height="655" alt="screenshot_2" src="https://github.com/user-attachments/assets/add3640c-50c9-4bc0-9e02-595c034bcca8" />

---

## Postman Testing (HTTP Requests)
The application can be tested using Postman.

### Request #1 — Home endpoint
Method: GET

URL: http://localhost:8080/

**Description:**  
Returns a simple text greeting from the main controller.

📸 Screenshot — Postman GET /:
<img width="1907" height="883" alt="screenshot_3" src="https://github.com/user-attachments/assets/b1c7651d-ce93-4507-a230-313095dde079" />

### Request #3 — API Endpoint (ApiController)
Method: GET

URL: http://localhost:8080/api/hello

**Description:**  
ApiController handles this endpoint and returns a plain text or JSON response.  
It demonstrates a basic REST-style API endpoint.

📸 Screenshot — Postman GET /:
<img width="1828" height="837" alt="screenshot_5" src="https://github.com/user-attachments/assets/424b5be5-f843-48b1-8614-13e382f81d5c" />

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

### Ahmed Elnegmy 74005 
## Task: Task 1 — Spring Boot Web App


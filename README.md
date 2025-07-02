
# Spring Boot RESTful API with Swagger

This project is a simple layered **Spring Boot REST API** for managing customer data. It is designed as a **training exercise for i2i Academy (SWAGGER-EX-04)**, demonstrating CRUD operations and integration with **Swagger UI (OpenAPI 3.0)** using `springdoc-openapi`.

---

## 📌 Features

- ✅ Create a new customer
- ✅ Retrieve a customer by ID
- ✅ Retrieve all customers
- ✅ Update an existing customer
- ✅ Delete a customer
- ✅ Swagger UI documentation with live testing
- ✅ Uses in-memory storage (`HashMap`) – no database required

---

## 🧠 Technologies Used

- Java 17
- Spring Boot 3.1.x
- Spring Web
- Spring Validation
- Swagger / OpenAPI (`springdoc-openapi-starter-webmvc-ui`)

---

## 🚀 How to Run

1. **Clone the project**:
   ```bash
   git clone https://github.com/your-username/Springboot_RESTful_API_with_Swagger.git
   cd Springboot_RESTful_API_with_Swagger
   ```
	2.	Build and run:

mvn clean install
mvn spring-boot:run


	3.	Access Swagger UI:
 ```
http://localhost:8081/swagger-ui.html
 ```
⸻

🔄 Sample Customer JSON

```
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```
⸻

📸 Screenshots

✅ Swagger UI with Endpoints

Screenshot shows all 5 CRUD operations and schema loaded via OpenAPI 3.0.

⸻

📝 Author

Atena Jafari Parsa
Intern at i2i Systems


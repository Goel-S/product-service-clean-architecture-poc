# Product Service – Clean Architecture POC

This repository is an **Architect-level Proof of Concept (POC)** demonstrating how to build a **Spring Boot microservice using Clean / Hexagonal Architecture principles**.

## 🎯 Purpose
- Showcase **architectural thinking**, not just CRUD code
- Demonstrate **Clean Architecture / Ports & Adapters**
- Serve as a **reference POC** for Java Architects and Senior Engineers

## 🏗 Architecture Overview

**Architecture Style:**  
- Clean Architecture (Hexagonal / Ports & Adapters)

**Layers:**
- **Domain** – Core business entities & rules
- **Application** – Use cases (business workflows)
- **Adapters (Inbound)** – REST Controllers
- **Adapters (Outbound)** – JPA / Database integration

No framework dependency leaks into the domain layer.

## 📂 Project Structure

```
product-service
├── domain
│   ├── Product.java
│   └── ProductRepository.java
│
├── application
│   ├── CreateProductUseCase.java
│   ├── GetProductUseCase.java
│   └── ProductService.java
│
├── adapter
│   ├── in
│   │   └── ProductController.java
│   └── out
│       └── ProductJpaRepository.java
│
└── ProductServiceApplication.java
```

## 🚀 Tech Stack
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 (In-memory DB)
- Maven

## 🧪 How to Run
```bash
./mvnw spring-boot:run
```

## 🔗 API Example
**Create Product**
```
POST /products?name=Phone&price=999
```

## 📐 Architecture Docs
- C4 Diagrams included
- ADR-001: Clean Architecture decision

## 🧠 Why This POC Is Different
- Not tutorial-based
- Explicit separation of business logic
- Architecture-first approach
- Resume & interview ready

## 👤 Author
**Shivendra Goel**  
Senior Java / Microservices Architect

---

⭐ If you find this useful, please star the repo!

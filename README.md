# Product Service – Clean Architecture POC

![GitHub stars](https://img.shields.io/github/stars/Goel-S/product-service-clean-architecture-poc)
![License](https://img.shields.io/github/license/Goel-S/product-service-clean-architecture-poc)

This repository is an **Architect-level Proof of Concept (POC)** demonstrating how to build a **Spring Boot microservice using Clean / Hexagonal Architecture (Ports & Adapters)** principles.

---

## 📌 Table of Contents
- Purpose
- Architecture Overview
- Project Structure
- Tech Stack
- API Endpoints
- How to Run
- Architecture Documentation
- Why This POC Is Different
- License

---

## 🎯 Purpose
- Showcase **architectural thinking**, not just CRUD implementation
- Demonstrate **Clean Architecture / Hexagonal Architecture**
- Act as a **portfolio-ready POC** for Java Architects & Senior Engineers

---

## 🏗 Architecture Overview

**Architecture Style:**  
Clean Architecture (Hexagonal / Ports & Adapters)

**Key Principles Applied:**
- Business logic isolated from frameworks
- Inbound & outbound adapters
- Dependency inversion at architecture level

---

## 📂 Project Structure (Complete)

```
product-service-clean-architecture-poc
└── src
    └── main
        └── java/com/example/product_service
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
            │   │   ├── ProductController.java
            │   │   └── CreateProductRequest.java
            │   └── out
            │       ├── ProductJpaRepository.java
            │       └── SpringDataProductRepository.java
            │
            └── ProductServiceApplication.java
```

👉 `CreateProductRequest.java` is an **Inbound DTO**, intentionally placed in adapter layer to avoid domain pollution.

---

## 🚀 Tech Stack
- Java 17 (LTS)
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven (with Maven Wrapper)

---

## 🔗 API Endpoints

### Create Product
```
POST /products
```

```json
{
  "name": "iPhone 15",
  "price": 79999
}
```

### Get Products
```
GET /products
```

---

## 🧪 How to Run

```bash
./mvnw spring-boot:run
```

---

## 📐 Architecture Documentation
- C4 Architecture Diagrams (PDF)
- ADR-001: Clean Architecture decision

---

## 🧠 Why This POC Is Different
- Architecture-first
- Clean boundaries  
- Real-world extensible design

---

## 👤 Author
**Shivendra Goel**

---

## 📄 License
MIT License

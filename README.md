# 🏰 Restaurant Halls Management Service

> A powerful Spring Boot microservice for managing restaurant halls and their capacity with style! ✨

## 🎯 Service Overview
Streamline your restaurant's hall management with this robust microservice that handles everything from hall creation to capacity tracking!

## ⚡ Key Features

### 🏠 Hall Management
- **Create Halls** 
  - Set up new dining areas
  - Define capacity limits
  - Assign unique names

- **Smart Queries**
  - Fetch specific hall details
  - List all available halls
  - Get detailed table layouts

### 🔄 Operations
- **Real-time Updates**
  - Modify hall configurations
  - Update capacity settings
  - Edit hall information

- **Space Organization**
  - Track hall capacity
  - Monitor seating availability
  - Optimize space usage

## 🛠️ API Endpoints

### 📡 Available Routes
```
POST   /halls/create       → Create new hall
GET    /halls/bring_all    → List all halls
GET    /halls/bringHall/id → Get specific hall
PUT    /halls/edit/id      → Update hall details
DELETE /halls/delete/id    → Remove hall
GET    /halls/tables/id    → Get hall tables
```

### 🎨 Data Structure
```json
{
  "idHalls": "long",
  "name": "string",
  "capacity": "integer"
}
```

## ✨ Special Features
- 🔍 Service Discovery Integration
- 🌐 Microservice Architecture
- 🤝 Feign Client Support
- 🔄 RESTful Operations
- 📊 DTO Pattern Implementation

## 🚀 Technology Stack
- **Spring Boot** - Robust backend framework
- **Spring Cloud** - Microservice support
- **JPA/Hibernate** - Data persistence
- **RESTful APIs** - Service communication
- **Feign Client** - Service interaction

---
*Powering smart restaurant management, one hall at a time! 🌟*
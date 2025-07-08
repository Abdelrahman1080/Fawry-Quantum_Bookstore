# 📚 Book Delivery System

A modular and extensible Java application that simulates purchasing and delivering different types of books (PaperBooks, EBooks, ShowcaseBooks). Designed with **Clean Architecture** principles and leverages **well-known design patterns** such as:

- 🏭 **Factory Pattern**
- 🤝 **Strategy Pattern**
- 🧩 **Template Method Pattern**
- 🔄 **Polymorphism & Abstraction**

---

## 🔧 System Overview

This system supports:

- Selling **paper books** with stock management and physical shipping
- Selling **e-books** with file format handling and email delivery
- Handling **non-sale showcase books**
- Dynamically selecting the correct **purchase handler** at runtime
- Plug-and-play delivery mechanisms

---

## 🧠 Design Patterns Used

| Pattern | Usage |
|--------|-------|
| **Factory Pattern** | `PurchaseHandlerFactory` encapsulates object creation logic for purchase handlers. |
| **Strategy Pattern** | Each handler (`PaperBookPurchaseHandler`, `EBookPurchaseHandler`) encapsulates a strategy for purchasing and delivering. |
| **Template Method** *(via abstract class)* | `Book` abstract class provides partial implementation for shared behavior, while subclasses define specific sale conditions. |
| **Interface Segregation & Polymorphism** | `Product` and `DeliveryService` allow extensibility without changing client code. |

---

Output of a various Test cases
![image](https://github.com/user-attachments/assets/af197d88-8ab1-4ef3-8685-70edab6c537e)





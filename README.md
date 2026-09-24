# Java Core & OOP Programming: Intermediate Exercises & Systems `[Computer Programming with Java Assignment]` `[part 2]`
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Level: Intermediate](https://img.shields.io/badge/Level-Intermediate-orange)

> A structured collection of **intermediate `Java programming assignments`** focusing on **2D array data processing**, **Object-Oriented design patterns** (`interfaces`, `inheritance`, `composition`), **method overloading**, and **console-based management software**.
---

## Exercises Breakdown:
### **Exercise 1: [Mayoral Election Statistics](<./1. Mayoral Election Statistics/>)**
* **File:** `App1.java`
* **Description:** Parses election metrics across five polling districts and three candidates using a $5 \times 3$ two-dimensional array. Computes total vote tallies, calculates percentage shares formatted to two decimal places, evaluates outright victory conditions (>50%), or extracts the top two candidates for a runoff ballot.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./1. Mayoral Election Statistics/assignment.pdf>)
---
### **Exercise 2: [Shape Interface Implementation](<./2. Shape Interface Implementation/>)**
* **File:** `App2.java`
* **Description:** Demonstrates contract-based programming using an interface (`Shape1`) defining a constant color property and an abstract `area()` contract. Implemented by `Rectangle1` with private dimensions, constructor encapsulation, area calculation, and an overridden `toString()` method.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./2. Shape Interface Implementation/assignment.pdf>)
---  
### **Exercise 3: [Method Overloading - Calculator Class](<./3. Method Overloading - Calculator Class/>)**
* **File:** `App3.java`
* **Description:** Implements compile-time polymorphism (**method overloading**) in a `Calculator` class. Provides distinct `add()` implementations handling *two integers*, *three integers*, *two double-precision floats*, and *variable-length integer arrays* via enhanced `for-each` traversal.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./3. Method Overloading - Calculator Class/assignment.pdf>)
---
### **Exercise 4: [Book & Author Classes - Object Composition](<./4. Book & Author Classes - Object Composition/>)**
* **File:** `App4.java`
* **Description:** Illustrates object composition (*has-a* relationship) by embedding an `Author` object within a `Book` instance. Features custom (parameterized) constructors, encapsulated state variables, and cascading `toString()` string representations.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./4. Book & Author Classes - Object Composition/assignment.pdf>)
---
### **Exercise 5: [Shape Hierarchy & Class Inheritance](<./5. Shape Hierarchy & Inheritance - OOP/>)**
* **File:** `App5.java`
* **Description:** Demonstrates class inheritance (*is-a* relationship) by extending a base class `Shape` into `Rectangle` and `Triangle` subclasses. Utilizes `super()` constructor delegation, specialized geometric calculations (calculating areas) (`area()`), and polymorphic `toString()` property formatting (overriding display behaviors).
* **Documentation:** [📄 Assignment Prompt (PDF)](<./5. Shape Hierarchy & Inheritance - OOP/assignment.pdf>)
---
### **Exercise 6: [Date registrations & Customer Classes - Object Composition](<./6. Date registrations & Customer Classes - Object Composition/>)**
* **Files:** `myDate.java`, `Customer.java`
* **Description:** Establishes data encapsulation and domain modeling. Implements a calendar date record (`myDate`) with day/month/year fields and a `Customer` class containing private client metadata alongside an embedded `myDate` registration instance.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./6. Date registrations & Customer Classes - Object Composition/assignment.pdf>)
---
### **Exercise 7: [Customer Management System - Array Based Custom List Collection](<./7. Customer Management System - Array Based Custom List Collection - implementation/>)**
* **File:** `CustomerList.java`
* **Description:** Implements an in-memory data store using a fixed-capacity 1D array (`Customer[50]`). Features record insertion with boundary safety (`InsertCustomer`), sequential search by customer code (`LookupCustomer`), and formatted batch listing (`DisplayList`).
* **Documentation:** [📄 Assignment Prompt (PDF)](<./7. Customer Management System - Array Based Custom List Collection - implementation/assignment.pdf>)
---
### **Exercise 8: [Interactive Application Customer Management CLI](<./8. Interactive Application Customer Management CLI/>)**
* **File:** `App6.java`
* **Description:** A console-driven management application linking `Customer`, `myDate`, and `CustomerList`. Uses a `Scanner` input loop to interactively register new customers, search records by identifier, and display the stored database.
* **Documentation:** [📄 Assignment Prompt (PDF)](<./8. Interactive Application Customer Management CLI/assignment.pdf>)
---
## Repository Structure

```text
.
├── 1. Mayoral Election Statistics/
│   ├── App1.java
│   └── assignment.pdf
├── 2. Shape Interface Implementation/
│   ├── App2.java
│   └── assignment.pdf
├── 3. 3. Method Overloading - Calculator Class/
│   ├── App3.java
│   └── assignment.pdf
├── 4. Book & Author Classes - Object Composition/
│   ├── App4.java
│   └── assignment.pdf
├── 5. Shape Hierarchy & Inheritance - OOP/
│   ├── App5.java
│   └── assignment.pdf
├── 6. Date registrations & Customer Classes - Object Composition/
│   ├── Customer.java
│   ├── myDate.java
│   └── assignment.pdf
├── 7. Customer Management System - Array Based Custom List Collection - implementation/
│   ├── CustomerList.java
│   └── assignment.pdf
├── 8. Interactive Application Customer Management CLI/
│   ├── App6.java
│   └── assignment.pdf
├── LICENSE
└── README.md
```
---
# 👤 Author
## **Athanasios Gourdomichalis** - [GitHub Profile](https://github.com/AthanasiosGourdomichalis)

---

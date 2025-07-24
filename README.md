# 🏨 Hotel Management System (OOP)

A comprehensive Object-Oriented Programming project implementing a hotel management system in Java. This console-based application demonstrates core OOP principles including inheritance, polymorphism, encapsulation, and interface implementation.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Class Diagram](#class-diagram)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [OOP Concepts Demonstrated](#oop-concepts-demonstrated)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)

## 🎯 Overview

This hotel management system allows administrators to manage hotel operations including room configuration, employee management, room assignments, and salary calculations. The system is built using Java and follows Object-Oriented Programming principles with a clean, modular architecture.

## ✨ Features

### 🏠 Room Management
- **Create Rooms**: Add new rooms with unique IDs and names
- **Room Configuration**: Configure room details and properties
- **Room Assignment**: Assign rooms to employees for management

### 👥 Employee Management
- **Multiple Employee Types**:
  - **Labor** (Salary Rate: 1x per room)
  - **Receptionist** (Fixed salary structure)
  - **Manager** (Salary Rate: 3x per room)
  - **Boss** (No salary calculation)
- **Employee Registration**: Add new employees with unique IDs
- **Employee Assignment**: Assign multiple rooms to employees

### 💰 Salary Management
- **Dynamic Salary Calculation**: Calculate salaries based on employee type and room assignments
- **Role-based Pay Structure**: Different salary rates for different employee types
- **Room-based Compensation**: Salary calculation based on number of rooms managed

### 📊 Reporting
- **Employee Room Lists**: View all rooms assigned to a specific employee
- **Salary Reports**: Calculate and display employee salaries
- **System Overview**: Complete hotel management dashboard

## 📁 Project Structure

```
src/
├── App.java                    # Main application entry point
├── employee/
│   ├── Employee.java          # Abstract base class for all employees
│   ├── Labor.java             # Labor employee implementation
│   ├── Receptionist.java      # Receptionist employee implementation
│   ├── Manager.java           # Manager employee implementation
│   ├── Boss.java              # Boss employee implementation
│   └── EmployeeManagement.java # Employee management operations
├── hotel/
│   ├── Hotel.java             # Main hotel class
│   └── Room.java              # Room entity class
└── management/
    ├── Assignment.java        # Interface for room assignment
    └── Salary.java            # Interface for salary calculation
```

## 🏗️ Class Diagram

### Core Classes

**Hotel Class**
- Manages hotel information and room collections
- Uses HashMap for efficient room lookup

**Employee Hierarchy**
- `Employee` (Abstract): Base class with common properties
- `Labor`: Inherits from Employee, implements Salary
- `Receptionist`: Inherits from Employee, implements Salary  
- `Manager`: Inherits from Employee, implements Salary
- `Boss`: Inherits from Employee (no salary interface)

**Management Interfaces**
- `Salary`: Defines salary calculation contract
- `Assignment`: Defines room assignment operations

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/tuananhngwmoobx/hotel-management-oop.git
   ```

2. **Navigate to project directory**
   ```bash
   cd hotel-management-oop
   ```

3. **Compile the project**
   ```bash
   javac -d bin src/**/*.java
   ```

4. **Run the application**
   ```bash
   java -cp bin App
   ```

## 🖥️ Usage

### Main Menu Options

```
-----------------------------------------------------
--------------------Hotel Management-----------------
-----------------------------------------------------
1. Configure room.
2. Configure employee.
3. Assign room to employee.
4. Get list of rooms by employee.
5. Calculate salary of employee.
6. Exit !
```

### Example Workflow

1. **Create Rooms**
   - Select option 1
   - Enter unique room ID and name
   - Room is added to hotel system

2. **Add Employees**
   - Select option 2
   - Choose employee type (Labor/Receptionist/Manager/Boss)
   - Enter employee details

3. **Assign Rooms**
   - Select option 3
   - Enter room ID and employee ID
   - Room is assigned to employee

4. **View Assignments**
   - Select option 4
   - Enter employee ID to view assigned rooms

5. **Calculate Salary**
   - Select option 5
   - Enter employee ID to calculate salary

## 🎓 OOP Concepts Demonstrated

### 1. **Inheritance**
- `Employee` serves as base class
- `Labor`, `Receptionist`, `Manager`, `Boss` inherit from `Employee`
- Code reusability and hierarchical organization

### 2. **Polymorphism**
- Different salary calculation methods for each employee type
- Interface implementation with different behaviors

### 3. **Encapsulation**
- Private fields with public getter/setter methods
- Data hiding and controlled access

### 4. **Abstraction**
- `Employee` abstract class defines common structure
- `Salary` and `Assignment` interfaces define contracts

### 5. **Interface Implementation**
- `Salary` interface for consistent salary calculation
- `Assignment` interface for room assignment operations

## 🛠️ Technologies Used

- **Language**: Java
- **Paradigm**: Object-Oriented Programming
- **Data Structures**: HashMap, LinkedList
- **Design Patterns**: Strategy Pattern (Salary calculation)

## 💡 Key Features

- **Exception Handling**: Robust error handling for invalid operations
- **Data Validation**: Input validation for IDs and employee types
- **Efficient Lookup**: HashMap implementation for O(1) room/employee lookup
- **Scalable Design**: Easy to extend with new employee types or features

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👨‍💻 Author

**Tuan Anh**
- GitHub: [@tuananhngwmoobx](https://github.com/tuananhngwmoobx)
- Project: [Hotel Management OOP](https://github.com/tuananhngwmoobx/hotel-management-oop)

---

⭐ **If you found this project helpful, please give it a star!** ⭐

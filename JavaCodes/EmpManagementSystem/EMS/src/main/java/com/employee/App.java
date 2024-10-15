package com.employee;

import com.employee.controller.EmployeeController;
import com.employee.dto.EmployeeDTO;

public class App {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();

        // Adding Employees
        EmployeeDTO emp1 = new EmployeeDTO(1, "John", 30, "HR");
        EmployeeDTO emp2 = new EmployeeDTO(2, "Alice", 25, "IT");

        controller.addEmployee(emp1);
        controller.addEmployee(emp2);

        // Display all employees with salary
        controller.displayAllEmployees();
    }
}

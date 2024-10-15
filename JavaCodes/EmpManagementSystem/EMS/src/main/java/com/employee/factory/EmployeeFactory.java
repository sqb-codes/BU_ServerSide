package com.employee.factory;

import com.employee.model.Employee;

public class EmployeeFactory {

    public static Employee createEmployee(String type, String name, String role, double salary) {
        if ("full-time".equalsIgnoreCase(type)) {
            return new Employee(0, name, role, salary);
        } else if ("part-time".equalsIgnoreCase(type)) {
            // Custom logic for part-time employee
        }
        return null;
    }
}

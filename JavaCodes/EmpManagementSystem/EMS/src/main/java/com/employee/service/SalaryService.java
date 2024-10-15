package com.employee.service;

import com.employee.dto.EmployeeDTO;

public class SalaryService {
    public double calculateSalary(EmployeeDTO employee) {
        // Dummy calculation based on age (just for demonstration)
        return employee.getAge() * 1000.0;
    }
}

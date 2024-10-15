package com.employee.controller;

import com.employee.dao.EmployeeDAOImpl;
import com.employee.dto.EmployeeDTO;
import com.employee.dao.EmployeeDAO;
import com.employee.service.SalaryService;

import java.util.List;

public class EmployeeController {

    private EmployeeDAO employeeDAO;
    private SalaryService salaryService;

    public EmployeeController() {
        employeeDAO = new EmployeeDAOImpl();
        salaryService = new SalaryService();
    }

    public void addEmployee(EmployeeDTO employee) {
        employeeDAO.addEmployee(employee);
    }

    public void displayAllEmployees() {
        List<EmployeeDTO> employees = employeeDAO.getAllEmployees();
        for (EmployeeDTO employee : employees) {
            double salary = salaryService.calculateSalary(employee);
            System.out.println("Employee: " + employee.getName() + " | Salary: " + salary);
        }
    }

    public EmployeeDTO getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
}

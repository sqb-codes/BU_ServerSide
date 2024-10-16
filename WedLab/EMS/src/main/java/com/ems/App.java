package com.ems;

import com.ems.controller.EmployeeController;
import com.ems.dto.EmployeeDTO;

public class App {
    public static void main(String[] args) {
        EmployeeController empController = new EmployeeController();
        EmployeeDTO emp_1 = new EmployeeDTO(101, "John", "IT", 45000);
        empController.addNewEmployee(emp_1);
    }
}

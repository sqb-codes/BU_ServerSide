package com.ems;

import com.ems.controller.EmployeeController;
import com.ems.dto.EmployeeDTO;

public class App {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        EmployeeDTO emp_1 = new EmployeeDTO(101, "John", 56000, "IT");

        controller.addNewEmp(emp_1);

    }
}

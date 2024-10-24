package com.ems;

import com.ems.controller.EmployeeController;
import com.ems.dto.EmployeeDTO;

import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws IOException, SQLException {
        EmployeeController empController = new EmployeeController();
        EmployeeDTO emp_1 = new EmployeeDTO(102, "Max", "HR", 45000);
        empController.addNewEmployee(emp_1);
    }
}

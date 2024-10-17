package com.ems;

import com.ems.config.DatabaseConnection;
import com.ems.controller.EmployeeController;
import com.ems.dto.EmployeeDTO;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        EmployeeController employeeController = new EmployeeController();
        EmployeeDTO empDto = new EmployeeDTO(101, "John", 45000, "IT");
        employeeController.addNewEmp(empDto);

        DatabaseConnection.getConnection();

    }
}

package com.ems.controller;

import com.ems.dao.EmployeeDAOImpl;
import com.ems.dto.EmployeeDTO;

import java.io.IOException;
import java.sql.SQLException;

public class EmployeeController {
    public void addNewEmployee(EmployeeDTO empDTO) throws IOException, SQLException {
        EmployeeDAOImpl empDao = new EmployeeDAOImpl();
        empDao.addNewEmp(empDTO);
    }

    public void showAllEmployees() {

    }

    public void deleteEmpById() {

    }

    public void updateEmpById() {

    }
}

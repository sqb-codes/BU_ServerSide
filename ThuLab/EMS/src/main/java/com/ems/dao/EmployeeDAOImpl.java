package com.ems.dao;

import com.ems.config.DatabaseConnection;
import com.ems.dto.EmployeeDTO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO{
    private Connection connection;
    public EmployeeDAOImpl() throws IOException {
        this.connection = DatabaseConnection.getConnection();
    }

    @Override
    public void addNewEmp(EmployeeDTO employeeDTO) throws SQLException {
        String query = "insert into employees (emp_id, emp_name, emp_salary, emp_dept) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, employeeDTO.getEmpId());
        statement.setString(2, employeeDTO.getEmpName());
        statement.setDouble(3, employeeDTO.getEmpSalary());
        statement.setString(4, employeeDTO.getEmpDept());
        statement.executeUpdate();
        System.out.println("Data Inserted Successfully...");
    }

    @Override
    public void showAllEmp() {

    }

    @Override
    public void getEmpById() {

    }

    @Override
    public void deleteEmpById() {

    }

    @Override
    public void updateEmpById() {

    }
}

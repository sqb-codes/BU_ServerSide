package com.employee.dao;

import com.employee.config.DatabaseConnection;
import com.employee.dto.EmployeeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private Connection connection;

    public EmployeeDAOImpl() {
        this.connection = DatabaseConnection.getConnection();
    }

    @Override
    public void addEmployee(EmployeeDTO employee) {
        try {
            String query = "INSERT INTO employee (name, age, department) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, employee.getName());
            ps.setInt(2, employee.getAge());
            ps.setString(3, employee.getDepartment());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            String query = "DELETE FROM employee WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public EmployeeDTO getEmployee(int id) {
        EmployeeDTO employee = null;
        try {
            String query = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employee = new EmployeeDTO(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> employees = new ArrayList<>();
        try {
            String query = "SELECT * FROM employee";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EmployeeDTO employee = new EmployeeDTO(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("department"));
                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}


package com.ems.dao;

import com.ems.config.DatabaseConnection;
import com.ems.dto.EmpDTO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAOImpl implements EmpDAO {

    private Connection connection;

    public EmpDAOImpl() throws IOException {
        this.connection = DatabaseConnection.getConnection();
    }

    @Override
    public void addNewEmp(EmpDTO empDTO) {
        String query = "INSERT INTO employees values (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, empDTO.getEmpId());
            ps.setString(2, empDTO.getEmpName());
            ps.setDouble(3, empDTO.getEmpSalary());
            ps.setString(4, empDTO.getEmpDept());
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteEmp() {

    }

    @Override
    public void updateEmp() {

    }

    @Override
    public void showAllEmp() {

    }
}

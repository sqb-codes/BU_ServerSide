package com.ems.dao;

import com.ems.dto.EmployeeDTO;

import java.sql.SQLException;

public interface EmployeeDAO {
    void addNewEmp(EmployeeDTO employeeDTO) throws SQLException;
    void showAllEmp();
    void getEmpById();
    void deleteEmpById();
    void updateEmpById();
}

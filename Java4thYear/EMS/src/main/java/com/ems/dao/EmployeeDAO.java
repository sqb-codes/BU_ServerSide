package com.ems.dao;

import com.ems.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(EmployeeDTO empDTO);
    void deleteEmployee(int id);
    EmployeeDTO getEmployee(int id);
    List<EmployeeDTO> getAllEmployees();
}

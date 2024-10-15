package com.employee.dao;

import com.employee.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(EmployeeDTO employee);
    void deleteEmployee(int id);
    EmployeeDTO getEmployee(int id);
    List<EmployeeDTO> getAllEmployees();
}

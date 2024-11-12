package com.ems.controller;

import com.ems.dao.EmpDAOImpl;
import com.ems.dto.EmpDTO;

import java.io.IOException;

public class EmpController {
    EmpDAOImpl empDAO;

    public EmpController() throws IOException {
        this.empDAO = new EmpDAOImpl();
    }

    public void addEmp(EmpDTO empDTO) {
        empDAO.addNewEmp(empDTO);
    }

    public void deleteEmpById() {
        empDAO.deleteEmp();
    }

    public void updateEmpById() {
        empDAO.deleteEmp();
    }
}

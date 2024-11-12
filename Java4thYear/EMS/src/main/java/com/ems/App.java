package com.ems;

import com.ems.controller.EmpController;
import com.ems.dto.EmpDTO;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        EmpController empController = new EmpController();
        EmpDTO empDTO = new EmpDTO(102, "Sam", 50000, "IT");
        empController.addEmp(empDTO);
//        empController.deleteEmpById(101);
//        empController.updateEmpById();
    }
}

package com.ems.dao;

import com.ems.dto.EmpDTO;

public interface EmpDAO {
    public void addNewEmp(EmpDTO empDTO);
    public void deleteEmp();
    public void updateEmp();
    public void showAllEmp();
}

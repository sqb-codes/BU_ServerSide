package OOPS.EmpSalarySlip;

// Encapsulation - wrapping of variables and methods into one single class
// Data Hiding - make variables private and methods public
// Good Encapsulation - Encapsulation + Data Hiding

// POJO - Plain Old Java Object
// SRP - Single Responsibility Principle


class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private String empDept;
    public String companyName;

    // Default Constructor
    Employee() {
        this.companyName = "TCS";
    }

    // Parameterized constructor
    Employee(int empId, String empName, double empSalary, String empDept) {
        this();  // it will call default constructor - constructor chaining
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return this.empId + "," + this.empName + "," + this.empSalary + "," + this.empDept;
    }

}
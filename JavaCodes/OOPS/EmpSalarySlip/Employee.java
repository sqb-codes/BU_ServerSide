package OOPS.EmpSalarySlip;

// Encapsulation - wrapping of variables and methods into one single class
// Data Hiding - make variables private and methods public
// Good Encapsulation - Encapsulation + Data Hiding

// POJO - Plain Old Java Object
// Beans
// SRP - Single Responsibility Principle


class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private String empDept;
    public String companyName;
    private double hra;
    private double ta;
    private double ma;
    private double tds;
    private double pf;

    // Dependency Injection
    Formatting format;

    // Default Constructor
    Employee() {
        this.companyName = "TCS";
        this.hra = 0.15;
        this.ta = 0.05;
        this.ma = 0.05;
        this.tds = 0.10;
        this.pf = 0.02;
        format = new Formatting();
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

    private double calculateHRA() {
        return this.empSalary * this.hra;
    }

    private double calculateTA() {
        return this.empSalary * this.ta;
    }

    private double calculateMA() {
        return this.empSalary * this.ma;
    }

    private double calculateTDS() {
        return this.empSalary * this.tds;
    }

    private double calculatePF() {
        return this.empSalary * this.pf;
    }

    private double calculateSalary() {
        double earnings = this.empSalary + calculateHRA() + calculateMA() + calculateTA();
        double deductions = calculatePF() + calculateTDS();
        double netSalary = earnings - deductions;
        return netSalary;
    }

    @Override
    public String toString() {
        this.empSalary = calculateSalary();
        this.empName = format.formatName(this.empName);
        return this.empId + "," + this.empName + "," + this.empSalary + "," + this.empDept;
    }

}
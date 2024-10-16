package OOPS.EmpSalarySlip;

public class EmpCaller {
    public static void main(String[] args) {
        Employee emp_1 = new Employee(101, "john smith", 56000, "IT");
        // System.out.println(emp_1.empId);
        // System.out.println(emp_1.empName);
        // System.out.println(emp_1.empSalary);
        // System.out.println(emp_1.empDept);

        System.out.println("Data from : " + emp_1.companyName);
        // System.out.println(emp_1.getEmpId());
        // System.out.println(emp_1.getEmpName());
        // System.out.println(emp_1.getEmpSalary());
        // System.out.println(emp_1.getEmpDept());

        System.out.println(emp_1.toString());

        Employee emp_2 = new Employee(102, "max", 59000, "IT");

        System.out.println("Data from : " + emp_2.companyName);
        // System.out.println(emp_2.getEmpId());
        // System.out.println(emp_2.getEmpName());
        // System.out.println(emp_2.getEmpSalary());
        // System.out.println(emp_2.getEmpDept());    
        System.out.println(emp_2);  

    }
}

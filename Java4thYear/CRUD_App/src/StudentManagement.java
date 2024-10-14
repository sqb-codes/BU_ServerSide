/*
* Encapsulation - wrapping of methods and variables in a clas
* Data Hiding - make variable private, make methods public
* Good Encapsulation - Data Hiding + Encapsulation
*
* Getter Setter
*/

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private String email;
    private String collegeName;

    // Default Constructor
    Student() {
        this.collegeName = "Bennett";
    }

    // Parameterized Constructor
    Student(int rollNo, String name, String branch, String email) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.email = email;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.rollNo + "," + this.name + "," + this.email + "," + this.branch;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
//        Student std_1 = new Student(); // will call default
//        std_1.setRollNo(101);
//        System.out.println(std_1.getRollNo());

        Student std_1 = new Student(101, "John", "EC", "john@gmail.com");
//        System.out.println(std_1.getName());
//        System.out.println(std_1.getRollNo());
//        System.out.println(std_1.getBranch());
//        System.out.println(std_1.getEmail());

        System.out.println(std_1.toString());

    }
}

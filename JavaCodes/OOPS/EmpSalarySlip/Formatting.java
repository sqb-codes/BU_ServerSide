package OOPS.EmpSalarySlip;

public class Formatting {
    public String formatName(String empName) {
        // String empName = "john smith";
        String empArr[] = empName.split(" ");
        String formattedName = "";
        for(String name : empArr) {
            char firstChar = name.charAt(0);
            String firstCharUpper = String.valueOf(firstChar).toUpperCase();
            String remainingString = name.substring(1);
            formattedName += firstCharUpper + remainingString + " ";
        }
        return formattedName;
    }
}

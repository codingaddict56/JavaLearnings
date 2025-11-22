public class Employee {

    private int empID;
    private String empName;
    private int empSalary;
    private static String companyName = "Tech Solutions";
    private final String country = "Germany";

    public Employee() {
    }

    public Employee(int empID, String empName, int empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + empID + ", Name: " + empName + ", Salary: " + empSalary + ", Company: " + companyName + ", Country: " + country);
    }


}



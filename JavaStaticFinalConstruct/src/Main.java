public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Anna", 6000);
        emp.displayInfo();
        Employee emp1 = new Employee(102, "Bob", 55000);
        emp1.displayInfo();
        Manager man = new Manager(103, " Chaithra", 75000, "IT");
        man.displayInfo();
    }
}
package com.techsolutions.hr.model;

public class Manager extends Employee{

    private String empDepartment;


    public Manager(int empID, String empName, int empSalary, String empDepartment) {
        super(empID, empName, empSalary);
        this.empDepartment = empDepartment;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager ID: " + getEmpID() + ", Name: " + getEmpName() +  ", Salary: " + getEmpSalary() + ", Department: " + empDepartment + ", Company: " + getCompanyName() + " , Country: " + getCountry());
    }
}

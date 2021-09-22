package com.torryharris.model;

public class Employee {
    private String name;
    private int employeeId;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int employeeId, String designation, float salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return employeeId; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getDesignation() { return designation; }

    public void setDesignation(String designation) { this.designation = designation; }

    public float getSalary() { return salary; }

    public void setSalary(float salary) { this.salary = salary; }
    public void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("ID: "+employeeId);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary+"\n");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", designation='" + designation + '\'' +
                ", salary=" + salary ;
    }
}

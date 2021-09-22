package com.torryharris.model;

public class Clerk extends Employee{
    private String degree;

    public Clerk() {
    }

    public Clerk(String name, int employeeId, String designation, float salary, String degree) {
        super(name, employeeId, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void generatePayRoll()
    {
        System.out.println("Lead "+getName()+" Generate Pay Roll");
    }
    @Override
    public String toString() {
        return "Clerk{" + super.toString()+
                ", degree='" + degree + '\'' +
                '}';
    }
}

package com.torryharris.model;

public class Lead extends Employee{
    private int teamSize;

    public Lead() {
    }

    public Lead(String name, int employeeId, String designation, float salary, int teamSize) {
        super(name, employeeId, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void standUpCall()
    {
        System.out.println("Lead "+getName()+" Stand Up Call");
    }
    @Override
    public String toString() {
        return "Lead{" + super.toString()+
                ", teamSize=" + teamSize +
                '}';
    }
}

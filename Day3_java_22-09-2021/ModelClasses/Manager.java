package com.torryharris.model;

public class Manager extends Employee{
    private String projectName;
    private int noOfTeams;

    public Manager() {
    }

    public Manager(String name, int employeeId, String designation, float salary, String projectName, int noOfTeams) {
        super(name, employeeId, designation, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public void callMeeting()
    {
        System.out.println("Manager "+getName()+" Call for Meeting");
    }
    @Override
    public String toString() {
        return "Manager{" + super.toString()+
                ", projectName='" + projectName + '\'' +
                ", noOfTeams=" + noOfTeams +
                '}';
    }
}

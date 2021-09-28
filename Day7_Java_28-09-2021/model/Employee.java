package com.torryharris.model;

public class Employee {

        private int eId;
        private String name;
        private String destination;
        private int salary;

        public Employee(int eId, String name, String destination, int salary) {
            this.eId = eId;
            this.name = name;
            this.destination = destination;
            this.salary = salary;
        }

        public int geteId() {
            return eId;
        }

        public void seteId(int eId) {
            this.eId = eId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", salary=" + salary +
                '}';
    }
}

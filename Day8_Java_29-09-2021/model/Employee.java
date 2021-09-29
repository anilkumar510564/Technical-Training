package com.torryharris.model;

import java.util.Objects;

public class Employee {

        private int eId;
        private String name;
        private String destination;
        private int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return geteId() == employee.geteId() && getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(geteId(), getName());
    }

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

package com.torryharris.model;

public class Car implements Comparable<Car> {
    private int chassisNumber;
    private String name;
    private String fuelType;
    private int power;

    @Override
    public int compareTo(Car o) {
        return this.getPower()-o.getPower();
    }

    public Car(int chassisNumber, String name, String fuelType, int power) {
        this.chassisNumber = chassisNumber;
        this.name = name;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassisNumber=" + chassisNumber +
                ", name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }
}

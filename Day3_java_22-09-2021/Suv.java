package com.torryharris.model;

public class Suv extends Cars {
    private String driveModes;
    private boolean sunRoof;

    public Suv(String name, String fuel_type, int engine_capacity, float power,
               int no_gears, CarsTyre tyre, CarsMusicSystem ms, String driveModes, boolean sunRoof) {
        super(name, fuel_type, engine_capacity, power, no_gears, tyre, ms);
        this.driveModes = driveModes;
        this.sunRoof = sunRoof;
    }
    public void displaySuvFeature()
    {
        displayFeatures();
        System.out.println("Drive Mode: "+driveModes);
        System.out.println("Sunroof: "+sunRoof);
    }
    public void displayFeatures() /*Method Overriding*/
    {
        System.out.println(getName()+" accelerating in "+driveModes);
    }

    public String getDriveModes() {
        return driveModes;
    }

    public void setDriveModes(String driveModes) {
        this.driveModes = driveModes;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}

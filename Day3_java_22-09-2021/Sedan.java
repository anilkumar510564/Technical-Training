package com.torryharris.model;

public class Sedan extends Cars{
    private int bootSpace;

    public Sedan(String name, String fuel_type, int engine_capacity, float power,
                 int no_gears, CarsTyre tyre, CarsMusicSystem ms, int bootSpace) {
        super(name, fuel_type, engine_capacity, power, no_gears, tyre, ms);
        this.bootSpace = bootSpace;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }

    public void displaySedanFeatures()
    {
        displayFeatures();
        System.out.println("Boot Space: "+bootSpace+"Litres");
    }

}

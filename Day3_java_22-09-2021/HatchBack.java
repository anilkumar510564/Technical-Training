package com.torryharris.model;

public class HatchBack extends Cars {
    String steeringType;

    public HatchBack(String name, String fuel_type, int engine_capacity, float power,
                     int no_gears, CarsTyre tyre, CarsMusicSystem ms, String steeringType) {
        super(name, fuel_type, engine_capacity, power, no_gears, tyre, ms);
        this.steeringType = steeringType;
    }

    public void displayHatchbackFeatures()
    {
        displayFeatures();
        System.out.println("Steering Type: "+steeringType);
    }
    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
}

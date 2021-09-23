package com.torryharris.model;

public class AirIndia implements Aeroplane{

    @Override
    public void fly() {
        System.out.println("Air India aeroplane flies in Air");
    }

    @Override
    public void move() {
        System.out.println("Air India aeroplane Moves");
    }
}

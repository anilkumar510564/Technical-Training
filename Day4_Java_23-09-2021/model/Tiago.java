package com.torryharris.model;

public class Tiago implements Car{

    @Override
    public void changeGear() {
        System.out.println("Tiago car Changes Gear");
    }

    @Override
    public void move() {
        System.out.println("Tiago car Moves");
    }
}

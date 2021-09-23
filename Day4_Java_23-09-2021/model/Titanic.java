package com.torryharris.model;

public class Titanic implements Boat{

    @Override
    public void floatOnWater() {
        System.out.println("Titanic boat float on water");
    }

    @Override
    public void move() {
        System.out.println("Titanic boat Moves");
    }
}

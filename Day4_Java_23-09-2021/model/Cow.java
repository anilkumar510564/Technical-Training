package com.torryharris.model;

public class Cow implements Mammal{

    @Override
    public void feed() {
        System.out.println("Cow is Feeding its Child");
    }

    @Override
    public void eat() {
        System.out.println("Cow Eats Grass");
    }
}

package com.torryharris.model;

public class Tiger implements Mammal{

    @Override
    public void feed() {
        System.out.println("Tiger is Feeding its Child");
    }

    @Override
    public void eat() {
        System.out.println("Tiger Eats Meat");
    }
}

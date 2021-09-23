package com.torryharris.model;

public class Bat implements Bird,Mammal{

    @Override
    public void fly() {
        System.out.println("Bat is flying at Night");
    }

    @Override
    public void feed() {
        System.out.println("Bat is feeding its Child");
    }

    @Override
    public void eat() {
        System.out.println("Bat is eating Insects / Fruits");
    }
}

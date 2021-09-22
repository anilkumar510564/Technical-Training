package com.torryharris.model;

public class PolyA {
    private int a=5;
    private static int value;

    public PolyA() {
    }

    public PolyA(int a) {
        this.a = a;
    }
    public void display()
    {
        System.out.println("Inside Class A (Parent Class) Method");
    }
    public static void disp()
    {
        System.out.println("Inside Class A (Parent Class)  Static Method");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        PolyA.value = value;
    }
}

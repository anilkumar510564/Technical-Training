package com.torryharris.model;

public class PolyB extends PolyA{
     private int b=10;
     private static int value;

    public PolyB() {
    }

    public void display()
    {
        System.out.println("Inside Class B (Child Class) Method");
    }
    public static void disp()
    {
        System.out.println("Inside Class B (Child Class)  Static Method");
    }
    public PolyB(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        PolyB.value = value;
    }

}

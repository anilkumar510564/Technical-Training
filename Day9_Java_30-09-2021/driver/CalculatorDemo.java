package com.torryharris.driver;


import com.torryharris.testing.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println("5+1= "+cal.add(5,1));
        System.out.println("5-1= "+cal.sub(5,1));
        System.out.println("5*1= "+cal.mul(5,1));
        System.out.println("5/5= "+cal.div(5,5));
    }
}

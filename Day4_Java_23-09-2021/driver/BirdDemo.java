package com.torryharris.driver;

import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        //Either you can create object of sub classes (or)
        // You can create object of sub classes with reference to Interface class

        //Creating object of subclass with reference to sub class
        System.out.println("Creating object of subclass with reference to sub class");
        Pigeon pi=new Pigeon();
        pi.fly();
        pi.eat();

        Peacock pe=new Peacock();
        pe.fly();
        pe.eat();

        //Bird bird=new Bird(); Creating Object for Interface is not possible

        //Creating object of sub class with reference to interface class
        System.out.println("\nCreating object of sub class with reference to interface class");
        Bird p1=new Pigeon();
        pi.fly();
        pi.eat();

        Bird p2=new Peacock();
        pe.fly();
        pe.eat();


    }
}

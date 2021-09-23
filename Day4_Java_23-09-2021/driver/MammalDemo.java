package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Mammal;
import com.torryharris.model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        System.out.println("Cow Implements Mammal:");
        Mammal cow=new Cow();
        cow.feed();
        cow.eat();

        System.out.println("\nTiger Implements Mammal:");
        Mammal tiger=new Tiger();
        tiger.feed();
        tiger.eat();

        System.out.println("\nBat Implements Both Bird and Mammal:");
        Bat bat=new Bat();
        bat.fly();
        bat.feed();
        bat.eat();



    }
}

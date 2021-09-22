package com.torryharris.driver;

import com.torryharris.model.PolyA;
import com.torryharris.model.PolyB;

public class PolyAbDemo {
    public static void main(String[] args) {
        //Run Time Polymorphism
        System.out.println("Run Time Polymorphism:");
        PolyA aObj=new PolyA();
        aObj.display();

        PolyB bObj=new PolyB();
        bObj.display();

        PolyA x=new PolyB();
        x.display();

        //Compile Time Polymorphism
        System.out.println("\nCompile Time Polymorphism:");
        PolyA a=new PolyA();
        a.disp();

        PolyB b=new PolyB();
        b.disp();

        PolyA y=new PolyB();
        y.disp();




    }
}

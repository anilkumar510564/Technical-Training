package com.torryharris.driver;

import com.torryharris.model.*;

public class VehicleDemo {
    public static void main(String[] args) {
        Car t=new Tiago();
        t.move();
        t.changeGear();

        System.out.println();
        Boat b=new Titanic();
        b.move();
        b.floatOnWater();

        System.out.println();
        Aeroplane a=new AirIndia();
        a.move();
        a.fly();
    }
}

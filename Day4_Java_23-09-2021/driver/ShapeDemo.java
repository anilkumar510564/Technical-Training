package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle t1=new Triangle(5,10);
        t1.area();
        Shape shape=new Triangle(5,10);//From parent class reference we access its overriden method
        shape.area();

        Shape shape1=new Rectangle(5,10);
        shape1.area();
    }
}

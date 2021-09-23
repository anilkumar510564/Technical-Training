package com.torryharris.driver;

public class WrapperOperations {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before Boxing a = "+a);
        Integer iObj1=a;         //Boxing
        int b=iObj1+5;           //Unboxing and ADD 5
        System.out.println("b = "+b);
        int c=iObj1-5;           //Unboxing and SUBTRACT 5
        System.out.println("c = "+c);
        int d=iObj1*5;           //Unboxing and MULTIPLY by 5
        System.out.println("d = "+d);
        int e=iObj1/5;           //Unboxing and DIVIDE by 5;
        System.out.println("e = "+e);
    }
}

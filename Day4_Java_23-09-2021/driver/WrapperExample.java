package com.torryharris.driver;

import java.util.Scanner;

public class WrapperExample {
    public static void main(String[] args) {
        String stri;
        String strf;
        int i;
        float f;
        Scanner sc=new Scanner(System.in);
        stri=sc.next();
        strf=sc.next();
        i=Integer.parseInt(stri);
        f=Float.parseFloat(strf);
        System.out.println("stri : "+stri);
        System.out.println("strf : "+strf);
        System.out.println("i : "+i);
        System.out.println("f : "+f);
        System.out.println("i * 2 : "+i*2);
        System.out.println("f *2 : "+f*2);





    }
}

package com.torryharris.driver;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s1="abcd";
        String s2=new String("abcd");
        Scanner scanner=new Scanner(System.in);
        String s3=scanner.next();
        System.out.println(s1+" "+s1.hashCode());
        s1.concat("ef");
        String s4=s1.concat("ef");
        System.out.println(s1+" "+s1.hashCode());
        System.out.println(s2+" "+s2.hashCode());
        System.out.println(s3+" "+s3.hashCode());
        System.out.println(s4+" "+s4.hashCode());

    }
}

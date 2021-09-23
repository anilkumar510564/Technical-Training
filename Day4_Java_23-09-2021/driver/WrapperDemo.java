package com.torryharris.driver;

public class WrapperDemo {
    public static void main(String[] args) {
        int a=10;
        System.out.println("a = "+a);
        Integer iObj=a;           //Boxing
        int b=iObj;               //Unboxing
        System.out.println("b = "+b);
        int c;
        c=iObj+10;               //Unboxing and adding 10
        System.out.println("c = "+c);
        Integer iObj2=iObj+10;   //Unboxing, adding 10 and then Boxing again


        String str="12345";
        int number=Integer.parseInt(str);
        System.out.println("str : "+str);
        System.out.println("number : "+number);
        System.out.println("str + 10: "+(str+10));
        System.out.println("number + 10: "+(number+10));

    }
}

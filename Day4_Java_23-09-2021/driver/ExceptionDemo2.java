package com.torryharris.driver;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of b and c:");
        b=sc.nextInt();
        c=sc.nextInt();
        try
        {
            if(c==0)
            {
                throw new ArithmeticException("Custom Message: Divide By Zero Error");
            }
            else{
                a=b/c;
                System.out.println("a = "+a);
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception Caught");
            System.out.println(ex);
        }
        System.out.println("After if-else Statement");

    }
}

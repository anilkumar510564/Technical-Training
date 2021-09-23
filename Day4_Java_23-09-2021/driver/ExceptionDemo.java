package com.torryharris.driver;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class ExceptionDemo {
    public static void main(String[] args) {

      try {
          String s = null;
          System.out.println("Hello1");
          System.out.println(s.length());
          int []array=new int[4];
          array[4]=5;
          int a=5,b=0;
          int c=a/b;
      }
      catch(NullPointerException x)
      {
          System.out.println("Null Point Exception Caught");
          System.out.println(x);
          x.printStackTrace();
      }
      catch(ArithmeticException y)
      {
          System.out.println("Arithmetic Exception Caused");
          y.printStackTrace();
      }
      catch(ArrayIndexOutOfBoundsException a){
          System.out.println("Array Index Out of Bound Exception Caused");
          a.printStackTrace();
        }
     /* catch(Exception e)
      {
          System.out.println("Default Exception");
      }*/
       /*catch(NullPointerException x)
      {
          System.out.println("Null Point Exception Caught");
          System.out.println(x);
          x.printStackTrace();*/
    }
      //System.out.println("Hello2");



        /*String s=null;
        System.out.println(s.length());  //NULL Point Exception
        int []array=new int[4];
        int d=array[4];                 //Array Index Out of Bounds Exception
        int a=5,b=0;
        int c=a/b;                        //Arithmetic Exception */
}


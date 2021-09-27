package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.GenericPrint;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericPrint<Integer,Float> iPrint=new GenericPrint<>(10,5.5f);
        System.out.println(iPrint.getObj1()+" "+iPrint.getObj2());

        GenericPrint<Float,String> fPrint=new GenericPrint<>(3.5f,"Ram");
        System.out.println(fPrint.getObj1()+" "+fPrint.getObj2());

        GenericPrint<String,Integer> sPrint=new GenericPrint<>("Generics Demo",5);
        System.out.println(sPrint.getObj1()+" "+sPrint.getObj2());

        Employee emp1=new Employee(1,"Shiva","MD",100000);
        Employee emp2=new Employee(2,"Ganesh","Manager",50000);
        GenericPrint<Employee,Employee> empPrint=new GenericPrint<>(emp1,emp2);
        System.out.println(empPrint.getObj1()+" "+empPrint.getObj2());

        genericDisplay(10);
        genericDisplay(5.5f);
        genericDisplay("Sita");
        genericDisplay(true);

    }
    static <T> void genericDisplay(T obj)   //Generic Method
    {
        System.out.println(obj);
    }
}

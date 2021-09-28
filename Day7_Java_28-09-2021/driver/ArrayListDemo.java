package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Integer Array List
        String []array=new String[]{"Vishnu","Lakshmi"};
        ArrayList<String> sArrayList=new ArrayList<>();
        sArrayList.add("Ram");
        sArrayList.add("Sita");
        sArrayList.add("Shiva");
        sArrayList.add(2,"Kailash");
        sArrayList.addAll(Arrays.asList(array));
        System.out.println(sArrayList);
        System.out.println();

        //Float Array List
        Float []arr=new Float[]{50.5f,400.5f};
        ArrayList<Float> fArrayList=new ArrayList<>();
        fArrayList.add(10.5f);
        fArrayList.add(30.5f);
        fArrayList.add(200.5f);
        fArrayList.addAll(Arrays.asList(arr));
        System.out.println(fArrayList);
        System.out.println();

        //Employee Array List
       /* ArrayList<Employee> empArrayList=new ArrayList<>();
        Employee emp1=new Employee(1,"Ram","CEO",100000);
        Employee emp2=new Employee(2,"Sita","Manager",75000);
        Employee emp3=new Employee(3,"Ganesh","Business Analyst",65000);
        empArrayList.add(emp1);
        //empArrayList.add(emp2);
        empArrayList.add(emp3);
        empArrayList.add(1,emp2);
        System.out.println(empArrayList);
        System.out.println();

        //For Loop
        System.out.println("-------------Employee------------");
        for(int i=0;i<empArrayList.size();i++)
        {
            System.out.println(empArrayList.get(i));
        }
        System.out.println();

        //For Each Loop
        System.out.println("-------------Employee------------");
        for(Employee employee: empArrayList)
        {
            System.out.println(employee);
        }
        System.out.println();

        //Iterate Method
        Iterator<Employee> employeeIterator=empArrayList.iterator();
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }
        System.out.println();*/


        //ArrayList of different data types
        ArrayList<Object> oList=new ArrayList<>();
        oList.add(10);
        oList.add(5.5);
        oList.add("ABCD");
        //oList.add(emp1);
        for(Object object: oList)
        {
            System.out.println(object);
        }



    }
}

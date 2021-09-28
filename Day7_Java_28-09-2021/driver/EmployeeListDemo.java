package com.torryharris.driver;


import com.torryharris.comparator.Employee2NameComparator;
import com.torryharris.model.Employee2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeListDemo {
    public static void main(String[] args) {
        ArrayList<Employee2> empArrayList=new ArrayList<>();
        Employee2 emp1=new Employee2(1,"Ram","CEO",100000);
        Employee2 emp2=new Employee2(2,"Sita","Manager",75000);
        Employee2 emp3=new Employee2(5,"Ganesh","Business Analyst",65000);
        Employee2 emp4=new Employee2(4,"Shiva","Quality Analyst",50000);
        Employee2 emp5=new Employee2(3,"Akash","Software Developer",50000);

        empArrayList.add(emp1);
        empArrayList.add(emp2);
        empArrayList.add(emp3);
        empArrayList.add(emp4);
        empArrayList.add(emp5);
        if(empArrayList.isEmpty())
        {
            System.out.println("List is empty");
        }
        System.out.println("----------Using Iterator-Printing Employee-Before Sorting eId----------");
        Iterator<Employee2> employeeIterator=empArrayList.iterator();
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }
        System.out.println();

        //empArrayList.sort(null);    Sorting eId in Ascending
        //empArrayList.sort(Collections.reverseOrder());
        empArrayList.sort(null);
        System.out.println("----------Using Iterator-Printing Employee-After Sorting eId----------");
        employeeIterator=empArrayList.iterator();
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }

        System.out.println();
        empArrayList.sort(new Employee2NameComparator());
        System.out.println("----------Using Iterator-Printing Employee-After Sorting Name----------");
        employeeIterator=empArrayList.listIterator();
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }
    }
}

package com.torryharris.driver;

import com.torryharris.model.Employee2;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonListDemo {
    public static void main(String[] args) {
        Person p1=new Person(100000000001l,"Raja","Tamil Nadu","Textile Business");
        Person p2=new Person(100000000005L,"Suresh Menon","Kerala","Trader");
        Person p3=new Person(100000000003l,"Sooraj Sinha","Maharastra","Software Engineer");
        Person p4=new Person(100000000002L,"Sardar Patel","Gujarat","Shipping Business");
        Person p5=new Person(100000000004l,"Rakesh Rajput","Rajasthan","Transport Business");

        ArrayList<Person> pArrayList=new ArrayList<>();
        pArrayList.add(p1);
        pArrayList.add(p2);
        pArrayList.add(p3);
        pArrayList.add(p4);
        pArrayList.add(p5);

       /* CRUD Operations
        pArrayList.remove(p3);
        pArrayList.add(1,p3);
        Iterator<Person> pIterator=pArrayList.iterator();
        System.out.println("----------Using Iterator-Printing Person----------");
        pIterator=pArrayList.iterator();
        while(pIterator.hasNext())
        {
            System.out.println(pIterator.next());
        }
        System.out.println(); */


        Iterator<Person> pIterator=pArrayList.iterator();
        System.out.println("----------Using Iterator-Printing Person-Before Sorting----------");
        pIterator=pArrayList.iterator();
        while(pIterator.hasNext())
        {
            System.out.println(pIterator.next());
        }
        System.out.println();
        pArrayList.sort(null);
        System.out.println("----------Using Iterator-Printing Person-After Sorting----------");
        pIterator=pArrayList.iterator();
        while(pIterator.hasNext())
        {
            System.out.println(pIterator.next());
        }

    }
}

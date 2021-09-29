package com.torryharris.collections;

import com.torryharris.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {

    public static void main(String[] args) {
        Person p1=new Person(1,"Ram","Research and Analysis Wing","New Delhi");
        Person p2=new Person(2,"Sita","Intelligence Bureau","New Delhi");
        Person p3=new Person(5,"Shiva","Defence Intelligence Agency","Mumbai");
        Person p4=new Person(4,"Sakthi","National Investigation Agency","Bangalore");
        Person p5=new Person(3,"Vishnu","Central Bureau of Investigation","Chennai");
        HashSet<Person> pHashSet=new HashSet<>();
        pHashSet.add(p1);
        pHashSet.add(p2);
        pHashSet.add(p3);
        pHashSet.add(p4);
        pHashSet.add(p5);
        System.out.println(pHashSet);
        System.out.println();
        for(Person person:pHashSet)
        {
            System.out.println(person);
        }
        System.out.println();
    }


}

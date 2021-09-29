package com.torryharris.collections;

import com.torryharris.comparator.PersonCityComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.comparator.PersonOccupationComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {

        Person p1=new Person(1,"Ram","Research and Analysis Wing","New Delhi");
        Person p2=new Person(2,"Sita","Intelligence Bureau","New Delhi");
        Person p3=new Person(5,"Shiva","Defence Intelligence Agency","Mumbai");
        Person p4=new Person(4,"Sakthi","National Investigation Agency","Bangalore");
        Person p5=new Person(3,"Vishnu","Central Bureau of Investigation","Chennai");
        Person p6=new Person(6,"Garud","Central Bureau of Investigation","Kolkata");
        TreeSet<Person> pTreeSet=new TreeSet<>();
        pTreeSet.add(p1);
        pTreeSet.add(p2);
        pTreeSet.add(p3);
        pTreeSet.add(p4);
        pTreeSet.add(p5);
        pTreeSet.add(p6);
        System.out.println("Person Tree Set Sort by Person ID:");
        for(Person person:pTreeSet)
        {
            System.out.println(person);  //If we didn't use comparable we will get Error since it is an Object i.e, p1,p2,.....
        }
        System.out.println();

        for(Person person:pTreeSet)
        {
            if(person.getOccupation().equals("Central Bureau of Investigation")) {
                System.out.println(person);
            }
        }
        System.out.println();

        TreeSet<Person> p1TreeSet=new TreeSet<>(new PersonNameComparator());
        p1TreeSet.add(p1);
        p1TreeSet.add(p2);
        p1TreeSet.add(p3);
        p1TreeSet.add(p4);
        p1TreeSet.add(p5);
        System.out.println("Person Tree Set Sort by Name:");
        for(Person person:p1TreeSet)
        {
            System.out.println(person);  //If we didn't use comparable we will get Error since it is an Object i.e, p1,p2,.....
        }
        System.out.println();

        TreeSet<Person> personTreeSetbyOccupation=new TreeSet<>(new PersonOccupationComparator());
        personTreeSetbyOccupation.add(p1);
        personTreeSetbyOccupation.add(p2);
        personTreeSetbyOccupation.add(p3);
        personTreeSetbyOccupation.add(p4);
        personTreeSetbyOccupation.add(p5);
        System.out.println("Person Tree Set Sort by Occupation:");
        for(Person person:personTreeSetbyOccupation)
        {
            System.out.println(person);  //If we didn't use comparable we will get Error since it is an Object i.e, p1,p2,.....
        }
        System.out.println();

        TreeSet<Person> personTreeSetbyCity=new TreeSet<>(new PersonCityComparator());
        personTreeSetbyCity.add(p1);
        personTreeSetbyCity.add(p2);
        personTreeSetbyCity.add(p3);
        personTreeSetbyCity.add(p4);
        personTreeSetbyCity.add(p5);
        System.out.println("Person Tree Set Sort by City:");
        for(Person person:personTreeSetbyCity)
        {
            System.out.println(person);  //If we didn't use comparable we will get Error since it is an Object i.e, p1,p2,.....
        }
        System.out.println(personTreeSetbyCity.comparator());
    }
}

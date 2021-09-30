package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonSerializationDemo {
    public PersonSerializationDemo() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Person p1=new Person(1,"Ram","Research and Analysis Wing","New Delhi");
        Person p2=new Person(2,"Sita","Intelligence Bureau","New Delhi");
        Person p3=new Person(5,"Shiva","Defence Intelligence Agency","Mumbai");
        Person p4=new Person(4,"Sakthi","National Investigation Agency","Bangalore");
        Person p5=new Person(3,"Vishnu","Central Bureau of Investigation","Chennai");

        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        personArrayList.add(p4);
        personArrayList.add(p5);

        FileOutputStream fos=new FileOutputStream("People.txt");
        ObjectOutputStream personOutputStream=new ObjectOutputStream(fos);
        personOutputStream.writeObject(personArrayList);
        /*personOutputStream.writeObject(p1);
        personOutputStream.writeObject(p2);
        personOutputStream.writeObject(p3);
        personOutputStream.writeObject(p4);
        personOutputStream.writeObject(p5);*/
        personOutputStream.flush();
        personOutputStream.close();
        fos.close();


    }


}

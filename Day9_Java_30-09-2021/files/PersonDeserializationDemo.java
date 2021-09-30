package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.*;
import java.util.ArrayList;

public class PersonDeserializationDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("people.txt");
        ObjectInputStream personInputStream=new ObjectInputStream(fis);
        ArrayList<Person> personArrayList=null;
        Person person;
        try
        {
            while (true) {
                // = (Person) personInputStream.readObject();
                //personArrayList.add(person);
                personArrayList=(ArrayList<Person>)
                        personInputStream.readObject();
            }
        }
        catch(EOFException | ClassNotFoundException ex)
        {
        }
        /*personArrayList.sort(null);
        System.out.println("Person Details:");
        for(Person per:personArrayList)
        {
            System.out.println(per);
        }*/
        System.out.println("Person Details:");
        for(Person per:personArrayList)
        {
            System.out.println(per);
        }
    }
}

package com.torryharris.driver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("Linked List:");
        LinkedList<String> strList=new LinkedList<>();
        strList.add("Maruti");
        strList.add("Tata");
        strList.add("Mahindra");
        System.out.println(strList);

        String []names={"Hyundai","Honda"}; //Array
        strList.addAll(Arrays.asList(names)); //Adding Array to Linked List by Converting Array to Linked List
        System.out.println(strList);

        LinkedList<String> strList2=new LinkedList<>(); //Creating Another Linked List
        strList2.add("Toyota");
        strList2.add("Mitsubishi");
        strList.addAll(strList2);  //Adding another Linked List to Existing Linked List
        System.out.println(strList);

        System.out.println("Stack:");  //Stack
        Stack<Integer> iStack=new Stack<>();
        iStack.push(1); //Inserting Elements into Stack
        iStack.push(2);
        iStack.push(3);
        iStack.push(4);
        iStack.push(5);
        System.out.println(iStack);
        System.out.println(iStack.peek()); //Printing Peek Element of Stack i.e, Last Element Since Stack Follows LIFO
        System.out.println(iStack.pop());  //Deleting a Element from Stack
        System.out.println(iStack.pop());
        System.out.println(iStack);
        iStack.pop();
        System.out.println(iStack);

        System.out.println("Vector:");
        Vector<Integer> iVector=new Vector<>();
        iVector.add(1);
        iVector.add(2);
        iVector.add(3);
        System.out.println(iVector);

        System.out.println("Copy On Write Array List:");
        CopyOnWriteArrayList<Integer> icopyOnWriteArrayList=new CopyOnWriteArrayList<>();
        icopyOnWriteArrayList.add(100);
        icopyOnWriteArrayList.add(200);
        icopyOnWriteArrayList.add(300);
        System.out.println(icopyOnWriteArrayList);




    }
}

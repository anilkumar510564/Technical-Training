package com.torryharris.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        System.out.println("Integer Tree Set:");
        TreeSet<Integer> iTreeSet=new TreeSet<>();
        iTreeSet.add(5);
        iTreeSet.add(1);
        iTreeSet.add(50);
        iTreeSet.add(10);
        iTreeSet.add(2);
        System.out.println(iTreeSet);
        iTreeSet.add(4);
        System.out.println(iTreeSet);
        iTreeSet.remove(50);
        System.out.println(iTreeSet);

        System.out.println();
        System.out.println("Integer Tree Set Reverse Order:");
        TreeSet<Integer> intTreeSet=new TreeSet<>(Collections.reverseOrder());
        intTreeSet.add(5);
        intTreeSet.add(1);
        intTreeSet.add(50);
        intTreeSet.add(10);
        intTreeSet.add(2);
        System.out.println(intTreeSet);
        intTreeSet.add(4);
        intTreeSet.add(4); //Duplicates Not Allowed
        System.out.println(intTreeSet);

        System.out.println();
        System.out.println("String Tree Set:");
        TreeSet<String> sTreeSet=new TreeSet<>();
        sTreeSet.add("Ram");
        sTreeSet.add("Akash");
        sTreeSet.add("Vaibhav");
        sTreeSet.add("Lekha");
        sTreeSet.add("Keerthi");
        System.out.println(sTreeSet);
        sTreeSet.add("Sita");
        System.out.println(sTreeSet);

        System.out.println();
        System.out.println("String Tree Set Reverse Order:");
        TreeSet<String> strTreeSet=new TreeSet<>(Collections.reverseOrder());
        strTreeSet.add("Ram");
        strTreeSet.add("Akash");
        strTreeSet.add("Vaibhav");
        strTreeSet.add("Lekha");
        strTreeSet.add("Keerthi");
        System.out.println(strTreeSet);
        strTreeSet.add("Sita");
        System.out.println(strTreeSet);
        strTreeSet.remove("Akash");
        System.out.println(strTreeSet);
    }

}

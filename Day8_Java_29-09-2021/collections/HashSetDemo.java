package com.torryharris.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> sHashSet=new HashSet<>();
        sHashSet.add("India");
        sHashSet.add("US");
        sHashSet.add("Canada");
        sHashSet.add("Singapore");
        System.out.println(sHashSet);// No Order is Maintained
        sHashSet.add(null);
        sHashSet.add(null);
        sHashSet.add(" ");
        sHashSet.add(" ");
        System.out.println(sHashSet);
        System.out.println(sHashSet.contains("Japan"));
        System.out.println(sHashSet.contains("India"));
        System.out.println();

        HashSet<Float> fHashSet=new HashSet<>();
        fHashSet.add(1.5f);
        fHashSet.add(5.7f);
        fHashSet.add(3.2f);
        fHashSet.add(4.8f);
        fHashSet.add(2.7f);
        System.out.println(fHashSet);
        System.out.println(fHashSet.size());// Print size(i.e, no of elements in fHashSet) of fHashSet
        fHashSet.remove(3.2f);     //removes 3.2f from hash table
        fHashSet.add(null);
        //fHashSet(null); Error Since only one null is permitted in Hash Set
        System.out.println(fHashSet);
        System.out.println(fHashSet.contains(3.2f)); //false
        System.out.println(fHashSet.contains(5.7f)); //true
        System.out.println();
        fHashSet.removeAll(fHashSet);// Removes all elements in fHashSet
        System.out.println(fHashSet);



    }
}

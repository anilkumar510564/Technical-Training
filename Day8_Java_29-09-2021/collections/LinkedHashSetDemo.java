package com.torryharris.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> sLinkedHashSet=new LinkedHashSet<>();
        sLinkedHashSet.add("India");
        sLinkedHashSet.add("Singapore");
        sLinkedHashSet.add("Canada");
        sLinkedHashSet.add("US");
        sLinkedHashSet.add("Japan");
        System.out.println(sLinkedHashSet); // Ordered Output. Since it is a Linked Hash Set = Maintains Order + Hash Set

    }
}

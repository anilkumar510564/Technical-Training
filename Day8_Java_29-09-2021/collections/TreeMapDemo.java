package com.torryharris.collections;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> daysTreeMap=new TreeMap<>();
        daysTreeMap.put(101,"Monday");
        daysTreeMap.put(103,"Wednesday");
        daysTreeMap.put(102,"Tuesday");
        System.out.println(daysTreeMap);

    }

}

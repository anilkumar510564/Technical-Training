package com.torryharris.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        Integer []array=new Integer[]{100,200,300};
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);

        integerArrayList.add(2,60);

        integerArrayList.addAll(Arrays.asList(array));
        System.out.println(integerArrayList);

        integerArrayList.sort(Collections.reverseOrder()); //Reverse Ordering the elements i.e, Descending Order
        System.out.println(integerArrayList);
    }
}

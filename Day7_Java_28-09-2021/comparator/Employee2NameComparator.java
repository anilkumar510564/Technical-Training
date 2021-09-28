package com.torryharris.comparator;

import com.torryharris.model.Employee2;

import java.util.Comparator;

public class Employee2NameComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

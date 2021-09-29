package com.torryharris.collections;

import com.torryharris.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashSetDemo {
    public static void main(String[] args) {
        Employee E1=new Employee(101,"Ram","Tiruppur",50000);
        Employee E2=new Employee(102,"Sita","Erode",60000);
        Employee E3=new Employee(103,"Shiva","Coimbatore",55000);
        Employee E4=new Employee(104,"Sakthi","Trichy",65000);
        Employee E5=new Employee(105,"Akash","Chennai",45000);
        Employee E6=new Employee(105,"Akash","Chennai",45000);
        HashMap<Integer,Employee> empHashMap=new HashMap<>();
        empHashMap.put(1001,E1);
        empHashMap.put(1002,E2);
        empHashMap.put(1003,E3);
        empHashMap.put(1004,E4);
        empHashMap.put(1005,E5);
        empHashMap.put(1006,E6);
        System.out.println(empHashMap);
        System.out.println();
        for(Map.Entry<Integer,Employee> entry:empHashMap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+"\n Value: "+entry.getValue()+"\n");
        }
        System.out.println();

        HashMap<Employee,Integer> employeeStringHashMap=new HashMap<>();
        employeeStringHashMap.put(E1,E1.geteId());
        employeeStringHashMap.put(E2,E2.geteId());
        employeeStringHashMap.put(E3,E3.geteId());
        employeeStringHashMap.put(E4,E4.geteId());
        employeeStringHashMap.put(E5,E5.geteId());
        employeeStringHashMap.put(E6, E6.geteId());
        System.out.println(employeeStringHashMap);

        for(Map.Entry<Employee,Integer> entry: employeeStringHashMap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+"\n Value: "+entry.getValue()+"\n");
        }
        System.out.println();
        System.out.println(E5.hashCode());
        System.out.println(E6.hashCode());
    }
}

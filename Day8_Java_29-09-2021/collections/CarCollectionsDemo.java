package com.torryharris.collections;

import com.torryharris.model.Car;
import com.torryharris.model.Employee;

import java.util.*;

public class CarCollectionsDemo{
    public static void main(String[] args) {


        Car c1=new Car(1001,"Xuv 700","Petrol",150);
        Car c2=new Car(1002,"Swift","Petrol",80);
        Car c3=new Car(1003,"Swift","Diesel",85);
        Car c4=new Car(1004,"Honda City","Petrol",110);
        Car c5=new Car(1005,"Tiago","Petrol",87);
        ArrayList<Car> carArrayList=new ArrayList<>();
        carArrayList.add(c1);
        carArrayList.add(c2);
        carArrayList.add(c3);
        carArrayList.add(c4);
        carArrayList.add(c5);
        /*for(Car car:carArrayList)
        {
            System.out.println(car);
        }*/
        System.out.println("Car Details Before Sort By Power:");
        Iterator<Car> cIterator=carArrayList.iterator();
        cIterator=carArrayList.iterator();
        while(cIterator.hasNext())
        {
            System.out.println(cIterator.next());
        }
        System.out.println();

        System.out.println("Car Details After Sort By Power:");
        TreeMap<Integer,Car> treeMap=new TreeMap<>();
        treeMap.put(c1.getPower(),c1);
        treeMap.put(c2.getPower(),c2);
        treeMap.put(c3.getPower(),c3);
        treeMap.put(c4.getPower(),c4);
        treeMap.put(c5.getPower(),c5);
        for(Map.Entry<Integer,Car> entry:treeMap.entrySet())
        {
            System.out.println("Key: "+entry.getKey()+"/n Value: "+entry.getValue());
        }
        System.out.println();

        HashMap<String,Car> carHashMap=new HashMap<>();
        carHashMap.put(c1.getName(),c1);
        carHashMap.put(c2.getName(),c2);
        carHashMap.put(c3.getName(),c3);
        carHashMap.put(c4.getName(),c4);
        carHashMap.put(c5.getName(),c5);
        System.out.println("Hash Map:");
        for(Map.Entry<String,Car> entry:carHashMap.entrySet())
        {
            System.out.println(entry.getValue());
        }

    }
}

package com.torryharris.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students=new HashMap<>();
        students.put(1001,"Ram");
        students.put(1002,"Sita");
        students.put(1003,"Shiva");
        students.put(1004,"Sakthi");
        students.put(1005,"Akash");
        System.out.println(students);
        students.put(1005,"Garud");  //Overwrite on akash  as Garud
        System.out.println(students);
        for(Integer key: students.keySet())  //To Print Key and Values in Hash Map One by One
        {
            System.out.println(key+":"+students.get(key)); //.get(Object Key);
        }
        Set<Integer> a=students.keySet();
        System.out.println(a);
        System.out.println();

        for(Map.Entry<Integer,String> entry:students.entrySet())
        {
            System.out.println(entry);
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }



    }
}

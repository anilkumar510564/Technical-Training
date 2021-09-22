package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        /*Employee e1=new Employee("Ram",101,"Manager",30000);
        Employee e2=new Employee("Sita",102,"Lead",45000);
        Employee e3=new Employee("Shiva",103,"clerk",40000);
        e1.display();
        e2.display();
        e3.display();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);*/
        Manager mg1=new Manager("Ram",101,"Manager",50000,"Cloud Logistics",5);
        Lead l1=new Lead("Sita",1001,"Lead",40000,5);
        Clerk c1=new Clerk("Shiva",10001,"Clerk",30000,"B.E ECE");
        System.out.println(mg1);
        mg1.callMeeting();
        System.out.println(l1);
        l1.standUpCall();
        System.out.println(c1);
        c1.generatePayRoll();

    }
}

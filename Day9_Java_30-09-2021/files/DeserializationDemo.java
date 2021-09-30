package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("employees.txt");
        ObjectInputStream employeeInputStream=new ObjectInputStream(fis);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        Employee employee;
        try{
            while(true) {
                employee = (Employee)employeeInputStream.readObject();//Type Cast
                //System.out.println(employee);
                employeeArrayList.add(employee);
            }
        }
        catch(EOFException | ClassNotFoundException ex)
        {
            //System.out.println("End Of  reached..... All Objects are read");
        }
        System.out.println("Employee Details:");
        for(Employee emp:employeeArrayList)
        {
            System.out.println(emp);
        }
    }
}

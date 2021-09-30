package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee(101, "Ram", "Manager", 50000);
        Employee e2 = new Employee(102, "Sita", "GM", 60000);
        Employee e3 = new Employee(103, "Garud", "PA", 40000);

        FileOutputStream fos= new FileOutputStream("employees.txt");
        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);
        employeeOutputStream.writeObject(e1);
        employeeOutputStream.writeObject(e2);
        employeeOutputStream.writeObject(e3);
        employeeOutputStream.flush();
        employeeOutputStream.close();
        fos.close();
    }

}

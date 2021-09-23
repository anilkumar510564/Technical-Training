package com.torryharris.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try
        {
            readFromFile("input.txt");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
    public static void readFromFile(String fileName) throws FileNotFoundException
    {
        File file=new File(fileName);
        FileInputStream fis=new FileInputStream(file);
    }
}

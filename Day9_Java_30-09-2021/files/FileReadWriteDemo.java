package com.torryharris.files;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteDemo {
    public static void main(String[] args) throws IOException {
        int n;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name:");
        name=sc.nextLine();
        System.out.println("Enter a Number:");
        n=sc.nextInt();
        //char []array=new char[100];
        //String data=new String(array);
        //data=name;
        FileWriter writer=new FileWriter("File1.txt");
        for(int i=0;i<n;i++) {
            writer.write(name+"\n");
        }
        writer.close();


    }
}

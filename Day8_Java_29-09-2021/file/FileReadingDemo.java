package com.torryharris.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("input.txt");
        System.out.println("File Contents are:");
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fis.close();

        FileOutputStream fos=new FileOutputStream("Output.txt");
        String str="This is an output file. \nThis contains data output.";
        char []array=str.toCharArray();
        for(char c: array)
        {
            fos.write((int)c);
        }
        fos.close();
        System.out.println("\nContents are written onto file: Output.txt");


    }
}

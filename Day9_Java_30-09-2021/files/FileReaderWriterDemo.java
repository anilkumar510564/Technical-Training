package com.torryharris.files;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        File input=new File("input.txt");
        FileReader reader=new FileReader(input);
        char []array=new char[(int)input.length()];
        reader.read(array);
        String data=new String(array);
        System.out.println(data);
        reader.close();

        FileWriter writer=new FileWriter("Output2.txt");
        data="This is contents of output file using FileWriter Object.";
        writer.write(data);
        writer.flush();
        int a=1/0; // Exception
        writer.close();




    }
}

package com.torryharris.driver;

import com.torryharris.comparator.Employee2NameComparator;
import com.torryharris.comparator.MoviesCollectionsComparator;
import com.torryharris.comparator.MoviesImdbRatingComparator;
import com.torryharris.comparator.MoviesYearOfReleaseComparator;
import com.torryharris.model.Movies;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MoviesListDemo {
    public static void main(String[] args) {
        int a;
        ArrayList<Movies> mArrayList=new ArrayList<>();
        Movies m1=new Movies("URI: The Surgical Strike",2019,10.0f,500000.0f);
        Movies m2=new Movies("RAW",2018,9.5f,450000.0f);
        Movies m3=new Movies("Parmanu",2017,8.0f,6000000.0f);
        Movies m4=new Movies("SherShaah",2021,8.5f,350000.0f);
        Movies m5=new Movies("Behind The Enemy Lines",2000,7.5f,400000.0f);
        Scanner sc=new Scanner(System.in);
        mArrayList.add(m1);
        mArrayList.add(m2);
        mArrayList.add(m3);
        mArrayList.add(m4);
        mArrayList.add(m5);
        System.out.println("Enter Options to Sort:");
        System.out.println("1 Sort Based on Title\n"+"2 Sort Base on Year of Release\n"+"3 Sort Based on IMDB Rating\n"
                            +"4 Sort Based on Collections");
        a=sc.nextInt();

        Iterator<Movies> mIterator=mArrayList.iterator();
        if(a==1)
        {
            //Iterator<Movies> mIterator=mArrayList.iterator();
            mArrayList.sort(null);
            System.out.println("----------Using Iterator-Printing Movies Sorted By Title----------");
            mIterator=mArrayList.iterator();
            while(mIterator.hasNext())
            {
                System.out.println(mIterator.next());
            }
            System.out.println();
        }
        else if(a==2)
        {
            //Iterator<Movies> mIterator=mArrayList.iterator();
            mArrayList.sort(new MoviesYearOfReleaseComparator());
            System.out.println("----------Using Iterator-Printing Movies Sorted By Year Of Release----------");
            mIterator=mArrayList.iterator();
            while(mIterator.hasNext())
            {
                System.out.println(mIterator.next());
            }
            System.out.println();
        }
        else if(a==3)
        {
            //Iterator<Movies> mIterator=mArrayList.iterator();
            mArrayList.sort(new MoviesImdbRatingComparator());
            System.out.println("----------Using Iterator-Printing Movies Sorted By IMDB Rating----------");
            mIterator=mArrayList.iterator();
            while(mIterator.hasNext())
            {
                System.out.println(mIterator.next());
            }
            System.out.println();
        }
        else if(a==4)
        {
            //Iterator<Movies> mIterator=mArrayList.iterator();
            mArrayList.sort(new MoviesCollectionsComparator());
            System.out.println("----------Using Iterator-Printing Movies Sorted By Collections----------");
            mIterator=mArrayList.iterator();
            while(mIterator.hasNext())
            {
                System.out.println(mIterator.next());
            }
            System.out.println();
        }
        else
        {
            System.out.println("Enter Correct Option from 1-4");
        }

    }
}

package com.torryharris.driver;

import com.torryharris.model.*;

import java.util.Scanner;

public class CarsTypeDemo {
    public static void main(String[] args) {
        CarsTyre mrf=new CarsTyre("MRF",16);
        CarsMusicSystem harman=new CarsMusicSystem("Harman",8,true,7);
        HatchBack swift=new HatchBack("Swift","Petrol",1200,84,5,mrf,harman,"Power");
        swift.displayHatchbackFeatures();

        CarsTyre bridgeStone=new CarsTyre("BridgeStone",17);
        CarsMusicSystem bose=new CarsMusicSystem("Bose",8,true,8);
        Sedan tigor=new Sedan("Tigor","Petrol",1400,120,5,bridgeStone,bose,400);
        tigor.displaySedanFeatures();
        tigor.setBootSpace(500);
        tigor.displaySedanFeatures();

        CarsTyre ceat=new CarsTyre("CEAT",18);
        CarsMusicSystem jbl=new CarsMusicSystem("JBL",8,true,10);
        System.out.println("\nEnter drive mode for suv-ECO/City/Sport:");
        String d;
        Scanner dm=new Scanner(System.in);
        d=dm.nextLine();
        Suv nexon=new Suv("Nexon","Petrol",1800,150,5,ceat,jbl,d,true);
        nexon.displaySuvFeature();

    }
}

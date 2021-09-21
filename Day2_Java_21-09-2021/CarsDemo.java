import java.util.Scanner;

public class CarsDemo {
        public static void main(String[] args) {
            int g;
            CarsMusicSystem harman=new CarsMusicSystem("Harman",8,true,7);
            CarsTyre bridgeStone=new CarsTyre("BridgeStone",14);
            Cars tiago=new Cars("Tiago","Petrol",1200,84,5, bridgeStone, harman);
            tiago.displayFeatures();
             /* tiago.displayFeatures("Tyre");
             tiago.displayFeatures("MusicSystem");*/
            tiago.acceleration();
            tiago.applyBreak();
            System.out.println("Enter a Gear to change:");
            Scanner n=new Scanner(System.in);
            g=n.nextInt();
            tiago.changeGear(g);
            tiago.steer();

            CarsMusicSystem jbl=new CarsMusicSystem("JBL",8,true,8);
            CarsTyre apollo=new CarsTyre("Apollo",16);
            Cars xuv=new Cars("XUV700","Petrol",1500,145,5, apollo, jbl);
            xuv.displayFeatures();
            xuv.acceleration();
            xuv.applyBreak();
            System.out.println("Enter a Gear to change:");
            Scanner a=new Scanner(System.in);
            g=a.nextInt();
            xuv.changeGear(g);
            xuv.steer();

            CarsMusicSystem bose=new CarsMusicSystem("Bose",8,true,10);
            CarsTyre mrf=new CarsTyre("MRF",16);
            Cars hondaCity=new Cars("Honda City","Petrol",1300,120,5, mrf, bose);
            hondaCity.displayFeatures();
            hondaCity.acceleration();
            hondaCity.applyBreak();
            System.out.println("Enter a Gear to change:");
            Scanner k=new Scanner(System.in);
            g=k.nextInt();
            hondaCity.changeGear(g);
            hondaCity.steer();



        }

}

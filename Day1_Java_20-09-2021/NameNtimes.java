import java.util.Scanner;

public class NameNtimes {
    public static void main(String[] args) {
        int num;
        String name;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number and Name:");
        num=scan.nextInt();
        name=scan.nextLine();
        while(num>0)
        {
            System.out.println(name);
            num--;
        }



    }
}

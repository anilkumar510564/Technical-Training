import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int []a=new int[5];
        System.out.println("Enter elements for Array:");
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Elements in Array are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Square of Elements in Array are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]*a[i]);
        }
    }
}

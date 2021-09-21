import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i;
        float f;
        short s;
        long l;
        byte b;
        double d;
        boolean bl;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Integer:");
        i=scan.nextInt();
        System.out.println("Enter Float:");
        f=scan.nextFloat();
        System.out.println("Enter Short:");
        s=scan.nextShort();
        System.out.println("Enter Long:");
        l=scan.nextLong();
        System.out.println("Enter Byte:");
        b=scan.nextByte();
        System.out.println("Enter Double:");
        d=scan.nextDouble();
        System.out.println("Enter Boolean:");
        bl=scan.nextBoolean();
        System.out.println("Integer:"+i);
        System.out.println("Float:"+f);
        System.out.println("Short:"+s);
        System.out.println("Long:"+l);
        System.out.println("Double:"+d);
        System.out.println("Byte:"+b);
        System.out.println("Boolean:"+bl);
    }
}

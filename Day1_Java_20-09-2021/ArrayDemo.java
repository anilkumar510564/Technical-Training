public class ArrayDemo {
    public static void main(String[] args) {
        int []a=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println("Array Elements:");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        for(int val:a)
        {
            System.out.println(val);
        }
    }
}

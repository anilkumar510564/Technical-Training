import java.util.Scanner;

public class ArrayMat {
    public static void main(String[] args) {
        int [][]mat=new int[3][3];
        System.out.println("Enter elements for matrix:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
               mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements in matrix:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

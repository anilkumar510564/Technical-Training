import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        int [][]mat=new int[3][3];
        System.out.println("Enter elements for matrix:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Principal Diagonal Elements:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
        System.out.println("\nSecondary Diagonal Elements:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if((i+j)==(mat[0].length-1)) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}

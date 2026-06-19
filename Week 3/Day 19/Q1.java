
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of rows of matrice: ");
     int r=sc.nextInt();
     System.out.print("Enter the number of columns of matrice: ");
     int c=sc.nextInt();
     int a[][]=new int[r][c];
     int b[][]=new int[r][c];
     System.out.println("Enter the elements of matrice 1: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            a[i][j]=sc.nextInt();
        }
     }
     System.out.println("Enter the elements of matrice 2: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            b[i][j]=sc.nextInt();
        }
     }
     System.out.println("Matrice 1: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
     }
      System.out.println("Matrice 2: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(b[i][j]+" ");
        }
        System.out.println(" ");
     }
     System.out.println("Addition of both the matrices: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print((a[i][j]+b[i][j])+" ");
        }
        System.out.println(" ");
     }
    }
}

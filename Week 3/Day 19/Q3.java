
import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the order of matrice: ");
     int n=sc.nextInt();
     int a[][]=new int[n][n];
     System.out.println("Enter the elements of matrice: ");
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            a[i][j]=sc.nextInt();
        }
     }
     System.out.println("Original Matrice: ");
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
     }
     System.out.println("Transpose of Matrice: ");
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(a[j][i]+" ");
        }
        System.out.println(" ");
     }
      
    }
}

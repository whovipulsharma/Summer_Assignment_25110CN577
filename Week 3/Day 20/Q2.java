     
import java.util.Scanner;
public class Q2{
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
     int f=0;
     System.out.println("Entered Matrice: ");
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(a[i][j]+" ");
            if(a[i][j]==a[j][i])
            f++;
        }
        System.out.println(" ");
     }
     if(f==(n*n))
     System.out.println("Entered matrix is symmetric.");
     else
     System.out.println("Entered matrix is not symmetric.");
    }
}

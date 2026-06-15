
import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of rows: ");
     int r=sc.nextInt();
     System.out.print("Enter the number of columns: ");
     int c=sc.nextInt();
     int a[][]=new int[r][c];
     int b[][]=new int[r][c];
     int d[][]=new int[r][c];
     System.out.println("Enter the elements of array: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            a[i][j]=sc.nextInt();
        }
         
     }
     System.out.println("Original array: ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(a[i][j]+" ");
            b[i][j]=a[j][i];
        }
         System.out.println("");
     }
     System.out
     .println("Array after rotating right: ");
     int k=c-1;
      for (int i = 0; i < r; i++) {
        k=c-1;
        for (int j = 0; j < c; j++) {
            if(j%2==c%2)
            {
                k+=2;
                d[i][j]=b[i][j];
            continue;
            
            }
            else
            {
                if(j<(c%2))
                {
                d[i][j+k]=b[i][j];
                k-=2;
                }
                else
                {
               d[i][j-k]=b[i][j];
               k+=2;
                }
            }
            

        }
        
     }
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(d[i][j]+" ");
        }
         System.out.println("");
     }
    }
}

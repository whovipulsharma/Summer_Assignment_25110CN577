
import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements of array: ");
     for (int i = 0; i < n; i++) {
         a[i]=sc.nextInt();
     }
     int ne=0;
     int no=0;
     System.out.println("Entered array: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a[i]+" ");
         if(a[i]%2==0)
         ne++;
         else
         no++;
     }
     System.out.println("\nNo. of even element: "+ne);
     System.out.println("No. of odd element: "+no);
    }
}


import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n=sc.nextInt();
     int a[]=new int[n];
     int b[]=new int[n];
     System.out.println("Enter the elements of array: ");
     for (int i = 0; i < n; i++) {
         a[i]=sc.nextInt();
         
     }
     int f=0;
     System.out.println("Entered array: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a[i]+" ");
         if(a[i]==0)
         f++;
     }
     int x=0;
      for (int i = 0; i < n; i++) {
         if(a[i]==0)
         continue;
         else
         {
         b[x]=a[i];
         x++;
         }
     }
     System.out.println("\nArray with all zero at last: ");
     for (int i = 0; i < n; i++) {
         System.out.print(b[i]+" ");
     }
    }
}

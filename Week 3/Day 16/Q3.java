
import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements of array: ");
     for (int i = 0; i < n; i++) {
         a[i]=sc.nextInt();
     }
     System.out.println("Entered array: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a[i]+" ");
     }
     System.out.println("\nEnter the sum: ");
         int s=sc.nextInt();
   
     for (int i = 0; i < n; i++) {
        int x=s-a[i];
        for (int j = i+1; j < n; j++) {
            if(x==a[j])
            {
                System.out.println("Pairs are "+a[i]+" and "+a[j]);
                break;
            }
        }

     }
        
    }
}

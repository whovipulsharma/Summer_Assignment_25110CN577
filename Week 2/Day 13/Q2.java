
import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements of array: ");
     for (int i = 0; i < n; i++) {
         a[i]=sc.nextInt();
     }
     int s=0;
     System.out.println("Entered array: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a[i]+" ");
s+=a[i];
     }
     System.out.println("\nSum of elements: "+s);
     System.out.println("Average of elements: "+(float)s/n);
    }
}

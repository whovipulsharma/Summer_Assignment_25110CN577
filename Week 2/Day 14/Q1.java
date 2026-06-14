
import java.util.Scanner;
public class Q1{
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
     System.out.print("\nEnter the element to search: ");
     int x=sc.nextInt();
     int f=0;
     for (int i = 0; i < n; i++) {
        if(a[i]==x){
         System.out.println("Element found at index "+i);
         f++;
        }
     }
        if(f==0)
        System.out.println("Element not found!");
    }
}

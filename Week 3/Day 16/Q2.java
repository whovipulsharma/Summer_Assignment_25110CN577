
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
     System.out.println("Entered array: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a[i]+" ");
     }
     int f1=0;
     int x=a[0];
     for (int i = 0; i < n; i++) {
int f2=0;
        for (int j = 0; j < n; j++) {
            if(a[i]==a[j])
            f2++;
        }
        if(f2>f1)
        {
        f1=f2;
        x=a[i];
        }

     }
        System.out.println("\nHighest frequency element is: "+x);
    }
}

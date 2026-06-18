
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       System.out.println("Enter the element to search: ");
       int x=sc.nextInt();
        
        int s=0,e=n;
        int f=0;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(x==a[m])
            {
                System.out.println("Element found at index: "+m);
                f++;
                break;
            }
            else if(x>a[m])
            s=m+1;
            else
            e=m-1;
        }
        if(f==0)
        System.out.println("Element not found!!");
    }
}

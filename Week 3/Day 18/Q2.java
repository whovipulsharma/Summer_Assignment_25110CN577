
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n-1; i++) {
            int m=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[m])
                {
                    m=j;
                }
            }
            int t=a[i];
                    a[i]=a[m];
                    a[m]=t;
        }
        System.out.println("\nSorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

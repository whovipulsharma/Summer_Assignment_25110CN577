
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = a[0];
        for (int i = 1; i < n; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }
        int s1 = 0;
        int s2 = (m * (m + 1)) / 2;
        System.out.println("Entered array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            s1 += a[i];
        }
        if ((s2 - s1) == 0) {
            System.out.println("\nMissing number is: " + (m + 1)); 
        }else {
            System.out.println("\nMissing number is: " + (s2 - s1));
        }
    }
}

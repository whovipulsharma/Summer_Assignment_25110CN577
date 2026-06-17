
import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter the elements of array 1: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter the elements of array 2: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[n1 + n2];
        System.out.println("\nEntered array 1: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(a[i] + " ");
            c[i] = a[i];
        }
        System.out.println("\nEntered array 2: ");
        int k = n1;
        for (int i = 0; i < n2; i++) {
            System.out.print(b[i] + " ");
            c[k] = b[i];
            k++;
        }
        System.out.println("\nIntersection of array 1 and 2: ");
        for (int i = 0; i < n1; i++) {
            int f = 0;
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    f++;
                }
            }
            if (f != 0) {
                int d = 0;
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        d = 1;
                        break;
                    }
                }
                if (d == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}

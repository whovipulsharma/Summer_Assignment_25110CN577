import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int[] a = new int[50];
        int s = 0;

        if (n == 0) {
            System.out.println("0");
        } else {
            while (n != 0) {
                a[s] = n % 2;
                n /= 2;
                s++;
            }
            int f=0;

            for (int i = s - 1; i >= 0; i--) {
                if(a[i]==1)
                    f++;
            }
            System.out.print("No. of bits: "+f);
        }
    }
}
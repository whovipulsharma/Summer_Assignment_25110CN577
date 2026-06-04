import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Upper range: ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            int n = i;
            int sum = 0;

            int digits = (int) Math.log10(i) + 1;

            while (n != 0) {
                int d = n % 10;
                sum += (int) Math.pow(d, digits);
                n /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
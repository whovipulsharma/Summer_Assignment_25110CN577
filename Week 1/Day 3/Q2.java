
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Upper range: ");
        int n2 = sc.nextInt();
        int f = 0;
        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are: ");
        for (int i = n1; i <= n2; i++) {
            f = 0;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    f++;
                }
            }
            if (f == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int n, a = 0, b = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        n = sc.nextInt();

        System.out.print(a + " " + b);

        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}
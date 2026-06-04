
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        int n, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            if (i == n) {
                System.out.print("Term is: " + a);
            }
        }
    }
}

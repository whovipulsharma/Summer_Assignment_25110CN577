import java.util.*;

public class Q3
{

    static int gcd(int n1, int n2) {
        int g = 1;
        int m = (n1 < n2) ? n1 : n2;

        for (int i = 1; i <= m; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (g < i) {
                    g = i;
                }
            }
        }

        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("GCD: " + gcd(n1, n2));

    }
}
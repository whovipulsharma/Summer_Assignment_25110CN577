
import java.util.*;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int m1 = 0, m2 = 1;

        for (int i = 2; i <= n ; i++) {
            if (n % i == 0) {
                boolean isPrime=true;;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime) {
                    m1 = i;
                }
                if (m1 > m2) {
                    m2 = m1;
                }
            }
        }
        System.out.println("Largest prime factor: " + m2);
    }
}


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int t = n;
        int digits = (int) Math.log10(n) + 1;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += (int) Math.pow(d, digits);
            n /= 10;
        }

        if (sum == t) {
            System.out.println(t + " is an Armstrong number. ");
        } else {
            System.out.println(t + " is not an Armstrong number. ");
        }

    }
}

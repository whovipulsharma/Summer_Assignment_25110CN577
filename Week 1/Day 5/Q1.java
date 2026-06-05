
import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int s = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (n == s) {
            System.out.println("Entered Number is Perfect number."); 
        }else {
            System.out.println("Entered Number is not Perfect number.");
        }
    }
}

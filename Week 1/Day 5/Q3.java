
import java.util.*;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
System.out.println("Factors are: ");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
            System.out.print(i+" ");
            }
        }
    }
}

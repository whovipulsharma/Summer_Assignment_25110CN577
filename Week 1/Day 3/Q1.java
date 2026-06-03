
import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int f = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
        if (f == 1) {
            System.out.println("Number is Prime"); 
        }else {
            System.out.println("Number is not Prime");
        }
    }
}

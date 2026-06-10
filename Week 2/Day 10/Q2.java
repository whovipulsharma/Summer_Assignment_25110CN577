import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < i; j++)
                System.out.print(" ");

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        sc.close();
    }
}
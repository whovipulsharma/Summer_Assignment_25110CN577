import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Increasing letters
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
            }

            // Decreasing letters
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }

        sc.close();
    }
}
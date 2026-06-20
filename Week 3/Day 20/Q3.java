import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c, sr = 0;

        System.out.println("Enter the size of the matrix:");
        r = sc.nextInt();
        c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("Enter the elements in matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sr += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sr);
            sr = 0;
        }
    }
}
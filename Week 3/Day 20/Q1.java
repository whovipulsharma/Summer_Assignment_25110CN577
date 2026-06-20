import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;

        System.out.println("Enter the size of matrix 1:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.println("Enter the size of matrix 2:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];

        System.out.println("Enter the elements in matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements in matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Entered Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
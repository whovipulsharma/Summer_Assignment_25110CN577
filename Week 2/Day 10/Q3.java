import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int x = sc.nextInt();

        int a = 0, k = 1, m = 1, n=0;

        for (int i = 0; i < x; i++) {

            a = 0;
            m = 1;

            for (int j = 0; j < 2 * x - 1; j++) {

                if (a >= k)
                    break;

                else if ((i + j) >= x - 1) {

                    if (j <= (2 * x - 1) / 2) {
                        System.out.print(m);
                        n = m;
                        m++;
                    } else {
                        System.out.print(--n);
                    }

                    a++;
                }

                else {
                    System.out.print(" ");
                }
            }

            k += 2;
            System.out.println();
        }

        sc.close();
    }
}
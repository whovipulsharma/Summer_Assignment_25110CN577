import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean rep = false;

        for (int i = 0; i < n; i++) {
            boolean chk = false;

            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    chk = true;
                    break;
                }
            }

            if (chk)
                continue;

            int c = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }

            if (c > 1) {
                rep = true;
                System.out.print(a[i] + " repeated at index no: ");

                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j]) {
                        System.out.print(j + " ");
                    }
                }

                System.out.println();
            }
        }

        if (!rep) {
            System.out.println("No Repeat");
        }
    }
}
import java.util.*;

public class Q4 {

    static int lcm(int n1, int n2) {
        int m = (n1 > n2) ? n1 : n2;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if ((n1 * i) == (n2 * j)) {
                    return n1 * i;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("LCM: " + lcm(n1, n2));
    }
}
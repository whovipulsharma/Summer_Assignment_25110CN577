
import java.util.*;

public class Q3 {
    
      static void fibo(int n)
{
    int a=0,b=1;
    System.out.print(a + " " + b);

        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        fibo(n);
    }
}

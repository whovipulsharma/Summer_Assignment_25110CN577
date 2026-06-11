
import java.util.*;

public class Q3 {
    
      static int prime(int a)
{
    int f = 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                f++;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (prime(n)== 0) {
            System.out.println("Number is Prime"); 
        }else {
            System.out.println("Number is not Prime");
        }
    }
}

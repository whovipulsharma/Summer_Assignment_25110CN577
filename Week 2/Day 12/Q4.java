
import java.util.*;

public class Q4 {
    
      static int per(int a)
{
     int s = 0;

        for (int i = 1; i <= a / 2; i++) {
            if (a% i == 0) {
                s += i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (per(n)== n) {
            System.out.println("Number is Perfect"); 
        }else {
            System.out.println("Number is not Perfect");
        }
    }
}

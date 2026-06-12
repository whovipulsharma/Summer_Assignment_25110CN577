
import java.util.*;

public class Q1 {
    
      static int pal(int a)
{
    int s = 0;
        while(a!=0)
        {
            int d=a%10;
            s=s*10+d;
            a/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (pal(n)== n) {
            System.out.println("Number is Palindrome"); 
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}


import java.util.*;
public class Q1
{
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial: "+factorial(n));
    }
}
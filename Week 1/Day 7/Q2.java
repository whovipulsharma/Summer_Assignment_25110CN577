
import java.util.*;
public class Q2
{
    static int fibo(int n)
    {
        if(n==1||n==0)
            return n;
        else
        {
             return fibo(n-1) + fibo(n-2) ;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.err.println("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
    }
}}
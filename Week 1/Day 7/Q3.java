
import java.util.*;
public class Q3
{
    static int s=0;
    static int sum(int n)
    {
        if(n==0)
            return 0;
        else
        {
            int d=n%10;
            s+=d;
            return sum(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sum(n);
        System.out.println("Sum of digits: "+s);
    }
}
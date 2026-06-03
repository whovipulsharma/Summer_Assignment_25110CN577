
import java.util.*;

public class Q1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s+=d;
            n/=10;
        }
        System.out.println("Sum of digits of a number: "+s);
    }
}
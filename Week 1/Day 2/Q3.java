
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int p=1;
        while(n!=0)
        {
            int d=n%10;
            p*=d;
            n/=10;
        }
        System.out.println("Product of a number: "+p);
    }
}
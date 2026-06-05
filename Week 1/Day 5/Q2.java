
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int t=n;
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            int p=1;
            for(int i=1;i<=d;i++ )
            {
p*=i;
            }
            s+=p;
            n/=10;
        }
        if (t == s) {
            System.out.println("Entered Number is Strong number."); 
        }else {
            System.out.println("Entered Number is not Strong number.");
        }
}
}
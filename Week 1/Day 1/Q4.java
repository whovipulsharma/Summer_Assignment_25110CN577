
import java.util.Scanner;

public class Q4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=0;
        while(n!=0)
        {
            n/=10;
            i++;
        }
        System.out.println("Number of digits: "+i);
    }
}
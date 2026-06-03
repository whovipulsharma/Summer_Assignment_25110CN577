
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n=sc.nextInt();
        int s=0;
        for (int i = 1; i <= n; i++) {
            s+=i;
        }
        System.out.println("The sum of the first n natural numbers: "+s);
    }
}
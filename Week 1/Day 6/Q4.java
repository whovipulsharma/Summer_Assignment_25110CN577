
import java.util.Scanner;

public class Q4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Enter the power: ");
        int p=sc.nextInt();
        int x=1;
        for (int i = 1; i <=p; i++) {
            x*=n;
        }
        System.out.println("Power: "+x);
    }
}
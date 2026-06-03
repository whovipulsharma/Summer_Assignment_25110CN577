
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        System.out.print("Enter the Range: ");
        int x=sc.nextInt();
        System.out.println("Table of "+n+": ");
        for (int i = 1; i <= x; i++) {
           System.out.println(n+" * "+i+" = "+(n*i));
        }
        
    }
}
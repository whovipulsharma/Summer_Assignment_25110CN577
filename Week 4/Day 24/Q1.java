
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String x=sc.next();
        System.out.println("Enter the string 2: ");
        String y=sc.next();
        if(x.length()!=y.length())
        {
            System.out.println("Not a rotated strings!!");
            System.exit(0);
        }
        x=x+x;
        int k=0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)==y.charAt(0))
            {
                if(x.substring(i,i+y.length()).equals(y))
                k++;
                break;
            }
        }
        if(k==1)
       System.out.println("Entered strings are rotated strings");
        else
        System.out.println("Not a rotated strings");
    }
}
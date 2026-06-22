
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.next();
        String y="";
        for (int i = 0; i < x.length(); i++) {
            y=x.charAt(i)+y;
        }
        int f=0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)==y.charAt(i))
            f++;
        }
        if(f==x.length())
        System.out.println("Entered string is palindrome");
        else
        System.out.println("Entered string is not palindrome");
    }
}
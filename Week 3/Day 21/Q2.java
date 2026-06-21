
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.next();
        String y="";
        for (int i = 0; i < x.length(); i++) {
            y=x.charAt(i)+y;
        }
        System.out.println("The reverse of entered string is: "+y);
    }
}
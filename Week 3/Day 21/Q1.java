
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine();
        char a[]= x.toCharArray();
        System.out.println("The length of entered string is: "+a.length);
    }
}
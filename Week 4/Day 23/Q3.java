
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String x=sc.nextLine().replace(" ", "").toLowerCase();
        System.out.println("Enter the string 2: ");
        String y=sc.nextLine().replace(" ", "").toLowerCase();
        if(x.length()!=y.length())
        {
            System.out.println("Entered strings are not anagram");
            System.exit(0);
        }
        int s1=0,s2=0;
        for (int i = 0; i < x.length(); i++) {
            s1+=x.charAt(i);
            s2+=y.charAt(i);
    }
    if(s1!=s2)
    System.out.println("Entered strings are not anagram");
    else
    System.out.println("Entered strings are anagram");
}
}
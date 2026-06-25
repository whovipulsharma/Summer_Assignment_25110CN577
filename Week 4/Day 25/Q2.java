
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine().replace(" ", "");
        String y="";
        for (int i = 0; i < x.length(); i++) {
            int f=0;
        for (int j = 0; j < i; j++) {
            if(x.charAt(i)==x.charAt(j))
            {
                f++;
                break;
            }
        }
        if(f==0)
        y=y+x.charAt(i);
        }
        System.out.println("Repeated characters: ");
         for (int i = 0; i < y.length(); i++) {
            int f=0;
        for (int j = 0; j <x.length() ; j++) {
            if(y.charAt(i)==x.charAt(j))
            {
                f++;
            }
        }
        if(f>1)
        System.out.println(y.charAt(i));
        }
    }
}
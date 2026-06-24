
import java.util.Scanner;

public class Q4{
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
        System.out.println("String without repeated characters: "+y);
    }
}
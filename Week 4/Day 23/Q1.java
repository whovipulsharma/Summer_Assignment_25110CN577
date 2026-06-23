
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine().replace(" ", "");
        for (int i = 0; i < x.length(); i++) {
            int f=0;
            for (int j = 0; j < x.length(); j++) {
                if(x.charAt(i)==x.charAt(j))
                f++;
            }
            if(f==1)
            {
                System.out.println("First non repeating character: "+x.charAt(i));
                break;
            }
        }
    }
}
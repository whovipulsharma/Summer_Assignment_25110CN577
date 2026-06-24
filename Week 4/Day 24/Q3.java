
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine().trim();
        s=s+" ";
        String x="";
        int k=0;
            for (int j = 0; j < s.length(); j++) {
               String y="";
                if(s.charAt(j)==' ')
                {
                    y=s.substring(k,j);
                    k=j;
                }
                if(x.length()<y.length())
                x=y;
            }
        System.out.println("Longest word:"+x);
    }
}
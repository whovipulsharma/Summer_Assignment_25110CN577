
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine().trim();
        x=" "+x+" ";
        int f=0;
        for (int i = 0; i < x.length()-1; i++) {
            if(x.charAt(i)==' '){
            if((x.charAt(i+1)>=65)||(x.charAt(i+1)<=90)||(x.charAt(i+1)>=97)||(x.charAt(i+1)<=122))
            f++;
        }}
        System.out.println("No of words: "+f);
    }
}
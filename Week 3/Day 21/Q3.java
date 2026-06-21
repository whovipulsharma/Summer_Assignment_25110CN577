
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine();
        System.out.println("Entered String: \n"+x);
        x=x.toLowerCase();
        int v=0,c=0;
        for (int i = 0; i < x.length(); i++) {
            char a=x.charAt(i);
            if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
            v++;
            else if(a==' ')
            continue;
            else
            c++;
        }
        System.out.println("Number of vowels: "+v);
        System.out.println("Number of consonants: "+c);
    }
}
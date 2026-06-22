
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x=sc.nextLine();
        System.out.println("String without spaces: "+x.replace(" ",""));
    }
}

import java.util.*;


public class Q1
{
    static int sum(int a,int b)
{
    int s=a+b;
    return s;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first nummber: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second nummber: ");
        int n2=sc.nextInt();
        System.out.println("Sum: "+sum(n1,n2));
    }
}
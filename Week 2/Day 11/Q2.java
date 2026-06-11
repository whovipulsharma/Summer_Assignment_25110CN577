
import java.util.*;

public class Q2
{
    static int max(int a,int b)
{
    int t=a>b?a:b;
    return t;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first nummber: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second nummber: ");
        int n2=sc.nextInt();
        System.out.println("Maximum: "+max(n1,n2));
    }
}
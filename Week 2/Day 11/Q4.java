
import java.util.*;


public class Q4
{
    static int fact(int a)
{
    int f=1;
        for (int i = 1; i <= a; i++) {
            f*=i;
        }
    return f;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first nummber: ");
        int n1=sc.nextInt();
        System.out.println("Factorial: "+fact(n1));
    }
}
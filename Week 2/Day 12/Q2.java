
import java.util.*;

public class Q2 {
    
      static int arm(int a,int x)
{
    int s = 0;
        while(a!=0)
        {
            int d=a%10;
            s+=Math.pow(d, x);
            a/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int x=(int)Math.log10(n)+1;
        if (arm(n,x)== n) {
            System.out.println("Number is Armstrong"); 
        }else {
            System.out.println("Number is not Armstrong");
        }
    }
}

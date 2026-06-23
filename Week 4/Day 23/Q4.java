
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
        if(y.length()==x.length())
        {
            System.out.println("All the letters in string have same frequency");
            System.exit(0);
        }
        int a[]=new int[y.length()];
         for (int i = 0; i < y.length(); i++) {
            int f=0;
        for (int j = 0; j < x.length(); j++) {
            if(y.charAt(i)==x.charAt(j))
            {
                f++;
            }
        }
        a[i]=f;
        }
        int same = 0;

for(int i=0;i<a.length;i++)
{
    if(a[i] == a[0])
    {
        same++;
    }
}

if(same == y.length())
{
    System.out.println("All the letters in string have same frequency");
    System.exit(0);
}
        int m=a[0];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(m<a[i])
            {
                m=a[i];
                k=i;
            }
        }
        
        System.out.println("Highest frequency element: "+y.charAt(k));
    }
}
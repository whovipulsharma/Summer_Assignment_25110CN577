import java.util.*;
public class Q3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of lines: ");
int n=sc.nextInt();
for (int i = 65; i-64 <= n; i++) {
    for (int j = 1; (j+64) <= i; j++) {
        System.out.print((char)i+" ");
    }
    System.out.println("");
    
}
}
}
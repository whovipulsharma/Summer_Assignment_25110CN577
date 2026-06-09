import java.util.*;
public class Q3
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of lines: ");
int n=sc.nextInt();
for (int i = 1; i <= n; i++) {
    for (int j = 65; (j-64) <= i; j++) {
        System.out.print((char)j+" ");
    }
    System.out.println("");
    
}
}
}
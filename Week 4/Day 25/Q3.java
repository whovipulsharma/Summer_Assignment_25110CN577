
import java.util.*;

public class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the record size: ");
        int n=sc.nextInt();
        sc.nextLine();
        String rec[]=new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            rec[i]=sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(rec[j].compareTo(rec[j+1])>0)
                {
                    String t=rec[j];
                    rec[j]=rec[j+1];
                   rec[j+1]=t;
                }
            }
        }
        System.out.println("Sorted record: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+") "+rec[i]);
        }
    }
}
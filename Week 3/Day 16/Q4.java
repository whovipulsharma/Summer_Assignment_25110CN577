import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array after removing duplicates: ");
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.print(a[i]+" ");
        }
    }
}
import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("\nARRAY OPERATIONS SYSTEM");
        System.out.println("***********************");
        System.out.println("1. Display Array");
        System.out.println("2. Sort Array");
        System.out.println("3. Search Element");
        System.out.println("4. Find Maximum");
        System.out.println("5. Find Minimum");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Array Elements:");
                for(int i = 0; i < n; i++)
                {
                    System.out.print(a[i] + " ");
                }
                break;

            case 2:
                for(int i = 0; i < n - 1; i++)
                {
                    for(int j = i + 1; j < n; j++)
                    {
                        if(a[i] > a[j])
                        {
                            int t = a[i];
                            a[i] = a[j];
                            a[j] = t;
                        }
                    }
                }

                System.out.println("Sorted Array:");
                for(int i = 0; i < n; i++)
                {
                    System.out.print(a[i] + " ");
                }
                break;

            case 3:
                System.out.print("Enter Element to Search: ");
                int x = sc.nextInt();

                int f = 0;

                for(int i = 0; i < n; i++)
                {
                    if(a[i] == x)
                    {
                        f = 1;
                        break;
                    }
                }

                if(f == 1)
                    System.out.println("Element Found.");
                else
                    System.out.println("Element Not Found.");
                break;

            case 4:
                int max = a[0];

                for(int i = 1; i < n; i++)
                {
                    if(a[i] > max)
                        max = a[i];
                }

                System.out.println("Maximum Element = " + max);
                break;

            case 5:
                int min = a[0];

                for(int i = 1; i < n; i++)
                {
                    if(a[i] < min)
                        min = a[i];
                }

                System.out.println("Minimum Element = " + min);
                break;

            case 6:
                System.out.println("Thank You.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
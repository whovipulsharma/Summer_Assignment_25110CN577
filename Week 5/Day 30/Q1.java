import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        String name[] = new String[n];
        int reg[] = new int[n];
        long phone[] = new long[n];

        System.out.println("\nEnter Student Details");

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.print("\nEnter Student Name: ");
            name[i]=sc.nextLine();

            System.out.print("Enter Registration ID: ");
            reg[i]=sc.nextInt();

            System.out.print("Enter Phone Number: ");
            phone[i]=sc.nextLong();
        }

        System.out.println("\nSTUDENT RECORD SYSTEM");
        System.out.println("*********************");
        System.out.println("1. Display All Records");
        System.out.println("2. Search Student");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:

                System.out.println("\nStudent Records");
                System.out.println("---------------");

                for(int i=0;i<n;i++)
                {
                    System.out.println("\nStudent Name : "+name[i]);
                    System.out.println("Registration ID : "+reg[i]);
                    System.out.println("Phone Number : "+phone[i]);
                }
                break;

            case 2:

                System.out.print("Enter Registration ID: ");
                int x=sc.nextInt();

                int f=0;

                for(int i=0;i<n;i++)
                {
                    if(reg[i]==x)
                    {
                        System.out.println("\nStudent Name : "+name[i]);
                        System.out.println("Registration ID : "+reg[i]);
                        System.out.println("Phone Number : "+phone[i]);
                        f=1;
                        break;
                    }
                }

                if(f==0)
                    System.out.println("Student Record Not Found.");

                break;

            case 3:

                System.out.println("Thank You.");
                break;

            default:

                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
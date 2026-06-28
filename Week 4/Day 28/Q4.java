import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CONTACT MANAGEMENT PORTAL");
        System.out.println("*************************");
        System.out.println("1. View Contact");
        System.out.println("2. Add Contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:

                System.out.print("Enter Contact ID: ");
                int id = sc.nextInt();

                switch(id)
                {
                    case 101:
                        System.out.println("\nContact Name : Abhishek Mishra");
                        System.out.println("Contact ID : 101");
                        System.out.println("Phone Number : 9876543210");
                        System.out.println("Email ID : abhishek@gmail.com");
                        System.out.println("City : Greater Noida");
                        break;

                    case 102:
                        System.out.println("\nContact Name : Tushar Sharma");
                        System.out.println("Contact ID : 102");
                        System.out.println("Phone Number : 8765432109");
                        System.out.println("Email ID : tushar@gmail.com");
                        System.out.println("City : Delhi");
                        break;

                    case 103:
                        System.out.println("\nContact Name : Sejal Singh");
                        System.out.println("Contact ID : 103");
                        System.out.println("Phone Number : 7654321098");
                        System.out.println("Email ID : sejal@gmail.com");
                        System.out.println("City : Lucknow");
                        break;

                    default:
                        System.out.println("Contact Not Found.");
                }
                break;

            case 2:

                sc.nextLine();

                System.out.print("Enter Contact Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Contact ID: ");
                int i = sc.nextInt();

                System.out.print("Enter Phone Number: ");
                long p = sc.nextLong();

                sc.nextLine();

                System.out.print("Enter Email ID: ");
                String e = sc.nextLine();

                System.out.print("Enter City: ");
                String c = sc.nextLine();

                System.out.println("\nContact Added Successfully.");
                System.out.println("Contact Name : " + n);
                System.out.println("Contact ID : " + i);
                System.out.println("Phone Number : " + p);
                System.out.println("Email ID : " + e);
                System.out.println("City : " + c);
                break;

            case 3:

                System.out.print("Enter Contact ID: ");
                int x = sc.nextInt();

                switch(x)
                {
                    case 101:
                    case 102:
                    case 103:

                        System.out.print("Enter New Phone Number: ");
                        long np = sc.nextLong();

                        sc.nextLine();

                        System.out.print("Enter New Email ID: ");
                        String ne = sc.nextLine();

                        System.out.println("\nContact Updated Successfully.");
                        System.out.println("Phone Number : " + np);
                        System.out.println("Email ID : " + ne);
                        break;

                    default:
                        System.out.println("Contact Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You for Using Contact Management Portal.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
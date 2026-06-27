import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CAMPUS CONNECT PORTAL");
        System.out.println("*********************");
        System.out.println("1. View Student Record");
        System.out.println("2. Add Student Record");
        System.out.println("3. Update Student Record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter Registration ID: ");
                int id = sc.nextInt();

                switch(id) {
                    case 101:
                        System.out.println("\nStudent Name : Avirup Das");
                        System.out.println("Registration ID : 101");
                        System.out.println("Phone Number : 9654210258");
                        break;

                    case 102:
                        System.out.println("\nStudent Name : Shreya Singh");
                        System.out.println("Registration ID : 102");
                        System.out.println("Phone Number : 8745691230");
                        break;

                    case 103:
                        System.out.println("\nStudent Name : Harshvardhan");
                        System.out.println("Registration ID : 103");
                        System.out.println("Phone Number : 9647200316");
                        break;

                    default:
                        System.out.println("Student Record Not Found.");
                }
                break;

            case 2:
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Registration ID: ");
                int r = sc.nextInt();

                System.out.print("Enter Phone Number: ");
                long p = sc.nextLong();

                System.out.println("\nStudent Record Added Successfully.");
                System.out.println("Student Name : " + n);
                System.out.println("Registration ID : " + r);
                System.out.println("Phone Number : " + p);
                break;

            case 3:
                System.out.print("Enter Registration ID: ");
                int x = sc.nextInt();

                switch(x) {
                    case 101:
                    case 102:
                    case 103:
                        System.out.print("Enter New Phone Number: ");
                        long ph = sc.nextLong();
                        System.out.println("Record Updated Successfully.");
                        System.out.println("New Phone Number : " + ph);
                        break;

                    default:
                        System.out.println("Student Record Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
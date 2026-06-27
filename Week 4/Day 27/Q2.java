import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EMPLOYEE DIRECTORY SYSTEM");
        System.out.println("**************************");
        System.out.println("1. View Employee Record");
        System.out.println("2. Add Employee Record");
        System.out.println("3. Update Employee Record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                switch(id) {
                    case 201:
                        System.out.println("\nEmployee Name : Raj Sharma");
                        System.out.println("Employee ID : 201");
                        System.out.println("Phone Number : 9876543210");
                        break;

                    case 202:
                        System.out.println("\nEmployee Name : Priya Verma");
                        System.out.println("Employee ID : 202");
                        System.out.println("Phone Number : 8765432109");
                        break;

                    case 203:
                        System.out.println("\nEmployee Name : Aman Gupta");
                        System.out.println("Employee ID : 203");
                        System.out.println("Phone Number : 7654321098");
                        break;

                    default:
                        System.out.println("Employee Record Not Found.");
                }
                break;

            case 2:
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Employee ID: ");
                int e = sc.nextInt();

                System.out.print("Enter Phone Number: ");
                long p = sc.nextLong();

                System.out.println("\nEmployee Record Added Successfully.");
                System.out.println("Employee Name : " + n);
                System.out.println("Employee ID : " + e);
                System.out.println("Phone Number : " + p);
                break;

            case 3:
                System.out.print("Enter Employee ID: ");
                int x = sc.nextInt();

                switch(x) {
                    case 201:
                    case 202:
                    case 203:
                        System.out.print("Enter New Phone Number: ");
                        long ph = sc.nextLong();
                        System.out.println("Record Updated Successfully.");
                        System.out.println("New Phone Number : " + ph);
                        break;

                    default:
                        System.out.println("Employee Record Not Found.");
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
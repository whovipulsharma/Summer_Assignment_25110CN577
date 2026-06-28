import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HBN BANK");
        System.out.println("NET BANKING PORTAL");
        System.out.println("******************");

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        if ((id == 1001 && pwd.equals("HBN@123")) ||
            (id == 1002 && pwd.equals("HBN@456")) ||
            (id == 1003 && pwd.equals("HBN@789"))) {

            System.out.println("\nLogin Successful.\n");

            System.out.println("1. View Account Record");
            System.out.println("2. Add Account Record");
            System.out.println("3. Update Account Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    switch (id) {

                        case 1001:
                            System.out.println("\nCustomer Name : Abhishek Mishra");
                            System.out.println("Customer ID : 1001");
                            System.out.println("Account Number : 1001001001");
                            System.out.println("IFSC Code : HBNB0001001");
                            System.out.println("Phone Number : 9876543210");
                            System.out.println("Account Type : Savings");
                            System.out.println("Available Balance : Rs. 75250.50");
                            break;

                        case 1002:
                            System.out.println("\nCustomer Name : Tushar Sharma");
                            System.out.println("Customer ID : 1002");
                            System.out.println("Account Number : 1001001002");
                            System.out.println("IFSC Code : HBNB0001002");
                            System.out.println("Phone Number : 8765432109");
                            System.out.println("Account Type : Current");
                            System.out.println("Available Balance : Rs. 125000.75");
                            break;

                        case 1003:
                            System.out.println("\nCustomer Name : Sejal Singh");
                            System.out.println("Customer ID : 1003");
                            System.out.println("Account Number : 1001001003");
                            System.out.println("IFSC Code : HBNB0001003");
                            System.out.println("Phone Number : 7654321098");
                            System.out.println("Account Type : Savings");
                            System.out.println("Available Balance : Rs. 98540.25");
                            break;
                    }
                    break;

                case 2:
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();

                    System.out.print("Enter Account Number: ");
                    long ac = sc.nextLong();

                    sc.nextLine();

                    System.out.print("Enter IFSC Code: ");
                    String ifsc = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    long p = sc.nextLong();

                    sc.nextLine();

                    System.out.print("Enter Account Type: ");
                    String t = sc.nextLine();

                    System.out.print("Enter Opening Balance: ");
                    double b = sc.nextDouble();

                    System.out.println("\nAccount Added Successfully.");
                    System.out.println("Customer Name : " + n);
                    System.out.println("Customer ID : " + cid);
                    System.out.println("Account Number : " + ac);
                    System.out.println("IFSC Code : " + ifsc);
                    System.out.println("Phone Number : " + p);
                    System.out.println("Account Type : " + t);
                    System.out.println("Available Balance : Rs. " + b);
                    break;

                case 3:
                    switch (id) {

                        case 1001:
                        case 1002:
                        case 1003:

                            System.out.print("Enter New Phone Number: ");
                            long np = sc.nextLong();

                            System.out.print("Enter New Balance: ");
                            double nb = sc.nextDouble();

                            System.out.println("\nAccount Updated Successfully.");
                            System.out.println("Phone Number : " + np);
                            System.out.println("Available Balance : Rs. " + nb);
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Thank You for Banking with HBN BANK.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
        else {
            System.out.println("\nInvalid Customer ID or Password.");
        }
    }
}
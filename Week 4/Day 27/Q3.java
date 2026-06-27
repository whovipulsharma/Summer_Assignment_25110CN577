import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PAYROLL MANAGEMENT PORTAL");
        System.out.println("*************************");
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
                        System.out.println("\nEmployee Name : Abhishek Mishra");
                        System.out.println("Employee ID : 201");
                        System.out.println("Phone Number : 9876543210");
                        System.out.println("Gross Salary : Rs. 50000.00");
                        System.out.println("PF Deduction : Rs. 1800.00");
                        System.out.println("Meal Deduction : Rs. 500.00");
                        System.out.println("Children Allowance : Rs. 200.00");
                        System.out.println("Net Salary : Rs. 47900.00");
                        break;

                    case 202:
                        System.out.println("\nEmployee Name : Tushar Sharma");
                        System.out.println("Employee ID : 202");
                        System.out.println("Phone Number : 8765432109");
                        System.out.println("Gross Salary : Rs. 45000.00");
                        System.out.println("PF Deduction : Rs. 1800.00");
                        System.out.println("Meal Deduction : Rs. 500.00");
                        System.out.println("Children Allowance : Rs. 200.00");
                        System.out.println("Net Salary : Rs. 42900.00");
                        break;

                    case 203:
                        System.out.println("\nEmployee Name : Sejal Singh");
                        System.out.println("Employee ID : 203");
                        System.out.println("Phone Number : 7654321098");
                        System.out.println("Gross Salary : Rs. 60000.00");
                        System.out.println("PF Deduction : Rs. 1800.00");
                        System.out.println("Meal Deduction : Rs. 500.00");
                        System.out.println("Children Allowance : Rs. 200.00");
                        System.out.println("Net Salary : Rs. 57900.00");
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

                System.out.print("Enter Gross Salary: ");
                double g = sc.nextDouble();

                System.out.print("Enter PF Deduction: ");
                double pf = sc.nextDouble();

                System.out.print("Enter Meal Deduction: ");
                double md = sc.nextDouble();

                double ca = 200.00;
                double net = g - pf - md + ca;

                System.out.println("\nEmployee Record Added Successfully.");
                System.out.println("Employee Name : " + n);
                System.out.println("Employee ID : " + e);
                System.out.println("Phone Number : " + p);
                System.out.println("Gross Salary : Rs. " + g);
                System.out.println("PF Deduction : Rs. " + pf);
                System.out.println("Meal Deduction : Rs. " + md);
                System.out.println("Children Allowance : Rs. " + ca);
                System.out.println("Net Salary : Rs. " + net);
                break;

            case 3:
                System.out.print("Enter Employee ID: ");
                int x = sc.nextInt();

                switch(x) {

                    case 201:
                    case 202:
                    case 203:

                        System.out.print("Enter New Gross Salary: ");
                        double ng = sc.nextDouble();

                        System.out.print("Enter New PF Deduction: ");
                        double npf = sc.nextDouble();

                        System.out.print("Enter New Meal Deduction: ");
                        double nmd = sc.nextDouble();

                        double nca = 200.00;
                        double ns = ng - npf - nmd + nca;

                        System.out.println("\nRecord Updated Successfully.");
                        System.out.println("Gross Salary : Rs. " + ng);
                        System.out.println("PF Deduction : Rs. " + npf);
                        System.out.println("Meal Deduction : Rs. " + nmd);
                        System.out.println("Children Allowance : Rs. " + nca);
                        System.out.println("Net Salary : Rs. " + ns);
                        break;

                    default:
                        System.out.println("Employee Record Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You for Using Payroll Management Portal.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
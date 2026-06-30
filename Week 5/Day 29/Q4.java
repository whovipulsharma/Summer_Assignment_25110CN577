import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INVENTORY MANAGEMENT PORTAL");
        System.out.println("***************************");
        System.out.println("1. View Product Record");
        System.out.println("2. Add Product Record");
        System.out.println("3. Update Product Record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                switch(id)
                {
                    case 101:
                        System.out.println("\nProduct Name : Aashirvaad Atta");
                        System.out.println("Product ID : 101");
                        System.out.println("Category : Grocery");
                        System.out.println("Quantity : 120");
                        System.out.println("Price : Rs. 365.00");
                        System.out.println("Supplier : ITC Ltd.");
                        break;

                    case 102:
                        System.out.println("\nProduct Name : Dettol Hand Wash");
                        System.out.println("Product ID : 102");
                        System.out.println("Category : Personal Care");
                        System.out.println("Quantity : 85");
                        System.out.println("Price : Rs. 120.00");
                        System.out.println("Supplier : Reckitt India");
                        break;

                    case 103:
                        System.out.println("\nProduct Name : Classmate Notebook");
                        System.out.println("Product ID : 103");
                        System.out.println("Category : Stationery");
                        System.out.println("Quantity : 200");
                        System.out.println("Price : Rs. 85.00");
                        System.out.println("Supplier : ITC Ltd.");
                        break;

                    default:
                        System.out.println("Product Record Not Found.");
                }
                break;

            case 2:

                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Product ID: ");
                int p = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Category: ");
                String c = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int q = sc.nextInt();

                System.out.print("Enter Price: ");
                double pr = sc.nextDouble();

                sc.nextLine();

                System.out.print("Enter Supplier Name: ");
                String s = sc.nextLine();

                System.out.println("\nProduct Record Added Successfully.");
                System.out.println("Product Name : " + n);
                System.out.println("Product ID : " + p);
                System.out.println("Category : " + c);
                System.out.println("Quantity : " + q);
                System.out.println("Price : Rs. " + pr);
                System.out.println("Supplier : " + s);
                break;

            case 3:

                System.out.print("Enter Product ID: ");
                int x = sc.nextInt();

                switch(x)
                {
                    case 101:
                    case 102:
                    case 103:

                        System.out.print("Enter New Quantity: ");
                        int nq = sc.nextInt();

                        System.out.print("Enter New Price: ");
                        double np = sc.nextDouble();

                        System.out.println("\nProduct Record Updated Successfully.");
                        System.out.println("Updated Quantity : " + nq);
                        System.out.println("Updated Price : Rs. " + np);
                        break;

                    default:
                        System.out.println("Product Record Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You for Using Inventory Management Portal.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
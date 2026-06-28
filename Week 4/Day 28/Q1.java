import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("LIBRARY MANAGEMENT PORTAL");
        System.out.println("**************************");
        System.out.println("1. View Book Record");
        System.out.println("2. Add Book Record");
        System.out.println("3. Update Book Record");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter ISBN Number: ");
                long isbn = sc.nextLong();

                switch((int)isbn) {
                    default:
                        if(isbn == 9780134685991L) {
                            System.out.println("\nBook Name : Effective Java");
                            System.out.println("ISBN Number : 9780134685991");
                            System.out.println("Author : Joshua Bloch");
                            System.out.println("Category : Programming");
                            System.out.println("Price : Rs. 850.00");
                            System.out.println("Status : Available");
                        }
                        else if(isbn == 9781492078005L) {
                            System.out.println("\nBook Name : Learning Java");
                            System.out.println("ISBN Number : 9781492078005");
                            System.out.println("Author : Marc Loy");
                            System.out.println("Category : Programming");
                            System.out.println("Price : Rs. 950.00");
                            System.out.println("Status : Issued");
                        }
                        else if(isbn == 9789355421463L) {
                            System.out.println("\nBook Name : Data Structures Using Java");
                            System.out.println("ISBN Number : 9789355421463");
                            System.out.println("Author : Reema Thareja");
                            System.out.println("Category : Computer Science");
                            System.out.println("Price : Rs. 699.00");
                            System.out.println("Status : Available");
                        }
                        else {
                            System.out.println("Book Record Not Found.");
                        }
                }
                break;

            case 2:
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                String n = sc.nextLine();

                System.out.print("Enter ISBN Number: ");
                long i = sc.nextLong();

                if(String.valueOf(i).length() != 13) {
                    System.out.println("Invalid ISBN Number.");
                    break;
                }

                sc.nextLine();

                System.out.print("Enter Author Name: ");
                String a = sc.nextLine();

                System.out.print("Enter Category: ");
                String c = sc.nextLine();

                System.out.print("Enter Book Price: ");
                double p = sc.nextDouble();

                System.out.println("\nBook Record Added Successfully.");
                System.out.println("Book Name : " + n);
                System.out.println("ISBN Number : " + i);
                System.out.println("Author : " + a);
                System.out.println("Category : " + c);
                System.out.println("Price : Rs. " + p);
                System.out.println("Status : Available");
                break;

            case 3:
                System.out.print("Enter ISBN Number: ");
                long x = sc.nextLong();

                if(x == 9780134685991L || x == 9781492078005L || x == 9789355421463L) {

                    sc.nextLine();

                    System.out.print("Enter New Book Name: ");
                    String bn = sc.nextLine();

                    System.out.print("Enter New Author Name: ");
                    String an = sc.nextLine();

                    System.out.print("Enter New Price: ");
                    double pr = sc.nextDouble();

                    System.out.println("\nBook Record Updated Successfully.");
                    System.out.println("Book Name : " + bn);
                    System.out.println("Author : " + an);
                    System.out.println("Price : Rs. " + pr);
                }
                else {
                    System.out.println("Book Record Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You for Using Library Management Portal.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
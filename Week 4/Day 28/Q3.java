import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INDIAN RAILWAY TRAIN MANAGEMENT SYSTEM");
        System.out.println("**************************************");
        System.out.println("1. View Bookings");
        System.out.println("2. Book Ticket");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Enter PNR Number: ");
                long pnr = sc.nextLong();

                if(pnr == 3456789012L)
                {
                    System.out.println("\nPassenger Name : Abhishek Mishra");
                    System.out.println("PNR Number : 3456789012");
                    System.out.println("Train : Vande Bharat Express");
                    System.out.println("From : New Delhi");
                    System.out.println("To : Varanasi");
                    System.out.println("Coach : C2");
                    System.out.println("Seat Number : 25");
                    System.out.println("Departure : 06:00 AM");
                    System.out.println("Fare : Rs. 1650.00");
                    System.out.println("Status : Confirmed");
                }
                else if(pnr == 4567890123L)
                {
                    System.out.println("\nPassenger Name : Tushar Sharma");
                    System.out.println("PNR Number : 4567890123");
                    System.out.println("Train : Rajdhani Express");
                    System.out.println("From : New Delhi");
                    System.out.println("To : Mumbai Central");
                    System.out.println("Coach : B3");
                    System.out.println("Seat Number : 18");
                    System.out.println("Departure : 09:30 PM");
                    System.out.println("Fare : Rs. 2450.00");
                    System.out.println("Status : Confirmed");
                }
                else if(pnr == 5678901234L)
                {
                    System.out.println("\nPassenger Name : Sejal Singh");
                    System.out.println("PNR Number : 5678901234");
                    System.out.println("Train : Shatabdi Express");
                    System.out.println("From : Lucknow");
                    System.out.println("To : New Delhi");
                    System.out.println("Coach : C1");
                    System.out.println("Seat Number : 12");
                    System.out.println("Departure : 03:15 PM");
                    System.out.println("Fare : Rs. 1350.00");
                    System.out.println("Status : RAC");
                }
                else
                {
                    System.out.println("Booking Not Found.");
                }
                break;

            case 2:

                sc.nextLine();

                System.out.print("Enter Passenger Name: ");
                String n = sc.nextLine();

                System.out.print("From Station: ");
                String f = sc.nextLine();

                System.out.print("To Station: ");
                String t = sc.nextLine();

                System.out.println("\nAvailable Trains");
                System.out.println("****************");
                System.out.println("1. Vande Bharat Express");
                System.out.println("   Departure : 06:00 AM");
                System.out.println("   Fare : Rs. 1650.00");

                System.out.println("\n2. Rajdhani Express");
                System.out.println("   Departure : 09:30 PM");
                System.out.println("   Fare : Rs. 2450.00");

                System.out.println("\n3. Shatabdi Express");
                System.out.println("   Departure : 03:15 PM");
                System.out.println("   Fare : Rs. 1350.00");

                System.out.print("\nSelect Train: ");
                int tr = sc.nextInt();

                switch(tr)
                {
                    case 1:
                        System.out.println("\nTicket Booked Successfully.");
                        System.out.println("Passenger Name : " + n);
                        System.out.println("PNR Number : 3456789015");
                        System.out.println("Train : Vande Bharat Express");
                        System.out.println("From : " + f);
                        System.out.println("To : " + t);
                        System.out.println("Coach : C2");
                        System.out.println("Seat Number : 25");
                        System.out.println("Departure : 06:00 AM");
                        System.out.println("Fare : Rs. 1650.00");
                        System.out.println("Status : Confirmed");
                        break;

                    case 2:
                        System.out.println("\nTicket Booked Successfully.");
                        System.out.println("Passenger Name : " + n);
                        System.out.println("PNR Number : 4567890126");
                        System.out.println("Train : Rajdhani Express");
                        System.out.println("From : " + f);
                        System.out.println("To : " + t);
                        System.out.println("Coach : B3");
                        System.out.println("Seat Number : 18");
                        System.out.println("Departure : 09:30 PM");
                        System.out.println("Fare : Rs. 2450.00");
                        System.out.println("Status : Confirmed");
                        break;

                    case 3:
                        System.out.println("\nTicket Booked Successfully.");
                        System.out.println("Passenger Name : " + n);
                        System.out.println("PNR Number : 5678901237");
                        System.out.println("Train : Shatabdi Express");
                        System.out.println("From : " + f);
                        System.out.println("To : " + t);
                        System.out.println("Coach : C1");
                        System.out.println("Seat Number : 12");
                        System.out.println("Departure : 03:15 PM");
                        System.out.println("Fare : Rs. 1350.00");
                        System.out.println("Status : Confirmed");
                        break;

                    default:
                        System.out.println("Invalid Train Selection.");
                }
                break;

            case 3:
                System.out.println("Thank You for Using IRTMS.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
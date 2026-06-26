import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int b = 10000;

        System.out.println("ATM SIMULATION");
        System.out.println("**************");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                System.out.println("Your balance is Rs. " + b);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                int d = sc.nextInt();
                b+= d;
                System.out.println("Amount deposited successfully.");
                System.out.println("Current balance is Rs. " + b);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int w = sc.nextInt();

                if(w <= b) {
                    b-=w;
                    System.out.println("Please collect your cash.");
                    System.out.println("Current balance is Rs. " + b);
                }
                else {
                    System.out.println("Insufficient balance.");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM.");
                break;

            default:
                System.out.println("Invalid Choice!!");
        }

        sc.close();
    }
}
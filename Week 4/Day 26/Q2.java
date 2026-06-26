import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VOTING ELIGIBILITY SYSTEM");
        System.out.println("*************************");

        System.out.print("Enter your name: ");
        String n = sc.nextLine();

        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("Congratulations " + n + "!");
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Sorry " + n + "!\nYou are not eligible to vote.\n"+"You can vote after " + (18 - a) + " year(s).");
        }
    }
}
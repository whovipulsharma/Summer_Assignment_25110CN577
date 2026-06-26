import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int s = 0;

        System.out.println("QUIZ APPLICATION");
        System.out.println("****************");

        System.out.println("Q1. Which logic gate outputs 1 only when all inputs are 1?");
        System.out.println("1. XOR");
        System.out.println("2. AND");
        System.out.println("3. OR");
        System.out.println("4. NOR");
        System.out.print("Enter your answer: ");
        int a = sc.nextInt();

        if (a == 2)
            s++;

        System.out.println("\nQ2. Who is known as the \"Father of Modern Physics\"?");
        System.out.println("1. Nikola Tesla");
        System.out.println("2. Isaac Newton");
        System.out.println("3. Galileo Galilei");
        System.out.println("4. Albert Einstein");
        System.out.print("Enter your answer: ");
        a = sc.nextInt();

        if (a == 4)
            s++;

        System.out.println("\nQ3. In electronics, the ideal op-amp has...");
        System.out.println("1. All of the above");
        System.out.println("2. Infinite gain");
        System.out.println("3. Zero output impedance");
        System.out.println("4. Infinite input impedance");
        System.out.print("Enter your answer: ");
        a = sc.nextInt();

        if (a == 1)
            s++;

        System.out.println("\nQ4. Which planet is known as the \"Red Planet\"?");
        System.out.println("1. Jupiter");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Saturn");
        System.out.print("Enter your answer: ");
        a = sc.nextInt();

        if (a == 3)
            s++;

        System.out.println("\nQ5. In Boolean algebra, the complement of 0 is...");
        System.out.println("1. Same as 0");
        System.out.println("2. 1");
        System.out.println("3. 0");
        System.out.println("4. Undefined");
        System.out.print("Enter your answer: ");
        a = sc.nextInt();

        if (a == 2)
            s++;

        System.out.println("\nYour score is " + s + " out of 5.");

        if (s == 5) {
            System.out.println("Excellent!");
        } else if (s >= 3) {
            System.out.println("Good!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}
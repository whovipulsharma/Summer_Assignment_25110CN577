import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        char ch;

        System.out.println("SMART CALCULATOR");
        System.out.println("****************");

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("Enter the operation (+,-,*,/,%): ");
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                System.out.println("Sum : " + (a + b));
                break;

            case '-':
                System.out.println("Difference : " + (a - b));
                break;

            case '*':
                System.out.println("Product : " + (a * b));
                break;

            case '/':
                if(b != 0)
                    System.out.println("Division : " + (double)a / b);
                else
                    System.out.println("Division by Zero is Not Possible.");
                break;

            case '%':
                System.out.println("Modulus : " + (a % b));
                break;

            default:
                System.out.println("Invalid Operation");
        }

    }
}
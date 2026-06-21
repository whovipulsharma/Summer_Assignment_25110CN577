import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine();

        System.out.println("Uppercase string: " + str.toUpperCase());
    }
}
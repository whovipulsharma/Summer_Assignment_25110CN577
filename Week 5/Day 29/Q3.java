import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("\nSTRING OPERATIONS SYSTEM");
        System.out.println("************************");
        System.out.println("1. Display String");
        System.out.println("2. Find Length");
        System.out.println("3. Convert to Uppercase");
        System.out.println("4. Convert to Lowercase");
        System.out.println("5. Reverse String");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("String : " + s);
                break;

            case 2:
                System.out.println("Length = " + s.length());
                break;

            case 3:
                System.out.println("Uppercase String : " + s.toUpperCase());
                break;

            case 4:
                System.out.println("Lowercase String : " + s.toLowerCase());
                break;

            case 5:
                String r = "";

                for(int i = s.length() - 1; i >= 0; i--)
                {
                    r = r + s.charAt(i);
                }

                System.out.println("Reversed String : " + r);
                break;

            case 6:
                System.out.println("Thank You.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
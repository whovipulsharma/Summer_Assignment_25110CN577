import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MARKSHEET GENERATION PORTAL");
        System.out.println("***************************");
        System.out.println("1. View Student Marksheet");
        System.out.println("2. Add Student Marksheet");
        System.out.println("3. Update Student Marksheet");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter Registration ID: ");
                int id = sc.nextInt();

                switch(id) {

                    case 101:
                        System.out.println("\nStudent Name : Avirup Das");
                        System.out.println("Registration ID : 101");
                        System.out.println("Mathematics : 92");
                        System.out.println("Physics : 89");
                        System.out.println("Chemistry : 95");
                        System.out.println("English : 91");
                        System.out.println("Computer Science : 98");
                        System.out.println("Total Marks : 465");
                        System.out.println("Percentage : 93.0%");
                        System.out.println("Grade : A+");
                        break;

                    case 102:
                        System.out.println("\nStudent Name : Shreya Singh");
                        System.out.println("Registration ID : 102");
                        System.out.println("Mathematics : 88");
                        System.out.println("Physics : 84");
                        System.out.println("Chemistry : 90");
                        System.out.println("English : 93");
                        System.out.println("Computer Science : 91");
                        System.out.println("Total Marks : 446");
                        System.out.println("Percentage : 89.2%");
                        System.out.println("Grade : A");
                        break;

                    case 103:
                        System.out.println("\nStudent Name : Harshvardhan");
                        System.out.println("Registration ID : 103");
                        System.out.println("Mathematics : 79");
                        System.out.println("Physics : 81");
                        System.out.println("Chemistry : 76");
                        System.out.println("English : 85");
                        System.out.println("Computer Science : 88");
                        System.out.println("Total Marks : 409");
                        System.out.println("Percentage : 81.8%");
                        System.out.println("Grade : B+");
                        break;

                    default:
                        System.out.println("Student Record Not Found.");
                }
                break;

            case 2:
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Registration ID: ");
                int r = sc.nextInt();

                System.out.print("Enter Mathematics Marks: ");
                int m = sc.nextInt();

                System.out.print("Enter Physics Marks: ");
                int p = sc.nextInt();

                System.out.print("Enter Chemistry Marks: ");
                int c = sc.nextInt();

                System.out.print("Enter English Marks: ");
                int e = sc.nextInt();

                System.out.print("Enter Computer Science Marks: ");
                int cs = sc.nextInt();

                int t = m + p + c + e + cs;
                double per = t / 5.0;

                System.out.println("\nStudent Marksheet Generated Successfully.");
                System.out.println("Student Name : " + n);
                System.out.println("Registration ID : " + r);
                System.out.println("Total Marks : " + t);
                System.out.println("Percentage : " + per + "%");

                if(per>=90)
                    System.out.println("Grade : A+");
                else if(per>=80)
                    System.out.println("Grade : A");
                else if(per>=70)
                    System.out.println("Grade : B+");
                else if(per>=60)
                    System.out.println("Grade : B");
                else
                    System.out.println("Grade : C");

                break;

            case 3:
                System.out.print("Enter Registration ID: ");
                int x = sc.nextInt();

                switch(x){

                    case 101:
                    case 102:
                    case 103:

                        System.out.print("Enter New Mathematics Marks: ");
                        m = sc.nextInt();

                        System.out.print("Enter New Physics Marks: ");
                        p = sc.nextInt();

                        System.out.print("Enter New Chemistry Marks: ");
                        c = sc.nextInt();

                        System.out.print("Enter New English Marks: ");
                        e = sc.nextInt();

                        System.out.print("Enter New Computer Science Marks: ");
                        cs = sc.nextInt();

                        t = m + p + c + e + cs;
                        per = t / 5.0;

                        System.out.println("\nMarksheet Updated Successfully.");
                        System.out.println("Total Marks : " + t);
                        System.out.println("Percentage : " + per + "%");
                        break;

                    default:
                        System.out.println("Student Record Not Found.");
                }
                break;

            case 4:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}
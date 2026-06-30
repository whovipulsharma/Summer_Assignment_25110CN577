import java.util.*;

public class Q4
 
 {

    static Scanner sc = new Scanner(System.in);

    static String mission[]={
            "Chandrayaan-3",
            "Aditya-L1",
            "Gaganyaan"
    };

    static String rocket[]={
            "LVM3-M4",
            "PSLV-C57",
            "HLVM3"
    };

    static String status[]={
            "Successful",
            "Operational",
            "Under Preparation"
    };

    static int count=3;

    static void viewMission()
    {
        System.out.println("\nACTIVE MISSIONS");
        System.out.println("****************");

        for(int i=0;i<count;i++)
        {
            System.out.println("\nMission : "+mission[i]);
            System.out.println("Rocket : "+rocket[i]);
            System.out.println("Status : "+status[i]);
        }
    }

    static void launchMission()
    {
        System.out.print("Enter Mission Name: ");
        sc.nextLine();
        mission[count]=sc.nextLine();

        System.out.print("Enter Rocket Name: ");
        rocket[count]=sc.nextLine();

        System.out.print("Enter Mission Status: ");
        status[count]=sc.nextLine();

        count++;

        System.out.println("\nMission Added Successfully.");
    }

    static void searchMission()
    {
        System.out.print("Enter Mission Name: ");
        sc.nextLine();
        String s=sc.nextLine();

        int f=0;

        for(int i=0;i<count;i++)
        {
            if(mission[i].equalsIgnoreCase(s))
            {
                System.out.println("\nMission : "+mission[i]);
                System.out.println("Rocket : "+rocket[i]);
                System.out.println("Status : "+status[i]);
                f=1;
                break;
            }
        }

        if(f==0)
            System.out.println("Mission Not Found.");
    }

    static void updateMission()
    {
        System.out.print("Enter Mission Name: ");
        sc.nextLine();
        String s=sc.nextLine();

        int f=0;

        for(int i=0;i<count;i++)
        {
            if(mission[i].equalsIgnoreCase(s))
            {
                System.out.print("Enter New Status: ");
                status[i]=sc.nextLine();

                System.out.println("Mission Updated Successfully.");
                f=1;
                break;
            }
        }

        if(f==0)
            System.out.println("Mission Not Found.");
    }

    public static void main(String args[])
    {
        System.out.println("ISRO");
        System.out.println("MISSION CONTROL SYSTEM");
        System.out.println("**********************");
        System.out.println("1. View Active Missions");
        System.out.println("2. Launch New Mission");
        System.out.println("3. Search Mission");
        System.out.println("4. Update Mission");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                viewMission();
                break;

            case 2:
                launchMission();
                break;

            case 3:
                searchMission();
                break;

            case 4:
                updateMission();
                break;

            case 5:
                System.out.println("Thank You.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }
    }
}
import java.util.*;
public class Q1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=(int)(Math.random()*100);
        System.out.println("GUESS THE GAME CHALLENGE\n****************************");
        System.out.println("Guess the number: ");
        int g=sc.nextInt();
        int c=0;
        while(g!=n)
        {
            if(g>n){
            System.out.println("Guess is high!!");
            System.out.println("Guess again: ");
            g=sc.nextInt();
            c++;
            }
            else{
            System.out.println("Guess is low!!");
            System.out.println("Guess again: ");
            g=sc.nextInt();
            c++;
            }      
        }
        if(c==0)
        System.out.println("Congratulation!! You guessed it right in 1st attempt!!");
        else
        System.out.println("Congratulation!! You guessed it right in "+(c+1)+" attempts!!");
    }
}
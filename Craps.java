
/**
 * The Craps program replicates a craps grame.
 *
 * @author Audrey Kim 
 * @version 2020-01-14
 */
import java.util.Scanner;
public class Craps
{
    public static String playAgain()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to play again (Y/n)?: ");
        String answer = in.nextLine();
        return answer;
    }
    
    public static void getDirections()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like instructions on how to play Craps (Y/n)?: ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.length() == 0)
        {
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point."); 
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point again, in which case they win, or they roll a 7, in which case they lose.");
        }
    }
    
    public static void printResults(int die1, int die2)
    {
        System.out.println("Die1 = " + die1);
        System.out.println("Die2 = " + die2);
        System.out.println("Sum = " + (die1 + die2));
    }
    
    public static Die makeDie()
    {
        Die die1 = new Die();
        die1.roll();
        return die1;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the game of Craps!");
        System.out.print("Would you like to play (Y/n)?: ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.length() == 0)
        {
            getDirections();
        }
        else
        {
            System.out.println("Okay, see you next time!");
        }
        while (answer.equalsIgnoreCase("y") || answer.length() == 0)
        {
            System.out.print("Press <Enter> to roll your dice");
            String roll = in.nextLine();
            int point = 0;
            if (roll.length() == 0)
            {
                Die die1 = makeDie();
                Die die2 = makeDie();
                point += (die1.getRoll() + die2.getRoll());
                printResults(die1.getRoll(), die2.getRoll());
            }
            if (point == 7 || point == 11)
            {   
                System.out.println("Congratulations! You won!");
                answer = playAgain();
            } 
            else if (point == 2 || point == 3 || point == 12)
            {
                System.out.println("I'm sorry, you lost.");
                answer = playAgain();
            }
            else
            {
                System.out.print("Press <Enter> to roll your dice");
                roll = in.nextLine();
                if (roll.length() == 0)
                {
                    Die die3 = makeDie();
                    Die die4 = makeDie();
                    printResults(die3.getRoll(), die4.getRoll());
                    while (!(die3.getRoll() + die4.getRoll() == point || 
                             die3.getRoll() + die4.getRoll() == 7))     
                    {
                        System.out.print("Press <Enter> to roll your dice");
                        roll = in.nextLine();
                        if (roll.length() == 0)
                        {
                            die3.roll();
                            die4.roll();
                            printResults(die3.getRoll(), die4.getRoll());
                        }
                    }
                
                    if (die3.getRoll() + die4.getRoll() == point)
                    {
                        System.out.println("Congratulations! You won!");
                        answer = playAgain();
                    }
                    else
                    {
                        System.out.println("I'm sorry, you lost.");
                        answer = playAgain();
                    }
                }
            }
        }
        
    }
}

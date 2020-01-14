
/**
 * Write a description of class Craps here.
 *
 * @author Audrey Kim 
 * @version 2020-01-14
 */
import java.util.Scanner;
public class Craps
{
    public boolean playAgain()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to play again (Y/n)?: ");
        String answer = in.next();
        if (answer.equalsIgnoreCase("y") || answer.equals(" "))
        {
            return true;
        }
        return false;
    }
    
    public void getDirections()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like instructions on how to play Craps (Y/n)?: ");
        String answer = in.next();
        if (answer.equalsIgnoreCase("y") || answer.equals(" "))
        {
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point."); 
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point again, in which case they win, or they roll a 7, in which case they lose.");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the game of Craps!");
        System.out.println("Would you like to play (Y/n)?: ");
        String answer = in.next();
        while (answer.equals
        getDirections();
        String roll = in.next();
        System.out.println("Press <Enter> to roll your dice");
        if (roll.length() == 0)
        {
            Die die1 = new Die();
            die1.roll();
            Die die2 = new Die();
            die2.roll();
            System.out.println("Die1 = " + die1.getRoll());
            System.out.println("Die2 = " + die2.getRoll());
            int sum = die1.getRoll() + die2.getRoll();
            System.out.println("Sum = " + sum);
        }
        if (sum == 7 || sum == 11)
        {
            System.out.println("Congratulations! You won!");
            play
}


/**
 * The Die class creates and keeps track of a 6-sided die for the game of Craps.
 *
 * @author Audrey Kim
 * @version 2020-01-15
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int num;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        num = (int) (Math.random() * 6 + 1);
    }

    /**
     * Simulates the die being rolled.
     */
    public void roll()
    {
        // put your code here
        num = (int) (Math.random() * 6 + 1);
    }
    
    /**
     * Returns the value of the die.
     * 
     * @return num
     */
    public int getRoll()
    {
        return num;
    }
}

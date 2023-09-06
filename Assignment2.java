import java.util.*;

public class Assignment2
{
	/**
	 * Recursive method
	 * @author Corbin Goodyear
	 * @param i				the sequence number to which to get the fibonacci number from
	 * @return i 			fibonacci number at sequence number i
	 */
    public static int fibonacci(int i)
    {
    //if less than 1, return i
    if (i <= 1)
    {
    	return i;
    }
    return fibonacci(i - 1) + fibonacci(i - 2);
    }
    /**
     * 
     * @param args
     * @return print to screen what the ith term in the fibonacci sequence is
     * 
     */
    public static void main (String args[])
    {
    //int to hold sequence number
    int i;
    //create scanner
    Scanner sequence = new Scanner(System.in);
    //ask user to input sequence number
    System.out.println("Enther value of n: ");
    //take in number entered
    i = sequence.nextInt();
    //print number in fibonacci sequence
    System.out.println("The " + i + "th term of the Fibonacci sequence is " + fibonacci(i));
    }
}
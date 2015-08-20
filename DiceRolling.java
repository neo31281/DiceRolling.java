import java.util.Random;

public class DiceRolling
{
    public static void main(String[]args)
    {
        int[] array = new int[13];
        Random rad = new Random();
        
        System.out.println("\nWelcome to DiceRolling.java");
        System.out.println("programmed by: \nRene Jerez\n");
        
        //This loop represents the sum. 
        //go from 0 to 12 in the array
        for( int i = 0; i < 36000000; i++ )
        {
            int sum;
            //rand.nextInt(6) selects a number b/w 0 & 5, 
            //and adds 1 to each roll.
            sum = 1 + rad.nextInt(6) + 1 + rad.nextInt(6);
            array[sum]++;
        }
        //this loop returns the sum per roll untill it hits 12
        for( int i = 2; i <= 12; i++ )
        {
            System.out.println( "Sum of " + i + ": " + array[i] + " times" );
        }
		System.out.println();
    }
}          

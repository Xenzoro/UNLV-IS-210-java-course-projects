import java.util.Random;   // Needed for the Random class

// Jacob Martinez
// instead of using a while statement like in DiceSimulation.java, I will use a do-while statement

public class DiceSimDoWhile
{
    public static void main(String[] args)
    {
        final int NUMBER = 10000;  // Number of dice rolls

        // A random number generator used in
        // simulating the rolling of dice
        Random generator = new Random();

        int die1Value;       // Value of the first die
        int die2Value;       // Value of the second die
        int count = 0;       // Total number of dice rolls
        int snakeEyes = 0;   // Number of snake eyes rolls
        int twos = 0;        // Number of double two rolls
        int threes = 0;      // Number of double three rolls
        int fours = 0;       // Number of double four rolls
        int fives = 0;       // Number of double five rolls
        int sixes = 0;       // Number of double six rolls

        // TASK #1 Enter your code for the algorithm here
        //Jacob Martinez
        do
        {
            die1Value = generator.nextInt(6) + 1;
            die2Value = generator.nextInt(6) + 1;
            count++;

            if (die1Value == die2Value)
            {
                switch (die1Value)
                {
                    case 1:
                        snakeEyes++;
                        break;
                    case 2:
                        twos++;
                        break;
                    case 3:
                        threes++;
                        break;
                    case 4:
                        fours++;
                        break;
                    case 5:
                        fives++;
                        break;
                    case 6:
                        sixes++;
                        break;
                }
            }

        }while (count < NUMBER);

        // Display the results
        System.out.println ("You rolled snake eyes " +
                snakeEyes + " out of " +
                count + " rolls.");
        System.out.println ("You rolled double twos " +
                twos + " out of " + count +
                " rolls.");
        System.out.println ("You rolled double threes " +
                threes + " out of " + count +
                " rolls.");
        System.out.println ("You rolled double fours " +
                fours + " out of " + count +
                " rolls.");
        System.out.println ("You rolled double fives " +
                fives + " out of " + count +
                " rolls.");
        System.out.println ("You rolled double sixes " +
                sixes + " out of " + count +
                " rolls.");
    }
}

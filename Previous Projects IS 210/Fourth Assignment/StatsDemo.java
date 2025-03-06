import java.io.IOException;
import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE
      // Create a Scanner object passing it a File object
      // with the name of the file.
         Scanner inputFile = new Scanner(new File(filename));
      // Loop until you are at the end of the file
         while (inputFile.hasNext())
         {
         // Read a double value from the file
            double val = inputFile.nextDouble();
         // Add the value to sum
            sum += val;
         // Increment the counter
            count++;
         }
         // After the loop finishes, close the input file
         inputFile.close();
         // Store the calculated mean in the mean variable
         mean = sum / count;


      // ADD LINES FOR TASK #5 HERE
      //Jacob Martinez
      // Create a Scanner object passing it a File object
      // with the name of the file.
         Scanner inputFile2 = new Scanner(new File(filename));
      // Reinitialize sum to 0
         sum = 0;
      // Reinitialize count to 0
         count = 0;
      // Loop until you are at the end of the file
         while (inputFile2.hasNext())
         {
            // Read a double value from the file
            double val = inputFile2.nextDouble();
            // subtract the mean from the value
            difference = val - mean;
            // Add the square of the difference to the sum
            sum += difference * difference;
            // Increment the counter
            count++;
         }
      // After the loop finishes, close the input file
            inputFile2.close();
      // Store the calculated standard deviation in stdDev
            stdDev = Math.sqrt(sum / count);

      // ADD LINES FOR TASK #3 HERE
      // Create a PrintWriter object using "Results.txt"
      // Jacob Martinez
         PrintWriter outputFile = new PrintWriter("Previous Projects IS 210/Fourth Assignment/Results.txt");

      // Print the results to the output file
         outputFile.printf("mean = %.3f\n", mean);
         outputFile.printf("standard deviation = %.3f\n", stdDev);

      // Close the output file
         outputFile.close();
   }
}
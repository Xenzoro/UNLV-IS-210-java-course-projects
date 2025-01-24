// TASK #2 Add an import statement for the Scanner class

import java.util.Scanner;

public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5/ (double) 9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

         // ADD LINES FOR TASK #2 HERE
         Scanner scanner = new Scanner(System.in);
         String firstName, lastName, fullName;
         // Prompt the user for first name
         System.out.println("Enter your first name: ");
         // Read the user's first name
         firstName = scanner.nextLine();
         // Prompt the user for last name
         System.out.println("Enter your last name: ");
         // Read the user's last name
         lastName = scanner.nextLine();
         // Concatenate the user's first and last names
         fullName = firstName + " " + lastName;
         // Print out the user's full name
         System.out.println("Your full name is: " + fullName);

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      char firstInital = firstName.charAt(0);
      // Print out the user's first initial
      System.out.println("Your first initial is: " + firstInital);
      // Convert the user's full name to uppercase
      fullName = fullName.toUpperCase();
      // Print out the user's full name in uppercase
      int length = fullName.length();
      System.out.println("Your full name in uppercase is: " + fullName);
      System.out.println(fullName + " has " + length + " characters");
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      System.out.println("Enter the diameter of a sphere: ");
      // Read the diameter
      double diameter = scanner.nextDouble();
      // Calculate the radius
      double radius = diameter / 2;
      // Calculate the volume
      double volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
      // Print out the volume
      System.out.println("The volume of the sphere is: " + volume);
   }
}
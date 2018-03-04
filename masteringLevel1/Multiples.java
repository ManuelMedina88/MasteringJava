// Multiples.java
// @uthor : Manuel Medina
// Date : Oct 28th 2017
// app that reads two integers and determines whether the first is a multiple of the second and print the result.
import java.util.Scanner; // the program uses a scanner user.

public class Multiples
{
   // method main begins and execute all the java apps
   public static void main(String[] args)
   {
      //create a Scanner object.
      Scanner input = new Scanner(System.in);

      // create the variables need for the program
      int firstNumber;
      int secondNumber;

      // prompt the user and read the numbers
      System.out.print("Enter the first number: ");
      firstNumber = input.nextInt();

      System.out.print("Enter the second number: ");
      secondNumber = input.nextInt();

      // this part determines whether first number is multiple of the second
      if ((firstNumber % secondNumber) == 0)
         System.out.println("The first number is multiple of the second.");

      if ((firstNumber % secondNumber) != 0)
         System.out.println("The first number is not multiple of the second");

   } // end method main.
} // end class Multiples.

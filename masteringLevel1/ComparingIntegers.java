//ComparingIntegers.java
// @uthor : Manuel Medina.
// Date : Oct 28th 2017
// programa that asks the user to enter two integers and obtains them form the user and display the larger
// number followed by the words "is larger". if the numbers are equal, print the message "These numbers are equal"
import java.util.Scanner; // a Scanner object is needed in this program

public class ComparingIntegers
{
   //main method begins and executes all java applications
   public static void main(String[] args)
   {
      // create an Scanner object.
      Scanner input = new Scanner(System.in);

      //create two variables
      int firstNumber;
      int secondNumber;

      // ask and prompt user to enter the first number
      System.out.print("Enter the first number: ");
      firstNumber = input.nextInt();

      // ask and prompt user to enter the secondNumber
      System.out.print("Enter the second number: ");
      secondNumber = input.nextInt();

      // if the first number is larger than the second one print that the firstNumber is larger.
      if (firstNumber > secondNumber)
         System.out.printf("%d %s%n", firstNumber, "is the larger.");

      // if the second number is larger than the first one print that the secondNumber is larger.
      if (secondNumber > firstNumber)
         System.out.printf("%d %s%n", secondNumber, "is the larger.");

      // if these number are equal then the program print "These number are equal"
      if (firstNumber == secondNumber)
         System.out.println("These numbers are equal.");

   } // end main method
} // end class ComparingIntegers
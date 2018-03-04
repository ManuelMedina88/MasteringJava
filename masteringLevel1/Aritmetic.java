//Aritmetic.java
//@uthor : Manuel Medina
//Date : Oct 26th 2017
// Program that calculate the sum, product, difference and quotient(division)
import java.util.Scanner; // this program uses Scanner api

public class Aritmetic
{
   //main method begins and executes all Java Application
   public static void main(String[] args)
   {
      // create an object Scanner
      Scanner input = new Scanner(System.in);

      // create all the varieble that we're going to uses in this program.
      int firstNumber;
      int secondNumber;
      int sum;
      int product;
      int difference;
      int quotient;

      // ask to the user for the first number to calculate
      System.out.print("Enter the first number: ");
      firstNumber = input.nextInt();

      // ask to the user for the second number to calculate
      System.out.print("Enter the second number: ");
      secondNumber = input.nextInt();

      // calculate the sum
      sum = firstNumber + secondNumber;

      // calculate the product
      product = firstNumber * secondNumber;

      // calculate the difference
      difference = firstNumber - secondNumber;

      // calculate the quotient
      quotient = firstNumber /  secondNumber;

      // the statement show the sum, product, difference and the quotient of the numbers
      System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n", "the sum is ", sum, "the product is ", product,
         "the difference is ", difference, "the quotient(division) is ", quotient);
      
   } // end method main
} // end class Aritmetic

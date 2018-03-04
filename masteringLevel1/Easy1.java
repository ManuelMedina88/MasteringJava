// Easy1.java
// @uthor : Manuel Medina
// Date : Oct 26th 2017
// this program calculates the product of three integers.
import java.util.Scanner;

public class Easy1
{
   // main methods begins and executes all Java application
   public static void main(String[] args)
   {
      // I create an scanner object
      Scanner input = new Scanner(System.in);

      // I declare 4 variables for calculate the product.
      int firstNumber;
      int secondNumber;
      int thirdNumber;
      int result;

      // we start the program with a prompt that ask to the user for the three integers.
      System.out.print("Enter the first integer: ");
      firstNumber = input.nextInt();

      System.out.print("Enter the second integer: ");
      secondNumber = input.nextInt();

      System.out.print("Enter the third integer: ");
      thirdNumber = input.nextInt();

      //the next statement calculate the product of the three integers
      result = firstNumber * secondNumber * thirdNumber;

      // this statement show the resul to the user
      System.out.printf("%s%d%n", "Product is ", result);
   } // end method main
} // end class Easy1
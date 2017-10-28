// AritmeticSmallestAndLargest.java
// @uthor : Manuel Medina
// Date : Oct 28th 2017
// program that ask for three Integers and calculate their sum, average, product, smallest and largest of the numbers.
import java.util.Scanner; // the program needs a Scanner object

public class AritmeticSmallestAndLargest
{
   // main method begins and executes all java application
   public static void main(String[] args)
   {
      // create a Scanner object
      Scanner input = new Scanner(System.in);

      // create the variables needed in this program
      int firstNumber;
      int secondNumber;
      int thirdNumber;
      int sum;
      int average;
      int product;
      int smallest;
      int largest;

      // this part of the program ask and prompt user to enter all the needed information.
      System.out.print("Enter the first number: ");
      firstNumber = input.nextInt();

      System.out.print("Enter the second number: ");
      secondNumber = input.nextInt();

      System.out.print("Enter the third number: ");
      thirdNumber = input.nextInt();

      // this part of the program calculates all the operations needed
      sum = firstNumber + secondNumber + thirdNumber;
      average = (firstNumber + secondNumber + thirdNumber) / 3;
      product =firstNumber * secondNumber * thirdNumber;
      smallest = firstNumber;
      largest = firstNumber;

      if (secondNumber > largest)
         largest = secondNumber;

      if (thirdNumber > largest)
         largest = thirdNumber;

      if (secondNumber < smallest)
         smallest = secondNumber;

      if (thirdNumber < smallest)
         smallest = thirdNumber;

      System.out.printf("The sum is %d%nThe average is %d%nThe product is %d%nThe smallest is %d%nThe largest is %d%n",
         sum, average, product, smallest, largest);

   } // end main method
} // end class AritmeticSmallestAndLargest
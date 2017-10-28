// LargestAndSmallestIntegers.java
// @uthor : Manuel Medina
// Date : Oct 28th 2017
// program that read five intergers and determines and prints the largest and smallest integers in the group.
import java.util.Scanner; // the program uses a Scanner object.
public class LargestAndSmallestIntegers
{
   // method main begins all the java apps
   public static void main(String[] args)
   {

      // create a scanner object
      Scanner input = new Scanner(System.in);

      // create all the variable needed for the program
      int largest;
      int smallest;
      int number;

      // this part reads all the numbers entered by the client and determine wich number is the smallest and with is the largest
      System.out.print("Enter the first number: ");
      number = input.nextInt();

      largest = number;
      smallest = number;

      System.out.print("Enter the second number: ");
      number = input.nextInt();

      if (largest < number)
          largest = number;

      if (smallest > number)
         smallest = number;

      System.out.print("Enter the third number: ");
      number = input.nextInt();

      if (largest < number)
         largest = number;

      if (smallest > number)
         smallest = number;

      System.out.print("Enter the fourth number: ");
      number = input.nextInt();

      if (largest < number)
         largest = number;

      if (smallest > number)
         smallest = number;

      System.out.print("Enter the fifth number: ");
      number = input.nextInt();

      if (largest < number)
         largest = number;

      if (smallest > number)
         smallest = number;

      System.out.printf("%d %s%n", smallest, "is the smallest.");
      System.out.printf("%d %s%n", largest, "is the largest.");

   } // end method main
} // end class LargestAndSmallestIntergers
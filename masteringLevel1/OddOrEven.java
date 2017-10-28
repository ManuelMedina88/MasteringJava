// OddOrEven.java
// @uthor : Manuel Medina.
// Date : Oct 28th 2017.
// program that determines if the number is Odd or Even.
import java.util.Scanner;

public class OddOrEven
{
   // method main begin all the java apps
   public static void main(String[] args)
   {
      // create a Scanner object
      Scanner input = new Scanner(System.in);

      // create the variable needed in the program
      int number;

      // read the number from the user
      System.out.print("Enter the number to evaluate: ");
      number = input.nextInt();

      //determines if the number is even.
      if((number % 2) == 0)
         System.out.println("This number is an even number.");

      //determines if the number is odd.
      if((number % 2) == 1)
         System.out.println("This number is an odd number.");

   } // end method main.
} // end class OddOrEven.
// SeparatingDigitsInAnInteger.java
// @uthor : Manuel Medina.
// Date : Oct 30th 2017.
// apps that inputs one number consisting of five digits from the user, separates the number into its individual digits
// and prints the digits seperated from one another by three spaces each.
import java.util.Scanner; // the program uses a Scanner object.

public class SeparatingDigitsInAnInteger
{
   // method main begins all Java apps
   public static void main(String[] args)
   {
      // create an scanner object
      Scanner input = new Scanner(System.in);

      // create the variable for stand the value received by the user.
      int number;

      // promt and ask user to enter the number
      System.out.print("Enter the number: ");
      number = input.nextInt();

      // process that separates and show the user the results.
      System.out.printf("%d   %d   %d   %d   %d   %n", number / 10000,
         (number % 10000) / 1000,((number % 10000) % 1000) / 100,
         (((number % 10000) % 1000) % 100) / 10,
         (((number % 10000) % 1000) % 100) % 10 );

   } // end method main
} // end class SeparatingDigitsInAnInteger
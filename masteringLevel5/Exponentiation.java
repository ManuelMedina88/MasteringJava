// Exponentiation.java
// @uthor : Manuel Medina.
// Date : nov 30th 2017 11:04am
// Program that performs the calculation of exponentiation.
import java.util.Scanner;

public class Exponentiation
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int base;
      int exponent;
      boolean real = true;

      System.out.println("Exponentiation.\n");

      do {

         System.out.print("Enter the nonzero base: ");
         base = scan.nextInt();

         if(base != 0)
         {
            real = false;
         }
         else
         {
            System.out.println("The number introduced is 0, try again.");
         }

      }while (real);

      real = true;

      do {

         System.out.print("Enter a positive, nonzero exponent : ");
         exponent = scan.nextInt();

         if(exponent != 0 && exponent > 0)
         {
            real = false;
         }
         else
         {
            System.out.println("The number introduced is 0 or negative, try again.");
         }

      }while (real);

      System.out.printf("The number %d powered to %d is equal to : %d%n%n", base, exponent, integerPower(base, exponent));
   }

   private static int integerPower(int base, int exponent)
   {
      int result = base;

      for(int i = 1; i < exponent; i++)
      {
         result *= base;
      }

      return result;
   }
}
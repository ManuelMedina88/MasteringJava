// RoundingNumbers2.java
// @uthor : Manuel Medina.
// Date : nov 30th 2017.
// Program that shows the capabilities of the Math's method floor to round numbers to specific decimal.
import java.util.Scanner;

public class RoundingNumbers2
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double y;

      boolean real = true;
      System.out.println("Program that rounds numbers to specific decimal places.%n");
      do{

         System.out.print("Enter the number to round or -1 to exit: ");
         y = scan.nextDouble();

         if (y == -1)
         {
            real = false;
         }
         else
         {
            System.out.printf("The original number is %f%n", y);
            roundToInteger(y);
            roundToTenths(y);
            roundToHundredths(y);
            roundToThousandths(y);
         }

         System.out.println();

      }while(real);
   }

   public static void roundToInteger(double value)
   {
      double y = Math.floor(value + 0.5);

      System.out.printf("the number rounded to the nearest integer is : %f%n", y);
   }

   public static void roundToTenths(double value)
   {
      double y = Math.floor(value * 10 + 0.5) / 10;

      System.out.printf("the number rounded to the nearest tenth is : %f%n", y);
   }

   public static void roundToHundredths(double value)
   {
      double y = Math.floor(value * 100 + 0.5) / 100;

      System.out.printf("the number rounded to the nearest hundredth is : %f%n", y);
   }

   public static void roundToThousandths(double value)
   {
      double y = Math.floor(value * 1000 + 0.5) / 1000;

      System.out.printf("the number rounded to the nearest thousandth is : %f%n", y);
   }
}
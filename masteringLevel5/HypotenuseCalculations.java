// HypotenuseCalculations.java
// @uthor : Manuel Medina.
// Date : nov 30th 2017 13:05 am.
// program that calculates the hypotenuse of a right triangle when the lengths of the other two sides are given.
import java.util.Scanner;

public class HypotenuseCalculations
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the side1: ");
      double side1 = scan.nextDouble();

      System.out.print("Enter the side2: ");
      double side2 = scan.nextDouble();

      System.out.printf("The result by use the Math's hypot method is %f.%n", Math.hypot(side1, side2));
      System.out.printf("The result by own method is %f.%n", hypotenuse(side1, side2));
   }

   public static double hypotenuse( double side1, double side2)
   {
      double result = Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)));
      return result;
   }
}
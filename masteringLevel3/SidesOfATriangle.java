// SidesOfATriangle.java
// @uthor : Manuel Medina.
// Date : nov 10th 2017.
// app that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a triangle.
import java.util.Scanner;

public class SidesOfATriangle
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the first side of the triangle: ");
      int a = scan.nextInt();

      System.out.print("Enter the second side of the triangle: ");
      int b = scan.nextInt();

      System.out.print("Enter the third side of the triangle: ");
      int c = scan.nextInt();

      int sum1 = a + b;
      int sum2 = a + c;
      int sum3 = b + c;

      if(sum1 > c) {
         if (sum2 > b) {
            if (sum3 > a)
               System.out.printf("%d, %d, %d makes a triangle.%n", a, b, c);
            else
            {
               System.out.println("The three sides you've introduced don't make triangle.");
            }
         }else
         {
            System.out.println("The three sides you've introduced don't make triangle.");
         }
      }else
      {
         System.out.println("The three sides you've introduced don't make triangle.");
      }
   }
}
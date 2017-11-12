// SidesOfARightTriangle.java
// @uthor : Manuel Medina.
// Date : nov 10th 2017.
// app that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a triangle.
import java.util.Scanner;

public class SidesOfARightTriangle
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);



      System.out.println("For determine whether a triangle  is right triangle you have to enter in this order.");
      System.out.println("          *");
      System.out.println("          **");
      System.out.println("       c  * *");
      System.out.println("       a  *  *");
      System.out.println("       t  *   *");
      System.out.println("       e  *    *   hypotenuse (c)");
      System.out.println("       t  *     *");
      System.out.println("       o  *      *");
      System.out.println("      (a) *       *");
      System.out.println("          *        *");
      System.out.println("          ****      *");
      System.out.println("          *  *       *");
      System.out.println("          ************");
      System.out.println("             cateto (b)\n\n");

      System.out.print("Enter the cateto(a) of the triangle: ");
      double a = scan.nextDouble();

      System.out.print("Enter the cateto(b) of the triangle: ");
      double b = scan.nextDouble();

      System.out.print("Enter the hypotenuse of the triangle: ");
      double c = scan.nextDouble();

      double sum1 = a + b;
      double sum2 = a + c;
      double sum3 = b + c;

      if(sum1 > c) {
         if (sum2 > b) {
            if (sum3 > a) {


               System.out.printf("%.1f, %.1f, %.2f%n", a, b, c);
               double hypotenuse = Math.sqrt((a * a) + (b * b));
               //System.out.printf("%.1f%n", hypotenuse);
               double catetoa = Math.sqrt((hypotenuse*hypotenuse)-(b*b));
               //System.out.printf("%.2f%n",catetoa);
               double catetob = Math.sqrt((hypotenuse*hypotenuse)-(a*a));
               //System.out.printf("%.2f%n",Math.ceil(hypotenuse));



               if(c >= Math.floor(hypotenuse))
               {
                  if (c <= Math.ceil(hypotenuse))
                  {
                     if (a >= Math.floor(catetoa))
                     {
                        if (a <= Math.ceil(catetoa))
                        {
                           if (b >= Math.floor(catetob))
                           {
                              if (b <= Math.ceil(catetob))
                              {
                                 System.out.printf("%.2f, %.2f, %.2f makes a right triangle.%n", a, b, c);
                              }
                              else
                              {
                                 System.out.println("The three sides you've introduced don't make right triangle1.");
                              }
                           }
                           else
                           {
                              System.out.println("The three sides you've introduced don't make right triangle2.");
                           }
                        }
                        else
                        {
                           System.out.println("The three sides you've introduced don't make right triangle3.");
                        }
                     }
                     else
                     {
                        System.out.println("The three sides you've introduced don't make right triangle4.");
                     }
                  }
                  else
                  {
                     System.out.println("The three sides you've introduced don't make right triangle5.");
                  }
               }
               else
               {
                  System.out.println("The three sides you've introduced don't make right triangle6.");
               }
            }
            else
            {
               System.out.println("The three sides you've introduced don't make triangle.");
            }
         }
         else
         {
            System.out.println("The three sides you've introduced don't make triangle.");
         }
      }
      else
      {
         System.out.println("The three sides you've introduced don't make triangle.");
      }
   }
}
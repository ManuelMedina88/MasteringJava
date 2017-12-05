// Multiples.java
// @uthor : Manuel Medina.
// Date : Dic 1st 2017 1:08
// App that detemines for a pair of integers, whether the second integer is a multiple of the first.
import java.util.Scanner;

public class Multiples
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;

      int first = 0;
      int second = 0;

      System.out.println("Program that determines if the second integer is a multiple of the first");

         do {
            System.out.print("Enter the first integer or -1 to exit : ");
            first = scan.nextInt();

            System.out.print("Enter the second integer or -1 to exit : ");
            second = scan.nextInt();

            if(first == -1 || second == -1)
               real = false;
            else
            {
               if(isMultiple(first, second))
               {
                  System.out.printf("the %d is a multiple of the %d%n%n%n", second, first);
               }
               else
               {
                  System.out.printf("the %d is not a multiple of the %d%n%n%n", second, first);
               }
            }
         }while(real);
   }


   private static boolean isMultiple(int first, int second)
   {
      boolean real = false;

      if((second % first) == 0)
         real = true;

      return real;
   }
}
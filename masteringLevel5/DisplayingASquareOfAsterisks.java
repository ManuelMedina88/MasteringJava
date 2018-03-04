// DisplayingASquareOfAsterisks.java
// @uthor : Manuel Medina.
// Date : dic 3rd 2017 17:02
// App that display a solid square(the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
import java.util.Scanner;

public class DisplayingASquareOfAsterisks
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number to print the square of asterisks : ");
      int number = scan.nextInt();

      // call method squareOfAsterisks
      squareOfAsterisks(number);
   }

   public static void squareOfAsterisks(int number)
   {
      for(int i = 1; i <= number; i++)
      {
         for(int j = 1; j <= number; j++)
         {
            System.out.print("*");

            if(j == number)
               System.out.println();
         }
      }
   }
}
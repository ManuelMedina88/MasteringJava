// FibonacciSeries.java
// @uthor : Manuel Medina.
// Date : dic 24 2017.
// apps that calculates the fibonacci number.
import java.util.Scanner;
public class FibonacciSeries
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the nth Fibonacci number you want : ");
      double nth = scan.nextDouble();

      fibonacci(nth);
   }

   public static void fibonacci(double n)
   {
      double first = 0;
      double second = 1;
      double result = 0;
      double counter = 2;

      // with decimal number only is possible until the 1475th Fibonacci series's number.
      System.out.print(first +",\t"+ second + ",\t" );
      for(int i = 0 ; i < (int) n; i++)
      {
         result = first + second;
         first = second;
         second = result;
         counter++;

         if(i == n - 1)
         {
            System.out.print(result);
         }
         else {
            System.out.print(result + ",\t");
         }

         if(counter % 10 == 0 )
         {
            System.out.println();
         }
      }

      System.out.println();
   }
}
// GreatestCommonDivisor.java
// @uthor : Manuel Medina.
// Date : dic 4th 2017 14:05
// app that calculate the greatest common Divisor
import java.util.Scanner;

public class GreatestCommonDivisor
{
   public static void main(String[] args)
   {
      System.out.println(gcd(252, 105));
   }

   public static int gcd(int number1, int number2)
   {
      int prime = 2;
      int[] commonDivisor = new int[100];
      int result1 = 1;
      int result2 = 1;
      int arrayCounter = 0;
      int mcd = 1;
      boolean real = true;

      while(real)
      {
          if(prime <= number1 && prime <= number1)
          {
             if((number1 % prime == 0) && (number2 % prime == 0))
             {
                number1 /= prime;
                number2 /= prime;

                commonDivisor[arrayCounter++] = prime;
             }
             else
             {
                prime = nextPrime(prime);
             }
          }
          else
             real = false;
      }

      for(int x = 0; x < commonDivisor.length; x++)
      {
         if(commonDivisor[x] != 0)
         {
            mcd *= commonDivisor[x];
         }
      }

      return mcd;
   }

   public static int nextPrime(int number)
   {
      int next1 = 0;
      //number;

      int counter = 0;

      for(int i = number; i > 1; i++)
      {
         for(int j = 2; j <= i; j++)
         {
            if(i % j == 0) {
               counter++;
            }

            if(counter == 2)
               break;
         }

         if(counter == 1)
         {
            if(i > number) {
               next1 = i;
               break;
            }
         }

         counter = 0;
      }

      return next1;
   }
}
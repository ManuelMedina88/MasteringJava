// Factorials.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 21:01.
// app that calculates the factorials of 1 through 20.

public class Factorials
{
   public static void main(String[] args)
   {
      long result = 1;
      for(int i = 1; i <= 20; i++)
      {
         result *= i;
      }

      System.out.printf("The result of 20! is : %,d. %n", result);
   }
} // end class Factorials
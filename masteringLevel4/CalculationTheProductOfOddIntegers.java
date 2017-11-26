// CalculationTheProductOfOddIntegers.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 20:15
// Write an app that calculates the product of the odd integers from 1 to 15

public class CalculationTheProductOfOddIntegers
{
   public static void main(String[] args)
   {
      int product = 0;
      for(int i = 1; i <= 15; i += 2)
      {
         if(i == 1)
            product = i;
         if(i > 1)
            product *= i;
      }

      System.out.printf("The product of calculate the integers from 1 to 15 is : %,d.%n", product);
   }
}
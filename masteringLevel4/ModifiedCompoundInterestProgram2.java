// ModifiedCompoundInterestProgram2.java
// @uthor : Manuel Medina.
// Date : nov 25th 2017 15:59
// compound interest.

public class ModifiedCompoundInterestProgram2
{
   public static void main(String[] args)
   {
      int amount1 = 0;
      int amount2 = 0;

      int principal = 100000;
      int rate = 5;
      int pow = 1;
      int pow2 = 1;

      // display headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; year++)
      {

         for(int i = 1; i <= year; i++)
         {
            pow *= (100  + rate);
            pow2 *= 100;
         }

         // calculate new amount for specified year
         amount1 = (principal)/100 * pow/pow2;
         amount2 = pow % pow2;
         amount1 += amount2 / 100;


         // display the year and the amount
         System.out.printf("%4d%,20d.%d%n", year, amount1, amount2%100);

         pow = 1;
         pow2 = 1;
      }

   }
}
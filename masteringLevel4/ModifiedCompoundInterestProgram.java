// ModifiedCompoundInterestProgram.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 21:20.
// Modify the compound-interest application of Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.

public class ModifiedCompoundInterestProgram
{

   public static void main(String[] args)
   {
      double amount; // amount on deposit at end of each year
      double principal = 1000.0; // initial amount before interest
      double rate = 0.05;
      int rate2 = 5;
      for(int cont = 1; cont <= 6; cont++)
      {

         // display headers
         System.out.printf("With a rate of %d%% %n", rate2);
         System.out.printf("%s%20s%n", "Year", "Amount on deposit");

         // calculate amount on deposit for each of ten years
         for (int year = 1; year <= 10; ++year) {
            // calculate new amount for specified year
            amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
         }

         rate += 0.01;
         System.out.println("\n");
         rate2 += 1;
      }
   }
}
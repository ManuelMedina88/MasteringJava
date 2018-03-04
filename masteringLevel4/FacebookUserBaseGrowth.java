// FacebookUserBaseGrowth.java
// @uthor : Manuel Medina.
// Date : nov 26th 2017 19:54
// app that calculates how many month need facebook for reach the 1.5 billion of users.


public class FacebookUserBaseGrowth
{

   public static void main(String[] args)
   {
      double amount = 0; // amount on deposit at end of each year
      double principal = 1000000000000.0; // initial amount before interest
      double objective = principal * 1.5;
      double rate = 0.04; // interest rate
      int mounth = 1;
      // display headers
      System.out.printf("%s%s%n", "Months\t", "Amount on users");

      // calculate amount on deposit for each of ten years
      while(amount < objective)
      {
         // calculate new amount for specified year
         amount = principal * Math.pow(1.0 + rate, mounth);

         // display the year and the amount
         System.out.printf("%d\t%,.2f%n", mounth, amount);

         mounth++;
      }
   }
} // end class Interest
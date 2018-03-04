// SavingsAccountTest.java
// @uthor : Manuel Medina.
// Date : Dic 30th 2017 07:18 a.m
// app that tests the savingsAccount capabilities
import java.math.BigDecimal;

public class SavingsAccountTest
{
   public static void main(String[] args)
   {
      BigDecimal firstObjectBalance = BigDecimal.valueOf(2000.00);
      BigDecimal secondObjectBalance = BigDecimal.valueOf(3000.00);
      SavingsAccount saver1 = new SavingsAccount(firstObjectBalance);
      SavingsAccount saver2 = new SavingsAccount(secondObjectBalance);

      BigDecimal newRate = BigDecimal.valueOf(0.04);
      System.out.println(newRate);
      SavingsAccount.modifyInterestRate(newRate);

      System.out.println("monthly interest for each of 12 month");
      System.out.printf("%-10s     %10s    %10s%n", "Months", "Saver 1", "Saver 2" );
      for (int i = 1; i <= 12; i++)
      {
         saver1.calculateMonthlyInterest();
         saver2.calculateMonthlyInterest();
         System.out.printf("month #%d\t  %10s\t%10s%n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
      }
      System.out.println("\n\n\n");
      newRate = BigDecimal.valueOf(0.05);
      System.out.println(newRate);
      SavingsAccount.modifyInterestRate(newRate);
      for (int i = 1; i <= 12; i++)
      {
         saver1.calculateMonthlyInterest();
         saver2.calculateMonthlyInterest();
         System.out.printf("month #%d\t  %10s\t%10s%n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
      }

   }
}
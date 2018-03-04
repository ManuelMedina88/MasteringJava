// SavingsAccount.java
// @uthor : Manuel Medina.
// Date : Dic 30th 2017 06:55 a.m.
// class
import java.math.BigDecimal;
import java.text.NumberFormat;

public class SavingsAccount
{
   private static BigDecimal annualInterestRate;

   private BigDecimal savingsBalance;

   public SavingsAccount()
   {
      this(BigDecimal.ZERO);
   }


   public SavingsAccount(BigDecimal initBalance)
   {
      if(initBalance.compareTo(BigDecimal.ZERO) <  0)
      {
         throw new IllegalArgumentException("The amount introduced by you is not allow is less than zero%nIt will be set to 0.0.");
      }

      savingsBalance = initBalance;
   }

   public void calculateMonthlyInterest(){
      BigDecimal TWELVE = BigDecimal.valueOf(12);
      BigDecimal monthlyInterest = savingsBalance.multiply(annualInterestRate).divide(TWELVE, 2);
      savingsBalance = savingsBalance.add(monthlyInterest);
   }

   public String getSavingsBalance()
   {
      String balance = String.format("%s", NumberFormat.getCurrencyInstance().format(savingsBalance));
      return balance;
   }
   public static void modifyInterestRate(BigDecimal newInterest)
   {
      if(newInterest.compareTo(BigDecimal.ZERO) < 0)
      {
         throw new IllegalArgumentException("The value you've entered is invalid the interest rate must be greater than zero.");
      }

      annualInterestRate = newInterest;
   }
}
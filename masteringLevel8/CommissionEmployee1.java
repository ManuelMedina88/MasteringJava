// CommissionEmployee1.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 09:22 a.m.
// CommissionEmployee1 class that inherits from Employee1.

public class CommissionEmployee1 extends Employee1
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   public CommissionEmployee1(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales, double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      // if grossSales is invalid throw exception
      if (grossSales < 0.0)
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor;

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0)
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   }

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   }

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getCommissionRate();
   }

   // return String representation of CommissionEmployee object
   @Override
   public String toString()
   {
      return String.format("%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", super.toString(),
         "gross sales", getGrossSales(), "commission rate", getCommissionRate());
   }
} // end class CommissionEmployee1
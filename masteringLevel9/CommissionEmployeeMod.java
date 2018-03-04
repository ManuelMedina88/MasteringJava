// CommissionEmployeeMod.java
// @uthor : Manuel Medina.
// Date : Jan 16th 2018 18:34
// CommissionEmployeeMod class extends EmployeeMod

public class CommissionEmployeeMod extends EmployeeMod
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // constructor
   public CommissionEmployeeMod(String firstName, String lastName,
                                String socialSecurityNumber, int month, int day, int year,
                                double grossSales, double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber, month, day, year);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.commissionRate = commissionRate;
      this.grossSales = grossSales;
   }

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

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
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings; override abstract method earnings in EmployeeMod
   @Override
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   }

   // return String represetation of CommissionEmployeeMod object
   @Override
   public String toString()
   {
      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
         "commission employee", super.toString(),
         "gross sales", getGrossSales(),
         "commission rate", getCommissionRate());
   }
} // end class CommissionEmployeeMod
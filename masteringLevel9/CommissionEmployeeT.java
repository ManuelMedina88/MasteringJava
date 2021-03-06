// CommissionEmployeeT.java
// @uthor : Manuel Medina.
// Date : Jan 20th 2018 02:01 a.m
// CommissionEmployeeT class extends EmployeeT

public class CommissionEmployeeT extends EmployeeT
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // constructor
   public CommissionEmployeeT(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
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
            "Commission rate must be > 0.0  and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings; override abstract method earnings in EmployeeT
   @Override
   public double getPaymentAmount()
   {
      return getCommissionRate() * getGrossSales();
   }

   // return String representation of CommissionEmployeeT object
   @Override
   public String toString()
   {
      return String.format("%s: %s%n%s: $%,.2f%n%s: %.2f%n",
         "commission employee", super.toString(),
         "gross sales", getGrossSales(),
         "commission rate", getCommissionRate());
   }
} // end class CommissionEmployeeT
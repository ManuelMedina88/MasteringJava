// BasePlusCommissionEmployeeLast.java
// @uthor : Manuel Medina.
// Date : Jan 20th 2018 09:44
// BasePlusCommissionEmployeeLast class extends CommissionEmployeeLast.

public class BasePlusCommissionEmployeeLast extends CommissionEmployeeLast
{
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCommissionEmployeeLast(String firstName, String lastName,
                                     String socialSecurityNumber, double grossSales,
                                     double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      if ( baseSalary < 0.0) // validate baseSalary
         throw new IllegalArgumentException("Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary
         throw new IllegalArgumentException("Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings; override method earnings in CommissionEmployee
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployeeLast object
   @Override
   public String toString()
   {
      return String.format("%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBaseSalary());
   }
} // end class BasePlusCommissionEmployeeLast
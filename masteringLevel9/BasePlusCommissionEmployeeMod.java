// BasePlusCommissionEmployeeMod.java
// @uthor : Manuel Medina.
// Date : Jan 16th 2018 19:00
// BasePlusCommissionEmployeeMod class extends CommissionEmployeeMod

public class BasePlusCommissionEmployeeMod extends CommissionEmployeeMod
{
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCommissionEmployeeMod(String firstName, String lastName,
                                     String socialSecurityNumber, int month, int day,
                                     int year, double grossSales, double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber,
         month, day, year, grossSales, commissionRate);

      if (baseSalary < 0.0) // validate baseSalary
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

   // calculate earnings; override method earnings in CommissionEmployeeMod
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee object
   @Override
   public String toString()
   {
      return String.format("%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBaseSalary());
   }
} // end class BasePlusCommissionMod
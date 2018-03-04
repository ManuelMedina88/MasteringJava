// UsingCompositionInsteadInheritance.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 05:16 a.m.
// UsingCompositionInsteadInheritance class use composition instead of inherits from commissionEmployee directle.

public class UsingCompositionInsteadInheritance
{
   private double baseSalary; // base salary per week

   public CommissionEmployee3 commissionEmployee;

   public UsingCompositionInsteadInheritance(String firstName, String lastName,
                                             String socialSecurityNumber, double grossSales,
                                             double commissionRate, double baseSalary)
   {
      commissionEmployee = new CommissionEmployee3(firstName, lastName, socialSecurityNumber,
         grossSales, commissionRate);

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary()
   {
      return  baseSalary;
   }

   // calculate earnings
   public double earnings()
   {
      return getBaseSalary() + commissionEmployee.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         commissionEmployee, "base salary", getBaseSalary());
   }
} // end class UsingCompositionInstedInheritance
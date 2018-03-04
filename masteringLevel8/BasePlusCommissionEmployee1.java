// BasePlusCommissionEmployee1.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 10:11.
// BasePlusCommissionEmployee1 class inherits form CommissionEmployee1
// and access the superclass's private members via inherited public services.

public class BasePlusCommissionEmployee1 extends CommissionEmployee1
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee1(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
      {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
      {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary;
   }

   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried ",
         super.toString(), "base salary", getBaseSalary());
   }
} // end class BasePlusCommisionEmployee
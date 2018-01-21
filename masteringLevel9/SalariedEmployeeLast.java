// SalariedEmployeeLast.java
// @uthor : Manuel Medina.
// Date : Jan 20th 2018 09:29 a.m.
// SalariedEmployeeLast concrete class extends abstract class EmployeeLast.

public class SalariedEmployeeLast extends EmployeeLast
{
   private double weeklySalary;

   public SalariedEmployeeLast(String firstName, String lastName,
                           String socialSecurityNumber, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber);

      if ( weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if ( weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   }

   // calculate earnings; override abstract methods earnings in Employee
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   }

   // return String representation of SalariedEmployeeLast object
   @Override
   public String toString()
   {
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   }
} // end class salariedEmployeeLast


// SalariedEmployeeMod.java
// @uthor : Manuel Medina.
// Date : Jan 16 2018 17:41.
// SalariedEmployeeMod concrete class extends abstract class EmployeeMod.

public class SalariedEmployeeMod extends EmployeeMod
{
   private double weeklySalary;

   // constructor
   public SalariedEmployeeMod(String firstName, String lastName,
                              String socialSecurityNumber, int month,
                              int day, int year, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber, month, day, year);

      if(weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
           "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   }

   // calculate earnings; override abstract method earnings in EmployeeMod
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   }

   // return String representation of SalariedEmployee object
   @Override
   public String toString()
   {
      return String.format("Salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   }


}
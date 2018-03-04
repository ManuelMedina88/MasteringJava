// HourlyEmployeeLast.java
// @uthor : Manuel Medina.
// Date : Jan 20th 2018 09:31 a.m
// HourlyEmployeeLast class extends EmployeeLast.

public class HourlyEmployeeLast extends EmployeeLast {
   private double wage; // wage per hour
   private double hours; // hours worked for week

   // constructor
   public HourlyEmployeeLast(String firstName, String lastName,
                         String socialSecurityNumber, double wage, double hours) {
      super(firstName, lastName, socialSecurityNumber);

      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

      this.wage = wage;
      this.hours = hours;
   }

   // set wage
   public void setWage(double wage)
   {
      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      this.wage = wage;
   }

   // return wage
   public double getWage()
   {
      return wage;
   }

   // set hours
   public void setHours(double hours)
   {
      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");
      this.hours = hours;
   }

   // return hours
   public double getHours()
   {
      return hours;
   }

   @Override
   public double earnings()
   {
      if(getHours() <= 40) // no overtime
         return getWage() * getHours();
      else
         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
   }

   // return String representation of HourlyEmployeeLast object
   @Override
   public String toString()
   {
      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),
         "hours worked", getHours());
   }
}
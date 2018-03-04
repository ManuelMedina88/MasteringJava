// HourlyEmployee.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 13:50 p.m.
// HourlyEmployee inherits form Employeee1

public class HourlyEmployee extends Employee1
{
   private double hours;
   private double wage;

   public HourlyEmployee(String firstName, String lastName, String socialSecurityNumbers, double wage, double hours)
   {
      super(firstName, lastName, socialSecurityNumbers);

      if(wage < 0.0)
         throw new IllegalArgumentException(
            "The wage must be a nonnegative number.");

      if (hours < 0.0 || hours > 168)
         throw new IllegalArgumentException(
            "The hours must be a nonnegative number and must be less than 169 hours.");

      this.hours = hours;
      this.wage = wage;
   }

   public void setWage(double wage)
   {
      if(wage < 0.0)
         throw new IllegalArgumentException(
            "The wage must be a nonnegative number.");

      this.wage = wage;
   }

   public void setHours(double hours)
   {
      if (hours < 0.0 || hours > 168)
         throw new IllegalArgumentException(
            "The hours must be a nonnegative number and must be less than 169 hours.");

      this.hours = hours;
   }

   public double getHours()
   {
      return hours;
   }

   public double getWage()
   {
      return wage;
   }

   public double earnings()
   {
      return getHours() * getWage();
   }

   public String toString()
   {
      return String.format("%s %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n", "Hourly employee: ", super.toString(),
         "Hours", getHours(), "Wage per hour", getWage(), "Total salary", earnings());
   }
}
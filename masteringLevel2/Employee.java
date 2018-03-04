// Employee.java
// @uthor : Manuel Medina.
// Date : nov 2nd 2017.
// class that serve as support for employee object.

public class Employee
{
   String firstName;
   String lastName;
   double monthlySalary;

   public Employee(String firstName, String lastName, double monthlySalary)
   {
      this.firstName = firstName;
      this.lastName = lastName;

      if (monthlySalary > 0.0)
         this.monthlySalary = monthlySalary;

   } // end constructor employee

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setMonthlySalary(double monthlySalary)
   {
      if (monthlySalary > 0.0)
         this.monthlySalary = monthlySalary;
   }

   public double getMonthlySalary()
   {
      return monthlySalary;
   }
} // end class Employee
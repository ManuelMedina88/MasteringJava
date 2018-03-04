// EmployeeLast.java
// @uthor : Manuel Medina.
// Date : Jan 20th 2018 01:33
// EmployeeLast abstract superclass that implements Payable.

public abstract class EmployeeLast implements PayableLast
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // constructor
   public EmployeeLast(String firstName, String lastName,
                    String socialSecurityNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return earnings
   public abstract double earnings();

   // return String representation of EmployeeP object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }

   @Override
   public double getPaymentAmount()
   {
      return earnings();
   }
} // end abstract class EmployeeLast
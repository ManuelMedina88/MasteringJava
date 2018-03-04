// EmployeeX.java
// @uthor : Manuel Medina.
// Date : Jan 18th 2018 20:53
// EmployeeX abstract superclass

public abstract class EmployeeX
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // constructor
   public EmployeeX(String firstName, String lastName,
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

   // return String representation of EmployeeX object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class EmployeeX
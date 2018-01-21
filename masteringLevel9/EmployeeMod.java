// EmployeeMod.java
// @uthor : Manuel Medina.
// Date : Jan 16th 2018 17:08
// Class that modify the class Employee1 from this level

public abstract class EmployeeMod
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private final Date birthDay;

   // constructor
   public EmployeeMod(String firstName, String lastName,
                      String socialSecurityNumber, int month, int day, int year)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      birthDay = new Date(month, day, year);
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

   public int getMonth()
   {
      return birthDay.getMonth();
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s%nbirth day: %s",
         getFirstName(), getFirstName(), getSocialSecurityNumber(), birthDay);
   }

   // abstract method must be overriden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee
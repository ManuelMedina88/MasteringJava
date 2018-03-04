// Employee1.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 09:11 a.m.
// Superclass.

public class Employee1
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   public Employee1(String firstName, String lastName, String socialSecurityNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getSocialSecurityNumber() {
      return socialSecurityNumber;
   }

   public String toString()
   {
      return String.format("%s %s%n%s: %s%n", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber());
   }
}
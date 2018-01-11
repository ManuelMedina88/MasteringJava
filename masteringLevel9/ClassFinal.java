// ClassFinal.java
// @uthor : Manuel Medina.
// Date : Jan 9th 2018 13:22 p.m.
// Class final declare the states and members as final.

public final class ClassFinal
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   public ClassFinal(final String firstName, final String lastName, final String socialSecurityNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   public final String getFirstName()
   {
      return firstName;
   }

   public final String getLastName()
   {
      return lastName;
   }

   public final String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   public final String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%n","fullname", getFirstName(),
         getLastName(), "SNN", getSocialSecurityNumber());
   }

}


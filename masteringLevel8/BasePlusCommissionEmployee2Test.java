// BasePlusCommissionEmployee2Test.java
// @uthor : Manuel Medina.
// Date : Jan 5th 2018 07:57 am.
// app that shows all the capabilities of class BasePlusCommissionEmployee2

public class BasePlusCommissionEmployee2Test
{
   public static void main(String[] args)
   {
      // instatiate BasePlusCommissionEmployee2 object
      BasePlusCommissionEmployee2 employee =
         new BasePlusCommissionEmployee2(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:%n");
      System.out.printf("%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is",
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is",
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000);

      System.out.printf("%n%s:%n%n%s%n",
         "Update employee information obtained by toString",
         employee.toString());
   } // end main
} // end class BasePlusCommissionEmployee2Test
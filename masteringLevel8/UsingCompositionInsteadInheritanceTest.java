// UsingCompositionInsteadInheritanceTest.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 05:34 a.m.
// UsingCompositionInsteadInheritanceTest test program.

public class UsingCompositionInsteadInheritanceTest
{
   public static void main(String[] args)
   {
      // instantiate UsingCompositionInsteadInheritance obejct
      UsingCompositionInsteadInheritance employee =
         new UsingCompositionInsteadInheritance(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

      // get-base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:%n");
      System.out.printf("%s %s%n", "First name is",
         employee.commissionEmployee.getFirstName());
      System.out.printf("%s %s%n", "Last name is",
         employee.commissionEmployee.getLastName());
      System.out.printf("%s %s%n", "Social Security number is",
         employee.commissionEmployee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is",
         employee.commissionEmployee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.commissionEmployee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000);

      System.out.printf("%n%s:%n%n%s%n",
         "Updated employee information obtained by toString",
         employee.toString());
   } // end main
} // end class BasePlusCommissionEmployeeTest
// PayrollSystemTest.java
// @uthor : Manuel Medina.
// Date : Jan 16th 2016 19:22
// EmployeeMod hierarchy test program.

public class PayrollSystemTestMod
{

   public static void main(String[] args)
   {

      Date currentDate = new Date(8, 10, 2018);

      // create subclass Objects
      SalariedEmployeeMod salariedEmployee =
         new SalariedEmployeeMod("John", "Smith", "111-11-1111", 1, 26, 1995, 800.00);
      HourlyEmployeeMod hourlyEmployee =
         new HourlyEmployeeMod("Karen", "Price", "222-22-2222", 12, 10, 1988, 16.75, 40);
      CommissionEmployeeMod commissionEmployee =
         new CommissionEmployeeMod("Sue", "Jones", "333-33-3333", 5, 2, 1995, 10000.0, .06);
      BasePlusCommissionEmployeeMod basePlusCommissionEmployeeMod =
         new BasePlusCommissionEmployeeMod(
            "Bob", "Lewis", "444-44-4444", 8, 23, 2000, 5000, .04, 300);

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n",
         salariedEmployee, "earned", (salariedEmployee.getMonth() == currentDate.getMonth())? salariedEmployee.earnings() + 100 : salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", (hourlyEmployee.getMonth() == currentDate.getMonth())? hourlyEmployee.earnings() + 100: hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned",(commissionEmployee.getMonth() == currentDate.getMonth())? commissionEmployee.earnings() + 100 : commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         basePlusCommissionEmployeeMod,
         "earned", (basePlusCommissionEmployeeMod.getMonth() == currentDate.getMonth())? basePlusCommissionEmployeeMod.earnings() + 100 : basePlusCommissionEmployeeMod.earnings());

      // create four-element EmployeeMod array
      EmployeeMod[] employees = new EmployeeMod[4];

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployeeMod;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (EmployeeMod currentEmployee : employees)
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployeeMod)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployeeMod employee =
               (BasePlusCommissionEmployeeMod) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } // end if

         System.out.printf(
            "earned $%,.2f%n%n", (currentEmployee.getMonth() == currentDate.getMonth())? currentEmployee.earnings() + 100:currentEmployee.earnings());
      } // end for

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
      {
         System.out.printf("Employee %d is a %s%n", j,
            employees[j].getClass().getName());
      } // end main
   } // end class PayrollSystemTest
}
// PayrollSystemTestX.java
// @uthor : Manuel Medina.
// Date : Jan 18th 2018 22:18
// EmployeeX hierarchy test program.

public class PayrollSystemTestX
{
   public static void main(String[] args)
   {
      // create subclass objects
      SalariedEmployeeX salariedEmployee =
         new SalariedEmployeeX("John", "Smith", "111-11-1111", 800.00);
      HourlyEmployeeX hourlyEmployee =
         new HourlyEmployeeX("Karen", "Price", "222-22-2222", 16.75, 40);
      CommissionEmployeeX commissionEmployee =
         new CommissionEmployeeX(
            "Sue", "Jones", "333-33-3333", 10000, .06);
      BasePlusCommissionEmployeeX basePlusCommissionEmployee =
         new BasePlusCommissionEmployeeX(
            "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
      PieceWorkerX pieceWorker =
         new PieceWorkerX(
            "Manuel", "Medina", "555-55-5555", 5000.0, 28);

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n",
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         pieceWorker, "earned", pieceWorker.earnings());

      // create four-element Employee array
      EmployeeX[] employees = new EmployeeX[5];

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;
      employees[4] = pieceWorker;

      System.out.printf("Employees processed polimorphically:%n%n");

      // generally process each element in array employees
      for (EmployeeX currentEmployee : employees)
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployeeX)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployeeX employee =
               (BasePlusCommissionEmployeeX) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } // end if

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } // end for

      // get type name of each object in employee array
      for (int j = 0; j < employees.length; j++)
      {
         System.out.printf("Employee %d is a %s%n", j,
            employees[j].getClass().getName());
      }
   } // end main
} // end class PayrollSystemTestX
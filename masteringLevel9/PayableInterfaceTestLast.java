// PayableInerfaceTestLast.java
// @uthor : Manuel Medina.
// Date : Jan 20 2018 09:51 a.m.
// Employees polymorphically.
public class PayableInterfaceTestLast
{
   public static void main(String[] args)
   {
      // create four-element Payable array
      PayableLast[] payableObjects = new PayableLast[4];

      // populate array with objects that implement Payable
      payableObjects[0] = new SalariedEmployeeLast(
         "John", "Smith", "111-11-1111", 800.00);
      payableObjects[1] = new HourlyEmployeeLast(
         "Lisa", "Barnes", "888-88-8888", 700.0, 60);
      payableObjects[2] = new BasePlusCommissionEmployeeLast(
         "Stiven", "Caves", "999-99-9999", 100_000.0, 0.03, 4_000.0);
      payableObjects[3] = new CommissionEmployeeLast(
         "Richard", "Town", "777-77-7777", 100_000.00, .03);

      System.out.println(
         "Invoices and Employees processed polymorphically:");

      // generically process each element in array payableObjects
      for (PayableLast currentPayable : payableObjects)
      {

         // determine whether element is a BasePlusCommissionEmployee
         if (currentPayable instanceof BasePlusCommissionEmployeeLast)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployeeLast employee =
               (BasePlusCommissionEmployeeLast) currentPayable;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } // end if

         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %n%s: $%,.2f%n",
            currentPayable.toString(), // could invoke implicitly
            "payment due", currentPayable.getPaymentAmount());
      }
   } // end main
} // end class PayableInterfaceTestLast
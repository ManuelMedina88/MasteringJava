// PayableInerfaceTestT.java
// @uthor : Manuel Medina.
// Date : Jan 20 2018 02:18 a.m.
// Employees polymorphically.
public class PayableInterfaceTestT
{
   public static void main(String[] args)
   {
      // create four-element Payable array
      PayableT[] payableObjects = new PayableT[7];

      // populate array with objects that implement Payable
      payableObjects[0] = new InvoiceT("01234", "seat", 2, 375.00);
      payableObjects[1] = new InvoiceT("56789", "tire", 4, 79.95);
      payableObjects[2] = new SalariedEmployeeT(
         "John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] = new HourlyEmployeeT(
         "Lisa", "Barnes", "888-88-8888", 700.0, 60);
      payableObjects[4] = new PieceWorkerT(
         "Stiven", "Caves", "999-99-9999", 2000.0, 28);
      payableObjects[5] = new CommissionEmployeeT(
         "Richard", "Town", "777-77-7777", 100_000.00, .03);
      payableObjects[6] = new BasePlusCommissionEmployeeT(
         "Manuel", "Medina", "101-10-1011", 50_000.0, 0.04, 6000.0);

      System.out.println(
         "Invoices and Employees processed polymorphically:");

      // generically process each element in array payableObjects
      for (PayableT currentPayable : payableObjects)
      {

         // determine whether element is a BasePlusCommissionEmployee
         if (currentPayable instanceof BasePlusCommissionEmployeeT)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployeeT employee =
               (BasePlusCommissionEmployeeT) currentPayable;

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
} // end class PayableInterfaceTest
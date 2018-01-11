// PayableInterfaceTest.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 07:53 a.m.
// Payable interface test program processing Invoices and Employees polymorphically.
public class PayableInterfaceTest
{
   public static void main(String[] args)
   {
      // create four-element Payable array
      Payable[] payableObjects = new Payable[4];

      // populate array with objects that implement Payable
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
      payableObjects[2] =
         new SalariedEmployee1("John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] =
         new SalariedEmployee1("Lisa", "Barnes", "888-88-8888", 1200.00);

      System.out.println("Invoices and Employees processed Polymorphically:");

      // generically proccess each element in array payableObjects
      for (Payable currentPayable : payableObjects)
      {
         // output currentPayable and its approriate payment amount
         System.out.printf("%n%s %n%s: $%,.2f%n",
            currentPayable.toString(), // could invoke implicitly
            "payment due", currentPayable.getPaymentAmount());
      }
   } // end main
} // end class PayableInterfaceTest
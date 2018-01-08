// EmployeeTest1.java
// @uthor : Manuel Medina.
// Date : Jan 7th 2018 10:27 a.m.
// app that test all the capabilities of CommissionEmployee1 and BasePlusCommissionEmployee1

public class EmployeeTest1
{
   static public void main(String... algorithmos)
   {
      CommissionEmployee1 commissionEmployee1 = new CommissionEmployee1(
         "Bob", "Lewis", "333-33-3333", 5000.00, .04);

      BasePlusCommissionEmployee1 basePlusCommissionEmployee1 = new BasePlusCommissionEmployee1(
         "Manuel", "Medina", "111-11-1111", 20000.00, .05, 2000.00);

      System.out.printf("%s%n%n", commissionEmployee1);
      System.out.printf("%s%n%n", basePlusCommissionEmployee1);

   }
}
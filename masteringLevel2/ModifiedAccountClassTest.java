// ModifiedAccountClassTest.java
// @uthor : Manuel Medina.
// Date : nov 2nd 2017.
// apps that demonstrates the capabilities of class ModifiedAccountClass

public class ModifiedAccountClassTest
{
   public static void main(String[] args)
   {
      // create the needed object.
      ModifiedAccountClass account1 = new ModifiedAccountClass("Manuel Medina", 240000.0);
      ModifiedAccountClass account2 = new ModifiedAccountClass("Amado Medina", 120000.0);

      // we implement all the capabilities of the class ModifiedAccountClass
      account1.deposit(58000.0);
      account2.deposit(36000.0);

      System.out.printf("the new balance of the account1 is $%.2f%n", account1.getBalance());
      System.out.printf("the new balance of the account2 is $%.2f%n", account2.getBalance());

      account1.withDraw(310000.0);
      account2.withDraw(20000.0);

      System.out.printf("the new balance of the account1 is $%.2f%n", account1.getBalance());
      System.out.printf("the new balance of the account2 is $%.2f%n", account2.getBalance());

   } // end method main
} // end class ModifiedAccountClassTest
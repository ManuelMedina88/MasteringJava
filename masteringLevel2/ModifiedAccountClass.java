// ModifiedAccountClass.java
// @uthor : Manuel Medina.
// Date Nov 2nd 2017.
// class that create some tools that are used in a normal Account class

public class ModifiedAccountClass
{

   // instance variables need in this class
   private String name;
   private double balance;

   public ModifiedAccountClass(String name, double balance)
   {
      // assign the name to the instance variable name.
      this.name = name;
      if (balance > 0.0)
         this.balance = balance;
   } // end constructor.

   // method that set the name of the account owner's name
   public void setName(String name)
   {
      this.name = name;
   } // end setName

   // method that return the name of the owner's name
   public String getName()
   {
      return name;
   } // end getName

   // method that set the balance of the account
   public void setBalance(double balance)
   {
      if (balance > 0.0)
         this.balance = balance;

      if (balance < 0.0)
         System.out.println("We sorry, the amount you try to deposit is negative");
   } // end method setBalance

   // method that return the balance
   public double getBalance()
   {
      return balance;
   } // end getBalance

   public void deposit(double deposit)
   {
      if (deposit > 0.0)
         balance = balance + deposit;

      if (deposit < 0.0)
         System.out.println("We sorry, the amount you try to deposit is negative");
   } // end method deposit

   public void withDraw(double amount)
   {
      if(amount < balance)
         balance = balance - amount;

      if(amount > balance)
         System.out.println("Withdrawal amount exceeded account balance.");
   } // end withdraw
} // end class ModifiedAccountClass
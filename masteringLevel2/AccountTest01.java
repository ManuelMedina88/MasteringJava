// AccountTest01.java
// @uthor : Manuel Medina.
// Date : Oct 31th 2017.
// Using the Account constructor to initialize the name instance variable at the time each Account object is created.

public class AccountTest01
{
   public static void main(String[] args)
   {
      // create two Account objects
      Account01 account1 = new Account01("Jane Green");
      Account01 account2 = new Account01("John Blue");

      // display initial value of name for each Account
      System.out.printf("account1 name is: %s%n", account1.getName());
      System.out.printf("account2 name is: %s%n", account2.getName());
   }
} // end class AccountTest
// AccountTest.java
// @uthor : Manuel Medina.
// Date : Oct 31th 2017.
// Creating and manipulating and Account object.
import java.util.Scanner; // a scanner object is needed

public class AccountTest
{
   public static void main(String[]  args)
   {
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an Account object and assign it to myAccount
      Account myAccount = new Account();

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n%n", myAccount.getName());

      // prompt for and read name
      System.out.println("Please enter the name: ");
      String theName = input.nextLine(); // read a line of text
      myAccount.setName(theName); // put theName in myAccount
      System.out.println(); // outputs a blank line

      // display the name stored in object myAccount
      System.out.printf("Name in object MyAccount is:%n%s%n",
         myAccount.getName());
   }
} // end class AccountTest
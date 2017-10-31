// Account.java
// @uthor : Manuel Medina
// Date Oct 21th 2017
// Account class that contains a name instance varible and methods to set and get its value.

public class Account
{
   private String name; // instance variable

   // method to set the name in the object
   public void setName(String name)
   {
      this.name = name; // store the name
   }

   // method to retrieve the name from the object
   public String getName()
   {
      return name; // return value of name to caller
   }
} // end class Account
// Account01.java
// @uthor : Manuel Medina.
// Date : Oct 31th 2017.
// Account01 class with a constructor that initializes the name.

public class Account01
{
   private String name; // instance variable

   // constructor initializes name with paramenter name
   public Account01(String name)
   {
      this.name = name;
   }

   // method to set the name
   public void setName(String name)
   {
      this.name = name;
   }

   // method to retrieve the name
   public String getName()
   {
      return name;
   }
} // end class Account01
// CallingMethodsFromConstructors.java
// @uthor : Manuel Medina.
// Date : Jan 9th 2018 14:35

public class CallingMethodsFromConstructors
{
   private String name;

   public CallingMethodsFromConstructors(String name)
   {
      setName(name);
   }

   public void setName(String name)
   {
      System.out.println("This was made from the constructor.");
      this.name = name;
   }
}
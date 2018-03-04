// CallingMethodsFromConstructorsInherited.java
// @uthor : Manuel Medina.
// Date : Jan 9th 2018 14:52.

public class CallingMethodsFromConstructorsInherited extends CallingMethodsFromConstructors
{
   public CallingMethodsFromConstructorsInherited(String name)
   {
      super(name);
   }

   @Override
   public void setName(String name)
   {
      System.out.println("This was made from the Object");
   }
}
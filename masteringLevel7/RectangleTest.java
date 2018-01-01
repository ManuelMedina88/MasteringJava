// RectangleTest.java
// @uthor : Manuel Medina.
// Date : Dic 29th 2017 13:19
// class that test all the capabilities of restangle

public class RectangleTest
{
   public static void main(String[] args)
   {
      try {
         Rectangle rectangle1 = new Rectangle(10, 15);
         System.out.println(rectangle1);

         Rectangle rectangle2 = new Rectangle(5, 3);
         System.out.println(rectangle2);

         rectangle1.setLength(2);
         rectangle1.setWidth(2);

         System.out.println(rectangle1);

      }catch (IllegalArgumentException e)
      {
         System.err.println(e.getMessage());
      }

   }
}
// DanglingElseProblem.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.

public class DanglingElseProblem
{
   public static void main(String[] args)
   {
      int x = 9;
      int y = 11;
      if(x < 10)
      if(y > 10)
      System.out.println("*****");
      else
      System.out.println("#####");
      System.out.println("$$$$$");

      System.out.println("\n\n");

      if (x < 10)
      {
      if (y > 10)
      System.out.println("*****");
      }
      else
      {
      System.out.println("#####");
      System.out.println("$$$$$");
      }

      System.out.println("\n\n");

      x = 11;
      y = 9;

      if(x < 10)
         if(y > 10)
            System.out.println("*****");
         else
            System.out.println("#####");
      System.out.println("$$$$$");

      System.out.println("\n\n");

      if (x < 10)
      {
         if (y > 10)
            System.out.println("*****");
      }
      else
      {
         System.out.println("#####");
         System.out.println("$$$$$");
      }
      System.out.println("\n\n");
   }
}
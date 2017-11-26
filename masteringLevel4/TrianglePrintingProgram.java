// TrianglePrintingProgram.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 22:01
// drawing triangles with asterisks.

public class TrianglePrintingProgram
{
   public static void main(String[] args)
   {
      System.out.println("(a)");
      for(int i = 1; i <= 10; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            System.out.print("*");

            if(j == i)
               System.out.println();
         }
      }
      System.out.println();
      System.out.println("(b)");
      for(int i = 10; i >= 1; i--)
      {
         for(int j = 1; j <= i; j++)
         {
            System.out.print("*");

            if(j == i)
               System.out.println();
         }
      }

      System.out.println();
      System.out.println("(c)");
      for(int i = 10; i >= 1; i--)
      {
         for(int s = 0; s < (10 - i); s++)
         {
            System.out.print(" ");
         }
         for(int j = 1; j <= i; j++)
         {
            System.out.print("*");

            if(j == i)
               System.out.println();
         }
      }

      System.out.println();
      System.out.println("(d)");
      for(int i = 1; i <= 10; i++)
      {
         for(int s = 0; s < (10 - i); s++)
         {
            System.out.print(" ");
         }
         for(int j = 1; j <= i; j++)
         {
            System.out.print("*");

            if(j == i)
               System.out.println();
         }
      }
   }
}
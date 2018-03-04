// ModifiedTrianglePrintingProgram.java
// @uthor : Manuel Medina.
// Date : nov 27th 2017 13:06.
// print triangles.

public class ModifiedTrianglePrintingProgram
{
   public static void main(String[] args)
   {
      int a = 10;
      int b = 1;

      System.out.println("(a)          (b)          (c)          (d)");

         for(int j = 1; j <= 10; j++)
         {


            // 1
            for(int t = 1; t <= b; t++)
            {
               System.out.print("*");
            }

            for(int t = 1; t <= (10 - b); t++)
            {
               System.out.print(" ");
            }

            System.out.print("   ");

            // 2
            for(int t = 1; t <= a; t++)
            {
               System.out.print("*");
            }

            for(int t = 1; t <= (10 - a); t++)
            {
               System.out.print(" ");
            }

            System.out.print("   ");

            // 3
            for(int t = 1; t <= 10 - b; t++)
            {
               System.out.print(" ");
            }

            for(int t = 1; t <= b; t++)
            {
               System.out.print("*");
            }

            System.out.print("   ");

            // 4
            for(int t = 1; t <= 10 - a; t++)
            {
               System.out.print(" ");
            }

            for(int t = 1; t <= a; t++)
            {
               System.out.print("*");
            }

            System.out.print("\n");

            b++;
            a--;

         }
   }
}
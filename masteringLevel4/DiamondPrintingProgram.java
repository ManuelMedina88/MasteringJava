// DiamondPrintingProgram.java
// @uthor : Manuel Medina.
// Date : nov 27th 2017 18:38.
// app that prints a diamond shape.

public class DiamondPrintingProgram
{
   public static void main(String[] args)
   {
      int a = 4;
      int b = 1;
      int c = 9;

      for(int i = 1; i <= c; i++)
      {
         if (i <= 4) {
            for (int j = 1; j <= a; j++) {
               System.out.print(" ");
            }

            for (int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();
            a--;
            b += 2;
         }

         if(i == (c/2)+1)
         {
            for( int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();
         }

         if (i >= 6) {
            a++;
            b -= 2;
            for (int j = 1; j <= a; j++) {
               System.out.print(" ");
            }

            for (int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();

         }
      }
   }
} // end class DiamondPrintingProgram
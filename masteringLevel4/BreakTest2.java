// BreakTest2.java
// @uthor : Manuel Medina.
// Date : nov 28th 2017 18:31.
// break statement exiting a for statement.
public class BreakTest2
{
   public static void main(String[] args)
   {
      int count; // control variable also used after loop terminates
      int count1 = 10;

      for(count = 1; count <= count1; count++) // loop 10 times
      {
         if (count == 4)
            count1 = 2;

         System.out.printf("%d ", count);
      }

      System.out.printf("%nBroke out of loop at count = %d%n", count);
   }
} // end class BreakTest2
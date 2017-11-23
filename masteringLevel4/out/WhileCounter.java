// WhileCounter.java
// @uthor : Manuel Medina.
// Date : nov 22th 2017 22:15
// Counter-controlled repetition with the while repetition statement.

public class WhileCounter
{
   public static void main(String[] args)
   {
      int counter = 1; // declare and initialize control variable

      while (counter <= 10) // loop-continuation condition
      {
         System.out.printf("%d ", counter);
         ++counter; // increment control variable
      }

      System.out.println();
   }
} // end class WhileCounter
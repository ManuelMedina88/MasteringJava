// DoWhileTest.java
// @uthor : Manuel Medina.
// Date : nov 23th 2017 06:31
// do...while repetition statement.

public class DoWhileTest
{
   public static void main(String[] args)
   {
      int counter = 1;

      do
      {
         System.out.printf("%d ", counter);
         ++counter;
      }while(counter <= 10); // end do...while

      System.out.println();
   }
} // end class DoWhileTest
// ContinueTest2.java
// @uthor : Manuel Medina.
// Date : nov 28th 2017 18:42.
// continue statement terminating an iteration of a for statement.
public class ContinueTest2
{
   public static void main(String[] args)
   {
      for (int count = 1; count <= 10; count++) // loop 10 times
      {
         if(count != 5) // skip print 5 in the loop if count is 5
            System.out.printf("%d ", count);
      }

      System.out.printf("%nUsed continue to skip printing 5%n");
   }
} // end class ContinueTest2
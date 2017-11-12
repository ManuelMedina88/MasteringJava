// MultiplesOf2WithAnInfiniteLoop.java
// @uthor : Manuel Medina.
// Date : nov 10th 2017.
// app that displays an infinite loop.

public class MultiplesOf2WithAnInfiniteLoop
{
   public static void main(String[] args)
   {
      multiples = 2;
      boolean real = true;
      int cont = 1;

      while(cont < 8)
      {
         System.out.printf("%d, ", multiples);
         multiples *= 2;

      }
   }
}
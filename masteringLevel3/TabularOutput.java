// TabularOutput.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// program that prints a table with the powers of the number 1 up to 5.

public class TabularOutput
{
   public static void main(String[] args)
   {
      int counter = 1;
      System.out.printf("N\t10*N\t100*N\t1000*N%n%n");

      while(counter <= 5)
      {
         System.out.printf("%d\t%d\t%d\t%d%n", counter, counter * 10, counter * 100, counter * 1000);

         counter++;
      }
   }
}
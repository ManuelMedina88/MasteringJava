// UsingTheEnhancedForStatement.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 08:36 am.
// program that show the capabilities of command-line arguments.

public class UsingTheEnhancedForStatement
{
   public static void main(String[] args)
   {
      double sum = 0;
      for(String x : args)
      {
         sum += Double.parseDouble(x);
      }

      System.out.printf("The sum of all double numbers introduced in the command-line is %.2f%n", sum);
   }
}
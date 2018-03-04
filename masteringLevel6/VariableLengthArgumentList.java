// VariableLenghtArgumentList.java
// @uthor : Manuel Medina.
// Date : Dic 12th 2017 08:08am.
// app that shows the capabilities of a method with a variable length argument list.

public class VariableLengthArgumentList
{
   public static void main(String[] args)
   {
      System.out.printf("The result of multiply %d by %d is %d%n", 3, 6, multiply(3, 6));
      System.out.printf("The result of multiply %d by %d by %d  is %d%n", 185, 254, 1005, multiply(185, 254, 1005));
      System.out.printf("The result of multiply %d by %d by %d by %d is %d%n", 20, 196, 200, 50, multiply(20, 196, 200, 50));
   }

   public static int multiply(int... multiple)
   {
      int total = 1;

      for(int x : multiple)
         total *= x;

      return total;
   }
}
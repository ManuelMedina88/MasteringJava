// RelationalNumbersTest.java
// @uthor : Manuel Medina;
// Date : Jan 3rd 2017 07:41 a.m.

public class RationalNumbersTest
{
   public static void main(String[] args)
   {
      RationalNumbers numbers = new RationalNumbers(48,48, 3, 15);

      System.out.printf("%d/%d %d/%d %n", numbers.getA(), numbers.getB(), numbers.getC(), numbers.getD());

      System.out.printf("The sum is equals to: %s%n", RationalNumbers.add());
      System.out.printf("The Multiplication is equals to: %s%n", RationalNumbers.multiply());
      System.out.printf("The subtraction is equals to: %s%n", RationalNumbers.subtract());
      System.out.printf("The division is equals to: %s%n", RationalNumbers.divide());
   }
}
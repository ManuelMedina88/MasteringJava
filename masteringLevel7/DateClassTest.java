// DateClassTest.java
// @uthor : Manuel Medina.
// Date : Jan 2nd 2018 23:29pm.

public class DateClassTest
{
   public static void main(String[] args)
   {
      DateClass date = new DateClass(12, 10, 1988);

      System.out.println(date);
      System.out.println(date.secondFormat());
      System.out.println(date.thirdFormat());
      System.out.println();
   }
}
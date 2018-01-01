// DateAndTime.java
// @uthor : Manuel Medina.
// Date : dic 1st 2018 01:35

public class DateAndTime
{
   public static void main(String[] arg)
   {
      EnhancingTime2 t1 = new EnhancingTime2(23, 59, 59);

      t1.incrementMinute();

      System.out.printf("%s%n", t1);
   }
}
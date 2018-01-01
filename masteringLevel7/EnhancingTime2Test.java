// EnhancingTime2Test.java
// @uthor : Manuel Medina.
// Date : Dic 30th 2017 09:54 a.m.
// app that show the capabilities of class EnhancingTime2.java

public class EnhancingTime2Test
{
   public static void main(String[] args)
   {
      EnhancingTime2 t1 = new EnhancingTime2( 22, 58, 59);
      System.out.printf("time at the beginning : %s%n", t1);
      t1.incrementMinute();
      System.out.printf("time after increment a minute : %s%n", t1);
      t1.incrementHour();
      System.out.printf("time after increment an hour : %s%n", t1);
      t1.tick();
      System.out.printf("time after increment a second : %s%n", t1);
   }
}
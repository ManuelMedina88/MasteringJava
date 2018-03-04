// EnhancingClassDateTest.java
// @uthor : Manuel Medina.
// Date : dic 30th 2017 14:21
// app that show the capabilities of EnhancingClassDate

public class EnhancingClassDateTest
{
   public static void main(String[] args)
   {
      EnhancingClassDate d1 = new EnhancingClassDate(12,10,1988, 7);

      //System.out.printf("Date at the beginning %s%n", d1);

      for(int day = 1; day <= 10585; day++)
      {
         d1.nextDay();


         /*if(day == 1)
         {
            System.out.printf("Date after %5d day  is %s%n", day, d1);
         }else
         {*/
         if (day == 10585)
            System.out.printf("Date after %5d days is %s%n", day, d1);
         //}
      }
   }
}
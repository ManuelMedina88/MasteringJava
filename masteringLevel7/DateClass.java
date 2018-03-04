// DateClass.java
// @uthor : Manuel Medina.
// Date : Jan 2nd 2018 22:31.

public class DateClass
{
   private int month;
   private int day;
   private int year;
   private String[] monthName = {" ", "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "Obtober", "November", "Dicember"};
   private final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public DateClass()
   {
      this(0, 0, 0);
   }

   public DateClass(String month, int day, int year)
   {
      int tempMonth = 0;

      for(int i = 1; i < monthName.length; i++ )
      {
         if(month.equals(monthName[i]))
            tempMonth = i;
      }

      this.month = tempMonth;
      this.day = day;
      this.year = year;
   }

   public DateClass(int dayYear, int year) {
      int month = 0;
      int day = 0;
      int acumulative = 0;


      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

         for (int i = 1; i < daysPerMonth.length; i++) {
            acumulative += daysPerMonth[i];

            if (dayYear < acumulative) {
               month = i;
               break;
            }
         }

         if(dayYear == 60) {
            day = 29;
            month = 2;
         }
         if(dayYear != 60)
         {
            day = daysPerMonth[month] - (acumulative - dayYear);
         }


      }else
      {
         for (int i = 1; i < daysPerMonth.length; i++) {
            acumulative += daysPerMonth[i];

            if (dayYear < acumulative) {
               month = i;
               day = daysPerMonth[month] - (acumulative - dayYear);
            }
         }
      }

      this.month = month;
      this.day = day;
      this.year = year;
   }

   public DateClass(int month, int day, int year)
   {
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 ||
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if(month == 2 && day == 29 && !(year % 400 == 0 ||
         (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      this.month = month;
      this.day = day;
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public String toString()
   {
      return String.format("%02d/%02d/%d", getMonth(), getDay(), getYear());
   }

   public String secondFormat()
   {
      return String.format("%s %02d, %d", monthName[getMonth()], getDay(), getYear());
   }

   public String thirdFormat()
   {
      int day = 0;

      for(int i = 1; i < getMonth(); i++)
      {
         day += daysPerMonth[i];
      }

      day += getDay();

      return String.format("%03d %d", day, getYear());
   }

}
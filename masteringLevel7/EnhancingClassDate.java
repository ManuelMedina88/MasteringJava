// EnhancingClassDate.java
// @uthor : Manuel Medina.
// Date : dic 29th 2017 11:09 a.m.
// Class That modify class Date

public class EnhancingClassDate
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year
   private int dayWeek;

   private static final int[] daysPerMonth =
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   private String[] nameOfMoths = {" ","January", "February", "March", "April", "May", "June", "July", "Augost", "September", "Obtober", "November", "December"};

   private String[] dayOfWeek = {" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

   // constructor: confirm proper value for month and day given the year
   public EnhancingClassDate(int month, int day, int year, int dayWeek)
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
      this.dayWeek = dayWeek;

      //System.out.printf(
        // "Date object constructor for date %s%n", this);
   }


   public void setDay(int day)
   {
      // check if day in range for month
      if (day <= 0 ||
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      this.day = day;
   }



   public int getDay()
   {
      return day;
   }


   public void setMonth(int month)
   {
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");

      this.month = month;
   }

   public int getMonth()
   {
      return month;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public int getYear()
   {
      return year;
   }



   public void setDayWeek(int dayWeek)
   {
      this.dayWeek = dayWeek;
   }

   public int getDayWeek()
   {
      return dayWeek;
   }

   public void nextDayWeek()
   {
      if(getDayWeek() == 7)
      {
         setDayWeek(1);
      }
      else
      {
         setDayWeek(getDayWeek() + 1);
      }
   }

   public void nextDay()
   {
      if(getDay() == 31 && month == 12)
      {
         setMonth(1);
         setYear(getYear() + 1);
         setDay(1);
         nextDayWeek();
      }
      else
      {
         if(getDay() == daysPerMonth[getMonth()])
         {
            setMonth(getMonth() + 1);
            setDay(1);
            nextDayWeek();
         }
         else if (getDay() < daysPerMonth[getMonth()])
         {
            setDay(getDay() + 1);
            nextDayWeek();
         }
      }
   }
   // return a String of the form month/day/year
   public String toString()
   {
      return String.format("%-10s %2dth %-9s %-6d", dayOfWeek[getDayWeek()], getDay(), nameOfMoths[getMonth()], getYear());
   }

} // end class Date
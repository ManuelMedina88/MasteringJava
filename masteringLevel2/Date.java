// Date.java
// @uthor : Manuel Medina.
// Date : nov 3rd 2017.
// class that support the date.

public class Date {
   int month;
   int day;
   int year;

   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public int getMonth()
   {
      return month;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public int getDay()
   {
      return day;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public int getYear()
   {
      return year;
   }

   public String displayDate()
   {
      String date = String.format("%d/%d/%d", month, day, year);
      return date;
   }
}
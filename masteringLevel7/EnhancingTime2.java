// EnhancingTime2.java
// @uthor : Manuel Medina.
// Date : dic 30th 2017 09:37 a.m.
// app that modify the class Time2

public class EnhancingTime2
{

   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59
   private EnhancingClassDate date;

   // Time2 no-argument constructor:
   // initializes each instance variable to zero
   public EnhancingTime2()
   {
      this(0, 0, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public EnhancingTime2(int hour)
   {
      this(hour, 0, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public EnhancingTime2(int hour, int minute)
   {
      this(hour, minute, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour, minute and second supplied
   public EnhancingTime2(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || hour >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute;
      this.second = second;
      date = new EnhancingClassDate(12, 31, 2017, 1);
   }

   // Time2 constructor: another Time2 object supplied
   public EnhancingTime2(EnhancingTime2 time)
   {
      // invoke constructor with three arguments
      this(time.getHour(), time.getMinute(), time.getSecond());
   }

   // Set Methods
   // set a new time value using universal time;
   // validate the data
   public void setTime(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23.");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59.");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("minute must be 0-59.");

      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   // set methods
   // validate and set hour
   public void setHour(int hour)
   {
      if (hour < 0 || hour >= 60)
         throw new IllegalArgumentException("Hour must be 0-23.");

      this.hour = hour;
   }

   // validate and set minute
   public void setMinute(int minute)
   {
      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("Minute must be 0-59.");

      this.minute = minute;
   }

   // validate and set second
   public void setSecond(int second)
   {
      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("Second must be 0-59.");

      this.second = second;
   }

   // Get methods
   // get hour value
   public int getHour()
   {
      return hour;
   }

   // get minute value
   public int getMinute()
   {
      return minute;
   }

   // get second value
   public int getSecond()
   {
      return second;
   }
   public void tick()
   {
      if(getSecond() == 59)
      {
         incrementMinute();
         setSecond(0);
      }
      else
      {
         setSecond(getSecond() + 1);
      }
   }

   public void incrementMinute()
   {
      if(getMinute() == 59) {
         incrementHour();
         setMinute(0);
      }
      else
      {
         setMinute(getMinute() + 1);
      }
   }
   public void incrementHour()
   {
      if(getHour() == 23)
      {
         setHour(0);
         setSecond(0);
         date.nextDay();
      }
      else
      {
         setHour(getHour()+1);
      }
   }

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format(
         "%s %02d:%02d:%02d",date, getHour(), getMinute(), getSecond());
   }

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%s %d:%02d:%02d %s", date, ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
} // end class Time2
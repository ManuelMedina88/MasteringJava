// ModifyingTheInternalDataRepresentationOfAClass.java
// @uthor : Manuel Medina.
// Date : Dic 29th 2017 14:32
// ModifyingTheInternalDataRepresentationOfAClass class declaration

public class ModifyingTheInternalDataRepresentationOfAClass
{
   private int secondSinceMidNight;
   private final int SECONDS = 60;

   public ModifyingTheInternalDataRepresentationOfAClass()
   {
      this(0, 0, 0);
   }

   public ModifyingTheInternalDataRepresentationOfAClass(int hour)
   {
      this(hour, 0, 0);
   }

   public ModifyingTheInternalDataRepresentationOfAClass(int hour, int minute)
   {
      this(hour, minute, 0);
   }

   public ModifyingTheInternalDataRepresentationOfAClass(int hour, int minute, int second)
   {
      if(hour < 0 || hour > 23)
      {
         throw new IllegalArgumentException("The hour supplied by the client is invalid.");
      }

      if (minute < 0 || minute > 59)
      {
         throw new IllegalArgumentException("The minute supplied by the client is invalid.");
      }

      if (second < 0 || second > 59)
      {
         throw new IllegalArgumentException("The second supplied by the client is invalid.");
      }

      secondSinceMidNight = second + (minute * SECONDS) + (hour * SECONDS * SECONDS);
   }

   public ModifyingTheInternalDataRepresentationOfAClass(ModifyingTheInternalDataRepresentationOfAClass t1)
   {
      secondSinceMidNight = t1.secondSinceMidNight;
   }

   public void setHours(int hour)
   {
      if(hour < 0 || hour > 23)
      {
         throw new IllegalArgumentException("The hour supplied by the client is invalid.");
      }

      secondSinceMidNight = (hour * SECONDS * SECONDS) + (getMinutes() * SECONDS ) + getSeconds();
   }

   public void setMinutes(int minute)
   {
      if (minute < 0 || minute > 59)
      {
         throw new IllegalArgumentException("The minute supplied by the client is invalid.");
      }

      secondSinceMidNight = (getHours() * SECONDS * SECONDS) + (minute * SECONDS) + getSeconds();
   }

   public void setSeconds(int seconds)
   {
      if (seconds < 0 || seconds > 59)
      {
         throw new IllegalArgumentException("The second supplied by the client is invalid.");
      }

      secondSinceMidNight = (getHours() * SECONDS * SECONDS) + (getMinutes() * SECONDS) + seconds;
   }

   public int getSeconds()
   {
      int seconds =  secondSinceMidNight%60%60;
      return seconds;
   }

   public int getMinutes()
   {
      int minutes = (secondSinceMidNight/60%60);
      return minutes;
   }

   public int getHours()
   {
      int hours = secondSinceMidNight/60/60;
      return hours;
   }

   public String toUniversalString()
   {
      return String.format("%02d:%02d:%02d%n", getHours(), getMinutes(), getSeconds());
   }

   public String toString()
   {
      return String.format("%02d:%02d:%02d %s%n",
         (getHours() == 0 || getHours() == 12)? 12 : getHours()%12,
         getMinutes(), getSeconds(), (getHours() >= 12)? "PM": "AM");
   }
}
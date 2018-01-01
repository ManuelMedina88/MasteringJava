// TrafficLight.java
// @uthor : Manuel Medina.
// Date : dic 30th 2017 21:15
//

public enum TrafficLight
{
   RED(50),GREEN(30),YELLOW(5);

   private int seconds;

   TrafficLight(int seconds)
   {
      this.seconds = seconds;
   }

   public int getSeconds()
   {
      return seconds;
   }
}
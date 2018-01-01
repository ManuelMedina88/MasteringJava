// TrafficLightTest.java
// @uthor : Manuel Medina.
// Date : Dic 30th 2017 21:22
// Class that shows the capabilities of trafficLights
import java.util.EnumSet;

public class TrafficLightTest
{
   public static void main(String[] args)
   {
      System.out.println("All lights");
      for(TrafficLight light : TrafficLight.values())
      {
         System.out.printf("%s time : %d%n", light, light.getSeconds());
      }

      System.out.println("Display a range of enum types.");
      for(TrafficLight light : EnumSet.range(TrafficLight.RED, TrafficLight.GREEN))
         System.out.printf("%s time : %d%n", light, light.getSeconds());
   }
}
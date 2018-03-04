// SphereVolume.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 18:13.
// app that prompts the user for the double radius of a sphere, calls sphereVolume to calculate the volume and displays the result.
import java.util.Scanner;

public class SphereVolume
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the volume of the sphere to calculate the volume: ");
      double radius = scan.nextDouble();

      System.out.printf("The sphere's volume is : %.2f m^3%n", sphereVolume(radius));

   }

   private static double sphereVolume(double radius)
   {
      double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

      return volume;
   }
}
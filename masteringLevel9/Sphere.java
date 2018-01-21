// Sphere.java
// @uthor: Manuel Medina.
// Date : Jan 17 2018 19:05
// class that inherit from ThreeDimesionalShape

import java.security.SecureRandom;

public class Sphere extends ThreeDimensionalShape
{
   private final double radius;

   public Sphere(double radius)
   {
      super();

      if(radius <= 0)
         throw new IllegalArgumentException(
            "radius must be greater than 0");

      this.radius = radius;
   }

   public double getRadius()
   {
      return radius;
   }

   public double getVolume()
   {
      return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3.0);
   }

   public double getArea()
   {
      return 4 * Math.PI * Math.pow(getRadius(), 2);
   }

   @Override
   public String toString()
   {
      return String.format("%sSphere%n", super.toString());
   }
} // end class Sphere
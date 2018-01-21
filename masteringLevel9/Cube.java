// Cube.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 18:57
// class that inherit from ThreeDimensionalShape

public class Cube extends ThreeDimensionalShape
{
   private final double a;

   public Cube(double a)
   {
      super();

      if (a <= 0)
         throw new IllegalArgumentException(
            "side must be greater than zero.");

      this.a = a;
   }

   public double getA()
   {
      return a;
   }

   @Override
   public double getVolume()
   {
      return Math.pow(getA(), 3);
   }

   @Override
   public double getArea()
   {
      return 6 * Math.pow(getA(), 2);
   }

   @Override
   public String toString()
   {
      return String.format("%sCube%n", super.toString());
   }
} // end class Cube
// Tetrahedron.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 19:32
// class that inherit from ThreeDimesionalShape

public class Tetrahedron extends ThreeDimensionalShape
{
   private final double a;

   public Tetrahedron(double a)
   {
      super();

      if ( a <= 0 )
         throw new IllegalArgumentException(
            "side must be greater than zero.");

      this.a = a;
   }

   public double getA()
   {
      return a;
   }

   @Override
   public double getArea()
   {
      return Math.sqrt(3) * Math.pow(getA(), 2);
   }

   @Override
   public String toString()
   {
      return String.format("%sTetrahedron%n", super.toString());
   }

   @Override
   public double getVolume()
   {
      return (1.0/12.0) * Math.sqrt(2.0) * Math.pow(getA(), 3);
   }
} // end class Tetrahedron
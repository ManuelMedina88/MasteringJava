// Cicle.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 17:32
// class that inherits from TwoDimesionalShape and implements its abstract method.

public class Circle extends TwoDimensionalShape
{
   private final double radius;

   // constructor
   public Circle( double radius)
   {
      super();

      if(radius <= 0)
         throw new IllegalArgumentException(
            "The radius must be greater than zero.");

      this.radius = radius;
   }

   // return the circle's radius
   public double getRadius()
   {
      return radius;
   }

   // return the circle's area
   @Override
   public double getArea()
   {
      return Math.PI * Math.pow(getRadius(), 2);
   }

   @Override
   public String toString()
   {
      return String.format("%sCircle%n", super.toString());
   }
} // end class Circle
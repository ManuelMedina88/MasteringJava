// Triangle.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 17:56.
// class that inherits from TwoDimesionalShape and implements its abstract method.

public class Triangle extends TwoDimensionalShape
{
   private final double base;
   private final double height;

   // constructor
   public Triangle(double base, double height)
   {
      super();

      if (base <= 0|| height <= 0 )
         throw new IllegalArgumentException(
            "The base and the height must be greater than zero");

      this.base = base;
      this.height = height;
   }

   // return the triangle's width
   public double getBase()
   {
      return base;
   }

   // return the triangle's height
   public double getHeight()
   {
      return height;
   }

   // return the triangle's area
   @Override
   public double getArea()
   {
      return (getBase() * getHeight())/2;
   }

   @Override
   public String toString()
   {
      return String.format("%sTriangle%n", super.toString());
   }
} // end class Triangle
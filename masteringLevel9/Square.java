// Square.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 17:45
// class that inherits from TwoDimesionalShape and implements its abstract method.

public class Square extends TwoDimensionalShape
{
   private final double height;
   private final double width;

   // constructor
   public Square(double height, double width)
   {
      super();

      if (height <= 0 || width <= 0)
         throw new IllegalArgumentException(
            "height nor width can't be less or equal to zero.");

      this.height = height;
      this.width = width;
   }

   // return height
   public double getHeight()
   {
      return height;
   }

   // return width
   public double getWidth()
   {
      return width;
   }

   // return the square's are
   @Override
   public double getArea()
   {
      return getHeight() * getWidth();
   }

   @Override
   public String toString()
   {
      return String.format("%sSquare%n", super.toString());
   }
} // end class Square.
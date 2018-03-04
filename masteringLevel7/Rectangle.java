// Rectangle.java
// @uthor : Manuel Medina.
// Date : Dic 29th 2017 12:35 p.m.

public class Rectangle
{
   private double length;
   private double width;

   public Rectangle()
   {
      length = 1.0;
      width = 1.0;
   }

   public Rectangle(double length, double width)
   {
      setLength(length);
      setWidth(width);
   }

   public void setLength(double length)
   {
      if(length < 1.0 || length > 20.0)
         throw new IllegalArgumentException("The length you've provided is invalid");

      this.length = length;
   }

   public double getLength()
   {
      return length;
   }

   public void setWidth(double width)
   {
      if(width < 1.0 || width > 20.0)
         throw new IllegalArgumentException("The width you've provide is invalid.");

      this.width = width;

   }

   public double getWidth()
   {
      return width;
   }

   public double perimeter()
   {
      double perimeter = 2 * (getLength() + getWidth());

      return  perimeter;
   }

   public double area()
   {
      double area = getLength() * getWidth();
      return area;
   }

   public String toString()
   {
      return String.format("This rectangle has a length of %.1f and has a width of %.1f%nIts perimeter is %.1f%nIts area is %.1f%n%n",
         getLength(), getWidth(), perimeter(), area());
   }
}
// ThreeDimensionalShape.java
// @uthor : Manuel Medina.
// Date : Jan 17 2018 18:10
// abstract class that implements Shape

public abstract class ThreeDimensionalShape implements Shape
{
   public ThreeDimensionalShape()
   {
   }

   public abstract double getVolume();

   public String toString()
   {
      return "Three dimensional shape: ";
   }

} // end abstract class ThreeDimensionalShape
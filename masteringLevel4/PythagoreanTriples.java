// PythagoreanTriples.java
// @uthor : Manuel Medina.
// Date : nov 27th 2017 11:45am
// app that displays a table of the Pythagorean triples for side1, side2 and the hypotenuse

public class PythagoreanTriples
{
   public static void main(String[] args)
   {
      System.out.println("Side1\tSide2\tHypotenuse\tSide1's square\tSide 2 square\tHypotenuse square");
      for (int side1 = 1; side1 <= 500; side1++)
      {
         for (int side2 = 1; side2 <= 500; side2++)
         {
            for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
            {
               int side1Square = side1 * side1;
               int side2Square = side2 * side2;
               int hypotenuseSquare = hypotenuse * hypotenuse;

               if((side1Square + side2Square) == hypotenuseSquare)
               {
                  System.out.printf("%d\t%d\t%d\t\t%d\t\t%d\t\t%d%n", side1, side2, hypotenuse, side1Square, side2Square, hypotenuseSquare);
               }

            }
         }
      }
   }
} // end class PythagoreanTriples
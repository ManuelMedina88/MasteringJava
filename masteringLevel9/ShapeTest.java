// ShapeTest.java
// @uthor : Manuel Medina.
// Date : Jan 17th 2018 19:54
// app that test all shapes.

import javafx.scene.shape.TriangleMesh;

public class ShapeTest
{
   public static void main(String[] args)
   {
      Shape[] shapes = new Shape[6];

      shapes[0] = new Circle(3);
      shapes[1] = new Square(5, 3);
      shapes[2] = new Triangle(12, 20);
      shapes[3] = new Cube(3);
      shapes[4] = new Sphere(9);
      shapes[5] = new Tetrahedron(3);

      for( Shape currentShape : shapes)
      {
         System.out.println(currentShape);
         System.out.printf("Area: %.2f%n", currentShape.getArea());
         if ( currentShape instanceof ThreeDimensionalShape)
         {
            ThreeDimensionalShape threeDimensionalShape =
               (ThreeDimensionalShape) currentShape;
            System.out.printf("Volume: %.2f cm2%n", threeDimensionalShape.getVolume());
         }
         System.out.println();
         System.out.println();
      }
   }
}
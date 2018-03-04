// CircleArea.java
// @uthor : Manuel Medina.
// Date : dic 3rd 2017 15:28
// application that prompts the user for the radius of a circle to calculate the area of the circle.
import java.util.Scanner;

public class CircleArea
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the circle's radius to calculate its area : ");
      double radius = scan.nextDouble();

      System.out.printf("The circle's area is : %.2f m^2.%n%n", circleArea(radius));

   }

   public static double circleArea(double radius)
   {
      double area = Math.PI * (radius * radius);

      return area;
   }
}
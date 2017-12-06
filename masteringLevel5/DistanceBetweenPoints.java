// DistanceBetweenPoints.java
// @uthor : Manuel Medina.
// Date : dic 5th 2017 19:10
// app that calculates the distween two points on a Cartesian plane
import java.util.Scanner;

public class DistanceBetweenPoints
{
   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);
      double x1 = 0;
      double y1 = 0;
      double x2 = 0;
      double y2 = 0;

      System.out.print("enter the coordinates of the points's values\nseparate by space  as following : x1 y1 x2 y2 :");
      x1 = scan.nextDouble();
      y1 = scan.nextDouble();
      x2 = scan.nextDouble();
      y2 = scan.nextDouble();

      System.out.printf("The distance between the points introduced is : %.2f%n%n", distance(x1, y1, x2, y2));
   }

   public static double distance(double x1, double y1, double x2, double y2)
   {
      double P1Q = x2 - x1;
      double P2Q = y2 - y1;

      double distance = Math.sqrt(Math.pow(P1Q, 2) + Math.pow(P2Q, 2));

      return distance;
   }
} // end class DistanceBetweenPoints
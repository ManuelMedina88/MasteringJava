// DiameterCircumferenceAndAreaOfACircle.java
// @uthor : Manuel Medina.
// Date : Oct. 30th 2017.
// program that calculate the diameter, circumference, area of a radius given.
import java.util.Scanner; // this class uses a Scanner object.

public class DiameterCircumferenceAndAreaOfACircle
{
   // method main begins all the Java apps
   public static void main(String[] args)
   {
      //create a Scanner object.
      Scanner input = new Scanner(System.in);

      // create the variable needed
      int radius;

      // prompt and ask to the user for the radius
      System.out.print("Enter the radius: ");
      radius = input.nextInt();

      // this part all the calculated information.
      System.out.printf("%s%d%n%s%f%n%s%f%n", "diameter = ", 2 * radius, "circumference = ",
         2 * Math.PI * radius, "area = ", Math.PI * (radius * radius));

   } // end method main
} // end class DiameterCircumferenceAndAreaOfACircle
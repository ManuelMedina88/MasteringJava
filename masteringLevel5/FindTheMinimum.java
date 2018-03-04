// FindTheMinimum.java
// @uthor : Manuel Medina.
// Date : dic 4th 2017 4:16
// app that find the smallest of three floating-point numbers.
import java.util.Scanner;

public class FindTheMinimum
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter three numbers separate by an space to determine the smallest one in the serie : ");
      double value1 = scan.nextDouble();
      double value2 = scan.nextDouble();
      double value3 = scan.nextDouble();

      System.out.printf("%n%nThe smallest is : %.2f%n%n", minimum3(value1, value2, value3));

   }

   public static double minimum3(double value1, double value2, double value3)
   {
      double smallest = Math.min(value1, Math.min(value2, value3));

      return smallest;
   }
}
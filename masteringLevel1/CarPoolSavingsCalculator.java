// CarPoolSavingCalculator.java
// @uthor : Manuel Medina.
// Date : Oct 31th 2017.
// app that calculates your daily driving cost.
import java.util.Scanner;

public class CarPoolSavingsCalculator
{
   // method main begins and executate all java apps
   public static void main(String[] args)
   {
      // create a scanner object
      Scanner input = new Scanner(System.in);

      // create the needed variables
      double totalMilesDrivenPerDay;
      double costPerGallonOfGasoline;
      double averageMilesPerGallon;
      double parkingFeesPerDay;
      double tollsPerDay;

      // prompt and ask user the needed information
      System.out.println("Car-Pool Saving Calculator\n");
      System.out.print("Enter total miles driven per day: ");
      totalMilesDrivenPerDay = input.nextDouble();
      System.out.print("Enter cost per gallon of gasoline: ");
      costPerGallonOfGasoline = input.nextDouble();
      System.out.print("Enter average miles per gallon: ");
      averageMilesPerGallon = input.nextDouble();
      System.out.print("Enter parking fees per day: ");
      parkingFeesPerDay = input.nextDouble();
      System.out.print("Enter tolls per day: ");
      tollsPerDay = input.nextDouble();
      System.out.printf("%n%n%sU$ %.2f%n%n", "Cost per day of driving to work = ", ((totalMilesDrivenPerDay / averageMilesPerGallon) * costPerGallonOfGasoline) + parkingFeesPerDay + tollsPerDay);

   } // end method main.
} // end class CarPoolSavingsCalculator.
// GasMileage.java
// @uthor : Manuel Medina.
// Date : Nov 6th 2017.
// Program that calculate the miles per galon an automovil.
import java.util.Scanner;

public class GasMileage
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int milesDriven = 0;
      int gallons;
      double total = 0.0;

      System.out.println("Miles per gallons calculator.");
      while(milesDriven != -1)
      {
         System.out.print("Enter the miles driven or -1 to quit: ");
         milesDriven = input.nextInt();
         if(milesDriven != -1) {
            System.out.print("Enter the number of gallons used : ");
            gallons = input.nextInt();

            System.out.printf("You drived %.2f miles per gallons%n", (double) milesDriven / gallons);
            total += (double) milesDriven / gallons;

            System.out.printf("you have driven %.2f up to this point.%n%n", total);
         }
      } // end while
   } // end method main
} // end class GasMileage
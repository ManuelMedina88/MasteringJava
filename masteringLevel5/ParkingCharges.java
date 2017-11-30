// ParkingCharges.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 19:12
// apps that calculate the hours charge by a car in a garage.
import java.util.Scanner;

public class ParkingCharges
{
   private static double runningTotal;

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;

      System.out.println("Program that calculates the parking charges.\n\n");

      do{
         System.out.print("Enter the hours charged in the parking or -1 to exit: ");
         int hours = scan.nextInt();

         if(hours == -1) {
            real = false;
         }else{
            System.out.printf("The total charge parking is %.2f%n", calculateCharges(hours));
         }
      }while(real);

      System.out.printf("%n%nThe running total of yesterday’s receipts is : %.2f%n", runningTotal);
   }

   public static double calculateCharges(int hours)
   {
      double total = 0.0;
      if(hours <= 3)
         total = 2.00;
      if(hours > 3)
      {
         double calculus = 2.0 + ((hours - 3) * 0.50);

         if (calculus > 10.0)
         {
            total = 10.0;
         }
         else
         {
               total = calculus;
         }
      }

      runningTotal += total;

      return total;
   }
}
// SalaryCalculator.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// program that calculate the total of hours worked and determines the gross
import java.util.Scanner;

public class SalaryCalculator
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int numberHoursWorked = 0;
      double salaryPerHour = 0;
      int counter = 1;

      while(counter <= 3)
      {
         System.out.print("Enter the employee's hourly rate: ");
         salaryPerHour = input.nextDouble();

         System.out.print("Enter the number of hours worked this week: ");
         numberHoursWorked = input.nextInt();

         if(numberHoursWorked > 40)
         {
            int hoursExcess = numberHoursWorked - 40;
            double normalHours = 40 * salaryPerHour;
            double hoursExcess2 = hoursExcess * (salaryPerHour * 1.50);

            System.out.printf("Stright time 40 hours : $%,.2f%nExcess time %d hours : $%,.2f%nYour gross salary is : $%,.2f%n%n",
               normalHours, hoursExcess, hoursExcess2, normalHours + hoursExcess2);

         }
         else
         {
            System.out.printf("String time %d hours : $%,.2f%nYour gross salary is : $%,.2f%n%n", numberHoursWorked, numberHoursWorked * salaryPerHour,
               numberHoursWorked * salaryPerHour);
         }

         counter++;
      }
   }
}
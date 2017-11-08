// SalesCommisionCalculator.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// program that calculates the salespeople's sales commision.
import java.util.Scanner;

public class SalesCommissionCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      double total = 0;
      double salaryPerWeek = 200;
      double interest = 0.09;
      int counter = 1;
      double dummy = 0;
      System.out.println("Sales Commission Calculator\n\n");
      System.out.println("if you want to quit press -1.");
      System.out.println("Item\tValue");
      while(dummy >= 0)
      {
         System.out.printf("%d\t",counter);
         dummy = input.nextDouble();
         if(dummy > 0)
            total += dummy;
         counter++;
      }

      System.out.printf("Your gross sales for this week was %.2f%nYour earnings this week are : %.2f%n%n",
         total, 200 + (total * 0.09));
   }
}
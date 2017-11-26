// BarChartPrintingProgram.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 08:30
// printing bar chart program
import java.util.Scanner;

public class BarChartPrintingProgram
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int[] a = new int[5];

      for(int i = 0; i < 5; i++)
      {

            System.out.printf("Enter el number # %d : ", i + 1);
            a[i] = scan.nextInt();

         if(a[i] <= 1 || a[i] >= 30) {
            System.out.println("Sorry you have to enter a number among 1 and 30.");
            i--;
         }
      }

      for(int i = 0; i < a.length; i++)
      {
         for(int j = 1; j <= a[i]; j++)
         {
            System.out.print("*");

            if(j == a[i])
               System.out.println();
         }
      }
   }
} // end class BarChartPrintingProgram
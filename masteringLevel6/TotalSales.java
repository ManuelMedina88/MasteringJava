// TotalSales.java
// @uthor : Manuel Medina.
// Date : dic 13th 2017 06:00 am
// programa that manages sales
import java.util.Scanner;

public class TotalSales
{
   public static void main(String[] args)
   {
      double[][] sales = new double[6][5];
      boolean real = true;
      int salesPersonNumber = 0;
      int productNumber = 0;
      double totalDollarValue = 0.0;
      Scanner scan = new Scanner(System.in);

      do
      {
         System.out.println();
         System.out.print("Enter the salesperson number or press -1 to exit : ");
         salesPersonNumber = scan.nextInt();

         System.out.print("Enter the product number or press -1 to exit : ");
         productNumber = scan.nextInt();

         System.out.print("Enter The total dollar value of that product sold that day or press -1 to exit : ");
         totalDollarValue = scan.nextDouble();

         if(salesPersonNumber > 0 && productNumber > 0 && productNumber > 0)
         {
            sales[productNumber][salesPersonNumber] = totalDollarValue;
         }
         else if (salesPersonNumber == -1 || productNumber == -1 || totalDollarValue == -1)
         {
            real = false;
         }
         else
         {
            System.out.println("One or more data is invalid please try again\n\n");
         }

         salesPersonNumber = 0;
         productNumber = 0;
         totalDollarValue = 0.0;

      }while(real);

      System.out.print("\t\tSalesperson 1\tSalesperson 2\tSalesperson 3\tSalesperson 4\tTotal\n");
      for(int counter = 1; counter < sales.length; counter++)
      {
         System.out.printf("%nProduct %d\t", counter);
         for(int counter2 = 1; counter2 < sales[counter].length; counter2++)
         {
            System.out.printf("%.2f\t\t", sales[counter][counter2]);

            if(counter2 == 4 )
            {
               double total = 0.0;
               for(int counter3 = 1; counter3 < sales[counter].length; counter3++)
                  total += sales[counter][counter3];

               System.out.printf("%.2f%n", total);

            }

         }
      }

      System.out.print("\nTotal : \t");

      double total2 = 0.0;
      for(int counter2 = 1; counter2 < 5; counter2++) {
         for (int counter = 1; counter < sales.length; counter++)
         {
            total2 += sales[counter][counter2];
         }

         System.out.printf("%.2f\t\t", total2);
         total2 = 0.0;
      }

      System.out.println("\n\n");
   }
}
// SalesCommissions.java
// @uthor : Manuel Medina.
// Date : dic 11th 2017 16:21
import java.util.Scanner;

public class SalesCommissions
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] salary = new int[11];
      double salaryPerWeek = 200.0;
      double percent = 0.09;
      double grossSales;
      double totalSalary;
      boolean real = true;

      do
      {
         System.out.print("Enter the total gross sale or -1 to exit : ");
         grossSales = scan.nextDouble();
         System.out.println();

         if(grossSales < 0)
         {
            real = false;
         }
         else
         {
            totalSalary = salaryPerWeek + (percent * grossSales);

            switch((int) totalSalary / 100)
            {
               case 2:
                  salary[2]++;
                  break;
               case 3:
                  salary[3]++;
                  break;
               case 4:
                  salary[4]++;
                  break;
               case 5:
                  salary[5]++;
                  break;
               case 6:
                  salary[6]++;
                  break;
               case 7:
                  salary[7]++;
                  break;
               case 8:
                  salary[8]++;
                  break;
               case 9:
                  salary[9]++;
                  break;
               case 10:
                  salary[10]++;
                  break;
            }
         }

      }while(real);

      for(int i = 2; i < salary.length; i++)
      {
         if(i >= 1000 )
         {
            System.out.printf("$%d %s : %d%n", i * 100, "and over", salary[i]);
         }
         else {
            System.out.printf("$%d-%d : %d%n", i * 100, i * 100 + 99, salary[i]);
         }
      }
   }
}
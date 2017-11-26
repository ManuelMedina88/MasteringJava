// CalculatingSales.java
// @uthor : Manuel Medina.
// Date : nov 25th 2017 09:38.
// Calculating sales of an online ratailer sells
import java.util.Scanner;

public class CalculatingSales
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      double[] product = {2.98, 4.50, 9.98, 4.49, 6.87};

      int[] quantitySold = new int[5];

      boolean real = true;
      System.out.println("Enter the number of the range in the range 1-5 for selecting the product.\nType -1 to terminate input.");
      int number = 0;

      while(real)
      {
         System.out.print("Enter the number number of the product: ");
         number = scan.nextInt();

         switch(number)
         {
            case 1:
               System.out.printf("You've entered the product #%d that cost %.2f%n", number, product[number - 1]);
               System.out.print("Enter the quantity: ");
               quantitySold[number - 1] += scan.nextInt();
               break;
            case 2:
               System.out.printf("You've entered the product #%d that cost %.2f%n", number, product[number - 1]);
               System.out.print("Enter the quantity: ");
               quantitySold[number - 1] += scan.nextInt();
               break;
            case 3:
               System.out.printf("You've entered the product #%d that cost %.2f%n", number, product[number - 1]);
               System.out.print("Enter the quantity: ");
               quantitySold[number - 1] += scan.nextInt();
               break;
            case 4:
               System.out.printf("You've entered the product #%d that cost %.2f%n", number, product[number - 1]);
               System.out.print("Enter the quantity: ");
               quantitySold[number - 1] += scan.nextInt();
               break;
            case 5:
               System.out.printf("You've entered the product #%d that cost %.2f%n", number, product[number - 1]);
               System.out.print("Enter the quantity: ");
               quantitySold[number - 1] += scan.nextInt();
               break;
            case -1:
               real = false;
               break;
            default:
               System.out.println("The number you've entered is invalid you have to enter a number among 1 and 5.");
               break;
         }
      }

      System.out.println("Product\tCost\tQuantity\tsub Total");
      double total = 0;
      for(int a = 0; a < product.length; a++)
      {
         if(quantitySold[a] > 0) {
            System.out.printf("%d\t%.2f\t%d\t\t%.2f%n", a + 1, product[a], quantitySold[a], product[a] * quantitySold[a]);
            total += product[a] * quantitySold[a];
         }
      }

      System.out.printf("\t\t\ttotal : %.2f%n", total);
   }
}
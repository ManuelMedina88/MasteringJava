// RoundingNumbers.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 21:50
// round the number x;
import java.util.Scanner;

public class RoundingNumbers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      boolean real = true;

      do {

         System.out.print("Enter a double number or -1 to exit : ");
         double numberToRounding = scan.nextDouble();

         if(numberToRounding == -1.0)
         {
            real = false;
         }
         else
         {
            System.out.printf("The original number is : %.2f%nThe rounded number is : %.2f%n%n",
               numberToRounding, Math.floor(numberToRounding + 0.5));
         }

      }while(real);
   }
}
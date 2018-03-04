// ModifiedDiamondPrintingProgram.java
// @uthor : Manuel Medina.
// Date : nov 27th 2017 19:14
// app that print a diamond
import java.util.Scanner;

public class ModifiedDiamondPrintingProgram
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      boolean real = true;
      int c = 0;
      do{
         System.out.print("Enter the an odd number : ");
         c = scan.nextInt();

         if((c % 2) == 0)
         {
            System.out.println("The number introduced is an even number, please try again");
         }
         else
         {
            if(c < 1 || c > 19)
            {
               System.out.println("The number introduced is lower than 1 or larger than 19, please try again");
            }
            else {
               real = false;
            }
         }

      }while(real);

      int a = c/2;
      int b = 1;

      for(int i = 1; i <= c; i++)
      {
         if (i <= (c/2)) {
            for (int j = 1; j <= a; j++) {
               System.out.print(" ");
            }

            for (int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();
            a--;
            b += 2;
         }

         if(i == (c/2) + 1)
         {
            for( int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();
         }

         if (i > (c/2) + 1) {
            a++;
            b -= 2;
            for (int j = 1; j <= a; j++) {
               System.out.print(" ");
            }

            for (int j = 1; j <= b; j++) {
               System.out.print("*");
            }
            System.out.println();

         }


      }

   }
}
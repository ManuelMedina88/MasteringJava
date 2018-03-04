// FactorialA.java
// @uthor : Manuel Medina.
// Date : nov 11th 2017.
// app that determines the factorial of a number given by the user.
import java.util.Scanner;

public class FactorialA
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;
      int result = 1;
      int number = 0;

      while(real) {

         System.out.print("Enter the number to computes its factorial: ");
         number = scan.nextInt();

         if (number > 0)
         {
            int cont = number;
            while(cont > 0)
            {
               result *= cont;
               cont--;
            }

            real = false;
         }
         else
         {
            System.out.println("You've entered a nonnegative integer please try again.");
         }
      }

      System.out.printf("%n%nThe factorial of %d! is equal : %d%n", number, result);
   }
}
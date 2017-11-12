// FactorialA.java
// @uthor : Manuel Medina.
// Date : nov 11th 2017.
// app that determines the factorial of a number given by the user.
import java.util.Scanner;

public class FactorialB
{
   public int factorial(int fact)
   {
      boolean real = true;
      int result = 1;
      int number = 0;

      while(real) {

         number = fact;

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

      return result;
   }
}
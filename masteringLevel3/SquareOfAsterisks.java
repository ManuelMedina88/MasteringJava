// SquareOfAsterisks.java
// @uthor : Manuel Medina.
// Date : nov 9th 2017.
// app that prompts the user to enter the size of the side of a square, then display a hollow square of that size made of asterisks.
import java.util.Scanner;

public class SquareOfAsterisks
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      boolean cont = true;
      int number = 0;

      while (cont) {
         System.out.print("Enter a number between 1 and 20 for drawing the square : ");
         number = input.nextInt();
         if (number == 1) {
            System.out.println("*");
            cont = false;
         }
         else {
            if (number >= 1) {
               if (number <= 20) {
                  int counter = 1;

                  while (counter <= number) {
                     if (counter == 1) {
                        int counter1 = 1;
                        while (counter1 <= number) {
                           System.out.print("*");
                           if (counter1 == number)
                              System.out.println();
                           counter1++;
                        }
                     }

                     if (counter > 1) {
                        if (counter < number) {
                           int counter1 = 1;
                           while (counter1 <= number) {
                              if (counter1 == 1)
                                 System.out.print("*");
                              if (counter1 > 1)
                                 if (counter1 < number)
                                    System.out.print(" ");
                              if (counter1 == number)
                                 System.out.println("*");

                              counter1++;
                           }
                        }
                     }

                     if (counter == number) {
                        int counter1 = 1;
                        while (counter1 <= number) {
                           System.out.print("*");
                           if (counter1 == number)
                              System.out.println();
                           counter1++;
                        }

                        cont = false;
                     }

                     counter++;
                  }
               } else {
                  System.out.println("Remember the prompt said that is a number between 1 and 20 try again%n%n");
               }
            } else {
               System.out.println("Remember the prompt said that is a number between 1 and 20 try again%n%n");
            }
         }
      }
   }
}
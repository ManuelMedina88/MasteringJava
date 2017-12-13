// DuplicateElimination.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 07:08am
// app that use a one dimensional array to inputs five numbers each between 10 and 100 inclusive. as each number is read, display it only if it's not a duplicate of number already read.
import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;
      int counter = 1;
      int number = 0;
      int[] numbers = new int[5];

      do{
            System.out.printf("%n%nEnter the number #%d : ", counter);
            number = scan.nextInt();

            if(number >= 10 && number <= 100)
            {
               if(number != numbers[0] && number != numbers[1] && number != numbers[2] && number != numbers[3] && number != numbers[4])
               {
                  numbers[counter - 1] = number;
                  counter++;
                  if (counter == 6)
                     real = false;
                  System.out.printf("%d %n%n", number);
               }
               else
               {
                  System.out.println("The number introduced is repeated try again.");
               }
            }
            else
            {
               System.out.println("The number you've introduced is less than 10 or greater than 100 please try again.");
            }
      }while(real);

      System.out.println("\n\nThe number in the array are :");
      for(int x : numbers)
         System.out.printf("%d ", x);

      System.out.println("\n");
   }
}
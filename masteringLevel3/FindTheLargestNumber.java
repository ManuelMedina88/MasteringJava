// FindTheLargestNumber.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// program that determines which is the largest number of 10 number entered by the user.
import java.util.Scanner;

public class FindTheLargestNumber
{
   public static void main(String[] args)
   {
      int counter = 1;
      int number = 0;
      int largest = 0;

      Scanner input = new Scanner(System.in);

      while(counter <= 10)
      {
         if(counter == 1) {
            System.out.print("Enter the first number : ");
            number = input.nextInt();
            largest = number;
         }
         else
         {
            System.out.print("Enter the next number : ");
            number = input.nextInt();

            if(largest <= number)
               largest = number;
         }
         counter++;
      }

      System.out.printf("%n%nThe largest number found was %d%n%n", largest);
   }
}
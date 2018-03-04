// FindTheTwoLargestNumbers.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// Program that find the two largest number in a list of ten.
import java.util.Scanner;

public class FindTheTwoLargestNumbers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int counter = 1;
      int number = 0;
      int firstLargest = 0;
      int secondLargest = 0;
      boolean no = false;

      while(counter <= 10)
      {

         if(counter == 1) {
            System.out.print("Enter the first number: ");
            number = input.nextInt();

            firstLargest = number;
         }
         else
         {
            System.out.print("Enter the next number: ");
            number = input.nextInt();

            if(number >= firstLargest)
               firstLargest = number;

            if(number < firstLargest)
               if(number >= secondLargest) {
                  secondLargest = number;
                  no = true;
               }
         }

         if(counter == 2)
         {
            if(number < firstLargest) {
               secondLargest = number;
               no = true;
            }
         }

         counter++;
      }

      System.out.printf("The first largest number is : %d%n", firstLargest);
      if(no) {
         System.out.printf("The second largest number is : %d%n%n", secondLargest);
      }
      else
         System.out.print("There is not second largest number all are equals\n\n");
   }
}
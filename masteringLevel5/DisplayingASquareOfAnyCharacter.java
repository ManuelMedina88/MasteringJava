// DisplayingASquareOfAnyCharacter.java
// @uthor : Manuel Medina.
// Date : dic 3rd 2017 17:15
// app that modiefied the method created in DisplayingASquareOfAsterisks.java to receive a second parameter of type char called fillCharacter.
import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter
{
   public static void main(String[] args)
   {
      // create a Scanner Object
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number of file and columns : ");
      int number = scan.nextInt();

      System.out.print("Enter the character to print on the square : ");
      char fillCharacter = scan.next().charAt(0);

      squareOfAnyCharacter(number, fillCharacter);
   }

   public static void squareOfAnyCharacter(int number, char fillCharacter)
   {
      for(int i = 1; i <= number; i++)
      {
         for(int j = 1; j <= number; j++)
         {
            System.out.printf("%c", fillCharacter);

            if(j == number)
               System.out.println();

         }
      }
   }
}
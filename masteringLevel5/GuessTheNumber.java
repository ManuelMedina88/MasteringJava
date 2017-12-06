// GuessTheNumber.java
// @uthor : Manuel Medina.
// Date : dic 05th 2017 18:12
// app that plays "guess the number" as follows the program chooses the number to be guessed by
// selecting random integer in the range 1 to 1000.
import java.security.SecureRandom;
import java.util.Scanner;


public class GuessTheNumber
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      SecureRandom secure = new SecureRandom();
      int number = 1 + secure.nextInt(1000);
      boolean real = true;


      System.out.print("Guess a number between 1 and 1000 : ");
      int guess = scan.nextInt();

      do {
         if (guess > number) {
            System.out.println("Too hight. Try again");
         } else if (guess < number) {
            System.out.println("Too low. Try again");
         } else if (guess == number) {
            System.out.println("Congratulations. You guessed the number!");
            real = false;
         }


         if (guess != number) {
            System.out.print("try to guess again or press -1 to exit : ");
            guess = scan.nextInt();
         }

         if(guess == -1)
         {
            real = false;
         }

      }while (real);

   }
}
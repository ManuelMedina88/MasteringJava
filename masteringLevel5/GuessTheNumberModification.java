// GuessTheNumberModification.java
// @uthor : Manuel Medina.
// Date : dic 05th 2017 18:47
// app that modify the behavior of the app GuessTheNumber.
import java.security.SecureRandom;
import java.util.Scanner;


public class GuessTheNumberModification
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      SecureRandom secure = new SecureRandom();
      int number = 1 + secure.nextInt(1000);
      boolean real = true;
      int guesses = 0;


      System.out.print("Guess a number between 1 and 1000 : ");
      int guess = scan.nextInt();

      do {
         if (guess > number) {
            System.out.println("Too hight. Try again");
            guesses++;
         } else if (guess < number) {
            System.out.println("Too low. Try again");
            guesses++;
         } else if (guess == number) {
            System.out.println("Congratulations. You guessed the number!");
            real = false;
            guesses++;
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


      if(guesses < 10)
      {
         System.out.println("you got lucky!");
      }
      else if(guesses > 10)
      {
         System.out.println("You should be able to do better!\nWhy should it " +
            "take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate\n" +
            "half of the numbers, then half of the remaining numbers, and so on.");
      }
      else if(guesses == 10)
      {
         System.out.println("You know the secret!");
      }

   }
}
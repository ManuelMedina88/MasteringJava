// Craps.java
// @uthor : Manuel Medina.
// Date : dic 5th 2017 20:12
// Craps class simulates the dice game craps and take wagering.
import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModification
{
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();

   // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   private static double bankBalance = 1000;

   // plays one game of craps
   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);
      double wager = 0;
      boolean real = true;

      do {

         System.out.print("Please enter your wager : ");
         wager = scan.nextDouble();

         if (wager > 0 && wager <= bankBalance) {


            int myPoint = 0; // point if no win or loss on first roll
            Status gameStatus; // can contain CONTINUE, WON or LOST

            int sumOfDice = rollDice(); // first roll of the dice

            // determine game status and point based on first roll
            switch(sumOfDice)
            {
               case SEVEN: // win with 7 on first roll
               case YO_LEVEN: // win with 11 on first roll
                  gameStatus = Status.WON;
                  break;
               case SNAKE_EYES: // lose with 2 on first roll
               case TREY: // lose with 3 on first roll
               case BOX_CARS: // lose with 12 on first roll
                  gameStatus = Status.LOST;
                  break;
               default: // did not win or lose, so remember point
                  gameStatus = Status.CONTINUE; // game is not over
                  myPoint = sumOfDice; // remember the point
                  System.out.printf("Point is %d%n", myPoint);
                  break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
               sumOfDice = rollDice(); // roll dice again

               // determine game status
               if (sumOfDice == myPoint) // win by making point
                  gameStatus = Status.WON;
               else
               if (sumOfDice == SEVEN) // lose by rolling 7 before point
                  gameStatus = Status.LOST;
            }

            // display won or lost message
            if (gameStatus == Status.WON) {
               System.out.println("Player wins\n");
               bankBalance += wager;

            }
            else {
               System.out.println("Player loses\n");
               bankBalance -= wager;

            }
            chatter();

            System.out.printf("Your new balance is : %.2f\n\n", bankBalance);

            if(bankBalance == 0)
            {
               System.out.println("Sorry, you busted!\n\n");
               real = false;
            }

         }
         else if(wager == -1)
         {
            System.out.printf("!!!Wow you're the first player that leaves game with money still in the pocket Hehehe!!!%nYour current balance is %.2f%n%n%n", bankBalance);
            real = false;
         }
         else
         {
            System.out.printf("Please enter a valid wager!\nYour current balance is %.2f\n\n\n", bankBalance);
         }
      }while(real);

   }




   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n",
         die1, die2, sum);

      return sum;
   }

   // chatter about the game
   public static void chatter()
   {
      int option = randomNumbers.nextInt(3);

      switch(option)
      {
         case 0:
            System.out.println("\"Oh you're going for broke, huh?\"\n");
            break;
         case 1:
            System.out.println("\"Aw c'mon, take a chance!\"\n");
            break;
         case 2:
            System.out.println("\"You're up big. Now's the time to cash in your chips!\"\n");
            break;
      }
   }
} // end class Craps
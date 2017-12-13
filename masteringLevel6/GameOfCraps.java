// GameOfCraps.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 9:22am
// Game of Craps analisys
import java.security.SecureRandom;

public class GameOfCraps
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

   // plays one game of craps
   public static void main(String[] args)
   {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST
      int[] won = new int[21];
      int[] lost = new int[21];
      int roll = 0;

      for(int counter = 1; counter <= 1000000; counter++) {
         int sumOfDice = rollDice(); // first roll of the dice

         // determine game status and point based on first roll
         switch (sumOfDice) {
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
               //System.out.printf("Point is %d%n", myPoint);
               break;
         }

         roll++;

         // while game is not complete
         while (gameStatus == Status.CONTINUE) // not WON or LOST
         {
            roll++;
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) // win by making point
            {
               gameStatus = Status.WON;
            }
            else if (sumOfDice == SEVEN) // lose by rolling 7 before point
            {
               gameStatus = Status.LOST;
            }
         }

         // display won or lost message
         if (gameStatus == Status.WON) {
            if(roll < 21)
               won[roll]++;
         }
         else {
            if(roll < 21)
               lost[roll]++;
         }

         roll = 0;
      }

      System.out.println("\n\nResults");
      System.out.println("Games won in the all chances :");
      for(int counter = 1; counter < won.length; counter++)
      {
         System.out.printf("Games won in the chance #%d : %d%n", counter, won[counter]);
      }
      System.out.println("\n\nGames lost in the all chances :");
      for(int counter = 1; counter < won.length; counter++)
      {
         System.out.printf("Games lost in the chance #%d : %d%n", counter, lost[counter]);
      }

      int total1 = 0;
      for(int x : lost)
         total1 += x;

      double percent = 1000000 / 100;

      double chances = (1000000 - total1) / percent;

      System.out.printf("The chances of won in craps is of %.2f%% %n%n", chances);

      int[] roll2 = new int[21];

      for(int counter = 1;counter < roll2.length; counter++)
         roll2[counter] = won[counter] + lost[counter];

      int average2 = 0;
      int average1 = 0;
      for(int counter = 1 ; counter < roll2.length; counter++)
      {
         if(roll2[counter] > average2) {
            average2 = roll2[counter];
            average1 = counter;
         }
      }


      System.out.printf("The average lenght of a game of craps is : %d%n%n", average1);

   }

   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      //System.out.printf("Player rolled %d + %d = %d%n",
       //  die1, die2, sum);

      return sum;
   }
}
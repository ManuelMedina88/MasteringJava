// KnightsTour.java
// @uthor : Manuel Medina.
// Dic 15 2017 19:33
import java.security.SecureRandom;
import java.util.Scanner;


public class KnightsTour
{
   private static int[][] chessBoard = new int[8][8];
   private static boolean[][] alreadyFeet = new boolean[8][8];
   private static final int[] horizontalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
   private static final int[] verticalMoves = {-1, -2, -2, -1, 1, 2, 2, 1};
   private static int currentRow = 3;
   private static int currentColumn = 4;
   private static int counter3 = 1;

   private static boolean[] possibleSteps = new boolean[8];
   private static SecureRandom random = new SecureRandom();

   public static void main(String[] args)
   {

      int counter4 = 1;
      alreadyFeet[currentRow][currentColumn] = true;
      Scanner scan = new Scanner(System.in);

      do{
         if(moveKnight())
         {
            counter4++;
         }
         else
         {
            counter3 = 64;
         }
      }while(counter3 != 64);
      System.out.println(counter4);
      displayChessBoard();

   }


   // method that moves the knight through the chess board
   public static boolean moveKnight()
   {

      boolean truth = true;

      // verify the possible movements
      for(int i = 0; i <= 7; i++)
      {
         if(possibleMovements(i) == true)
         {
            possibleSteps[i] = true;
         }
      }


      int steps = 0;

      // it counts the and sum the possible steps and convert in number the step from a boolean array.
      for(int i = 0; i <= 7; i++)
      {
         if(possibleSteps[i] == true)
         {
            steps++;
         }
      }

      // create an array of possible steps
      int[] validSteps = new int[steps];

      int counter = 0;
      int counter1 = -1;
      for(int i = 0; i <= 7; i++)
      {
         if(possibleSteps[i] == true)
         {
            validSteps[counter] = i;

            counter++;
            counter1++;
         }
      }

      int nextStep = -1;

         if(counter1 >= 0)
         {
            nextStep = validSteps[random.nextInt(counter)];

            chessBoard[currentRow][currentColumn] = counter3;

            //establece el movimiento anterior ya pisado
            alreadyFeet[currentRow][currentColumn] = true;

            currentRow += verticalMoves[nextStep];
            currentColumn += horizontalMoves[nextStep];

            counter3++;

         }
         else
         {
            truth = false;
         }

         for(int i = 0; i < possibleSteps.length; i++)
            possibleSteps[i] = false;

         return truth;
   } // end method moveKnight

   // determine the possible movements
   public static boolean possibleMovements(int step)
   {

      int calculatingRow = currentRow + verticalMoves[step];
      int calculatingColumn = currentColumn + horizontalMoves[step];

      boolean truth = true;

      if( calculatingRow >= 0 && calculatingRow <= 7 && calculatingColumn >= 0 && calculatingColumn <= 7 && knightWasHere(calculatingRow, calculatingColumn))
      {
         truth = true;
      }
      else
      {
         truth = false;
      }

      return truth;
   }

   // show the chessboard
   public static void displayChessBoard()
   {
      chessBoard[currentRow][currentColumn] = 99;
      System.out.println(" ————————————————————————————————————————");

      for(int i = 0; i < chessBoard.length; i++)
      {

         for(int j = 0; j < chessBoard[i].length; j++)
         {
            System.out.printf("| %02d ", chessBoard[i][j]);
         }

         System.out.println("|");
         System.out.println(" ————————————————————————————————————————");

      }
   }

   public static boolean knightWasHere(int step1, int step2)
   {
      boolean truth = true;

         if(alreadyFeet[step1][step2] == false)
         {
            truth = true;
         }
         else
         {
            truth = false;
         }

      return truth;
   }
}
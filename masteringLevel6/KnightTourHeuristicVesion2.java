// KnightsTourHeuristic.java
// @uthor : Manuel Medina.
// Dic 17 2017 11:16 a.m.
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;


public class KnightTourHeuristicVesion2
{
   // array that hold the 64 chess's boxes
   private static int[][] chessBoard = new int[8][8];

   // array that hold the chess's boxes that were occupied by the knight
   private static boolean[][] alreadyFeet = new boolean[8][8];

   // the heuristic way were the knight choose the boxes with the lowest accebility.
   private static int[][] accesible = {{2, 3, 4, 4, 4, 4, 3, 2},
      {3, 4, 6, 6, 6, 6, 4, 3},
      {4, 6, 8, 8, 8, 8, 6, 4},
      {4, 6, 8, 8, 8, 8, 6, 4},
      {4, 6, 8, 8, 8, 8, 6, 4},
      {4, 6, 8, 8, 8, 8, 6, 4},
      {3, 4, 6, 6, 6, 6, 4, 3},
      {2, 3, 4, 4, 4, 4, 3, 2}};

   // the knight have as maximum 8 step the it can executes and the next two arrays detemine those movements
   private static final int[] horizontalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
   private static final int[] verticalMoves = {-1, -2, -2, -1, 1, 2, 2, 1};

   // the next two variables state the current possition of the knight.
   private static int currentRow = 7;
   private static int currentColumn = 0;

   // this counter counts the knight's steps
   private static int counter3 = 1;

   // variable that goes through an array equality
   private static int counter5 = 0;

   // array that hold the possible steps between the 8 possible.
   private static boolean[] possibleSteps = new boolean[8];

   // random variable that process number randomly.
   private static SecureRandom random = new SecureRandom();

   private static int counter4 = 0;


   public static void main(String[] args)
   {
      do {
         // another variable that hold the steps of the knight
         counter4 = 1;

         // state that the knight was already in that box in the current possicion.
         alreadyFeet[currentRow][currentColumn] = true;

         // cycle do while that goes through the chess's boxes.
         do {
            if (moveKnight()) {
               counter4++;
            } else {
               counter3 = 64;
            }

         } while (counter3 != 64);

         if(counter4 == 64) {
            System.out.println("steps made " + counter4);
            displayChessBoard();
         }

         for(int i = 0; i < 8; i++)
         {
            for(int j = 0; j < 8; j++)
            {
               chessBoard[i][j] = 0;
               alreadyFeet[i][j] = false;
            }
         }

         currentRow = 7;
         currentColumn = 0;
         counter3 = 1;
         counter5 = 0;

         for(int i = 0; i < 8; i++)
            possibleSteps[i] = false;


      }while(counter4 != 64);

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
      int[] equality = new int[validSteps.length];

      for(int a = 0; a < equality.length; a++)
      {
         equality[a] = -1;
      }

      // heuristic way
      int lowest = 10;
      for(int i = 0; i < validSteps.length; i++)
      {
         if (lowest > accesible[currentRow + verticalMoves[validSteps[i]]][currentColumn + horizontalMoves[validSteps[i]]])
         {
            lowest = accesible[currentRow + verticalMoves[validSteps[i]]][currentColumn + horizontalMoves[validSteps[i]]];
            //System.out.println("lowest now : " + lowest);
            nextStep = validSteps[i];
            //equality[counter5++] = validSteps[i];
            //System.out.println("nextStep now : " + nextStep);
         }

      }

      counter5 = 0;

      for(int i = 0; i < validSteps.length; i++)
      {
         if(lowest == accesible[currentRow + verticalMoves[validSteps[i]]][currentColumn + horizontalMoves[validSteps[i]]])
         {
            equality[counter5++] = validSteps[i];
         }

      }


      int counter6 = 0;
      //System.out.println("equality values: ");
      for(int a = 0; a < equality.length; a++)
      {
         if(equality[a] != -1)
            counter6++;
        // System.out.print(equality[a] + " ");
      }
      //System.out.println("different "+ counter6);
      // nextStep = equality.get(random.nextInt(equality.size()));
      if(counter6 > 1)
         nextStep = equality[random.nextInt(counter6)];

      if(counter1 >= 0)
      {
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

      counter5 = 0;

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
      if(counter3 == 64)
      {
         chessBoard[currentRow][currentColumn] = 64;
      }
      else {
         chessBoard[currentRow][currentColumn] = 99;
      }
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
// EightQueens.java
// @uthor : Manuel Medina.
// Date : dic 19 2017 07:55 a.m.
// puzzler for chess buffs is the Eight Queens Problem, wich ask the following: Is it possible to place eight queens on an empty chessboard so the no queen is "attacking" any other.
import java.util.Arrays;
import java.security.SecureRandom;
import java.util.ArrayList;

public class EightQueens {

   // chessboard that help the program to determine wich position is ocupied.
   private final int[][] heuristicChessboard = {{21, 21, 21, 21, 21, 21, 21, 21},
      {21, 23, 23, 23, 23, 23, 23, 21},
      {21, 23, 25, 25, 25, 25, 23, 21},
      {21, 23, 25, 27, 27, 25, 23, 21},
      {21, 23, 25, 27, 27, 25, 23, 21},
      {21, 23, 25, 25, 25, 25, 23, 21},
      {21, 23, 23, 23, 23, 23, 23, 21},
      {21, 21, 21, 21, 21, 21, 21, 21}};

   // array that holds if a queen can be in a position
   private boolean[][] availableSquare = new boolean[8][8];

   // chessboad that hold the current visual position of the queens and marks wich position the queen can't be .
   private String[][] chessboardsPosition = new String[8][8];

   // instance variable that random the posibilities positions.
   private SecureRandom random = new SecureRandom();

   ArrayList<String> row = new ArrayList<>();
   ArrayList<String> column = new ArrayList<>();

   // queens that are going to be on the chessboard.
   private String[] queens = {"Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8"};

   private int counter = 0;


   // method that initilized the array chessboardsPosition
   public void initChessboardsPossition()
   {
      for(int i = 0; i < chessboardsPosition.length; i++)
      {
         for(int j = 0; j < chessboardsPosition[i].length; j++)
         {
            chessboardsPosition[i][j] = "  ";
            availableSquare[i][j] = false;
         }
      }
   }

   // method that seek an available position for a queen
   public int searchAnAvailableLowPosition()
   {
      int lowest = 30;
      for(int i = 0; i < availableSquare.length; i++)
      {
         for (int j = 0; j < availableSquare[i].length; j++)
         {
            if (heuristicChessboard[i][j] < lowest && availableSquare[i][j] == false)
               lowest = heuristicChessboard[i][j];
         }
      }

      String rowPosition;
      String columnPosition;
      for(int i = 0; i < availableSquare.length; i++)
      {
         for (int j = 0; j < availableSquare[i].length; j++)
         {
            if (heuristicChessboard[i][j] == lowest && availableSquare[i][j] == false)
            {
               rowPosition = String.format("%d", i);
               columnPosition = String.format("%d", j);
               row.add(rowPosition);
               column.add(columnPosition);
            }
         }
      }

      int index = -1;
      if(row.size() > 0 )
         index = random.nextInt(row.size());

      return index;

   } // end searchAnAvailableLowPosition

   // method that put a queen in her position and after states a her position as true on the availableSquare and states her attack area
   public void putQueenInPosition()
   {
      int position = searchAnAvailableLowPosition();

      if(position > -1) {
         int row1 = Integer.parseInt(row.get(position));
         int column1 = Integer.parseInt(column.get(position));

         availableSquare[row1][column1] = true;

         // stablishs range of attack

         int row2 = row1;
         int column2 = column1;
         // upwards
         while (row2 >= 0) {
            availableSquare[row2--][column2] = true;
         }


         row2 = row1;
         column2 = column1;

         // downwards
         while (row2 < 8) {
            availableSquare[row2++][column2] = true;

         }
         row2 = row1;
         column2 = column1;

         // leftwards
         while (column2 >= 0) {
            availableSquare[row2][column2--] = true;

         }

         row2 = row1;
         column2 = column1;

         // rightwards
         while (column2 < 8) {
            availableSquare[row2][column2++] = true;

         }


         row2 = row1;
         column2 = column1;
         // towards the northeast
         while (row2 >= 0 && column2 < 8) {
            availableSquare[row2--][column2++] = true;
         }

         row2 = row1;
         column2 = column1;

         // towards the northwest
         while (row2 >= 0 && column2 >= 0) {
            availableSquare[row2--][column2--] = true;

         }

         row2 = row1;
         column2 = column1;

         // towards the southwest
         while (row2 < 8 && column2 >= 0) {
            availableSquare[row2++][column2--] = true;
         }

         row2 = row1;
         column2 = column1;

         // towards the southeast
         while (row2 < 8 && column2 < 8) {
            availableSquare[row2++][column2++] = true;
         }

         chessboardsPosition[row1][column1] = queens[counter++];
      }

   }


   // display the chessboard
   public void displayChessboard()
   {
      System.out.println(" ————————————————————————————————————————");

      for(int i = 0; i < chessboardsPosition.length; i++)
      {

         for(int j = 0; j < chessboardsPosition[i].length; j++)
         {
            System.out.printf("| %s ", chessboardsPosition[i][j]);
         }

         System.out.println("|");
         System.out.println(" ————————————————————————————————————————");

      }
   }

   // play the puzzler
   public void playPuzzler() {
      do {
         counter = 0;
         initChessboardsPossition();
         do {
            row.clear();
            column.clear();
            putQueenInPosition();
         } while (row.size() > 0);
      } while(counter != 8);
      displayChessboard();
   }
}
// TurtleGraphics.java
// @uthor : Manuel Medina
// Date : dic 13th 2017 11:42am

public class TurtleGraphics
{
   private static final String[][] sketchpad = new String[20][20];
   private static boolean pen = false;
   private static int positionX = 0;
   private static int positionY = 0;
   private static int direction = 1;
   private static boolean real = false;

   public static void main(String[] args)
   {
      for(int row = 0; row < sketchpad.length; row++)
      {
         for(int column = 0; column < sketchpad[row].length; column++)
         {
            sketchpad[row][column] = " ";
         }
      }

      int[] order = {2, 5, 12, 3, 3, 5, 12, 3, 3, 5, 12, 3, 3, 5, 12, 3, 3, 3, 5, 19, 3, 3, 3, 1, 5, 19, 2, 3, 3, 3, 5, 19, 3, 3, 3, 5, 9, 3, 3, 5, 19, 4, 4, 4, 5, 10, 4, 5, 9, 1, 6, 9};


      for(int x = 0; x < order.length; x++)
      {

         switch (order[x])
         {
            case 1:
               System.out.println("subo el lapiz");
                  penUp();
               break;
            case 2:
               System.out.println("bajo el lapiz");
                  penDown();
            break;
            case 3:
                  turnRight();
                  System.out.println("giro a la derecha "+ direction);
               break;
            case 4:
                  turnLeft();
               System.out.println("giro a la izquierda " + direction);
               break;
            case 5:
               System.out.println("me muevo x pasos");
                  moveForward(order[x + 1]);
                  x++;
               break;
            case 6:
               System.out.println("mustro el cuadro");
                  displayChart();
               break;
            case 9:
               System.out.println("termino");
                  x = order.length;
               break;
         }


      }


   }

   public static void displayChart()
   {
      System.out.println();
      System.out.println();
      System.out.println("Legend  up : ↑; down : ↓; left : ←; right : →; NE : ↑→; NW : ←↑; SW : ←↓; SE : ↓→;");
      System.out.println();
      System.out.println();
      for(int row = 0; row < sketchpad.length; row++)
      {
         for(int column = 0; column < sketchpad[row].length; column++)
         {
            System.out.printf("%s   ", sketchpad[row][column]);

         }
         System.out.println();
         System.out.println();
      }
   }

   public static void penUp()
   {
      pen = false;
   }

   public static void penDown()
   {
      pen = true;
   }

   public static void moveForward(int steps)
   {
      int possibleStep = 0;
      int temPositionY = positionY;
      int temPositionX = positionX;

      if(pen == true)
      {
         switch(direction)
         {
            case 1:

                  possibleStep = 20 - positionY;

                  if(steps <= possibleStep)
                  {
                     for(int row = 0; row < steps; row++)
                     {
                        sketchpad[positionY++][positionX] = "|";
                     }
                  }
                  else
                  {
                     System.out.println("The steps requested are not valid.");
                  }

                  sketchpad[positionY][positionX] = "↓";

                  possibleStep = 0;

               break;
            case 2:

                  for(int row = positionY; row < sketchpad.length; row++ ) {
                     for (int column = positionX; column < sketchpad[row].length; column++)
                     {
                        if((row == 19) || (column == 19))
                        {
                           row = 19;
                           column = 19;
                        }
                        else
                        {
                           possibleStep++;
                           row++;
                        }
                     }
                  }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                     sketchpad[positionY++][positionX++] = "\\";
                  }
               }
               sketchpad[positionY][positionX] = "↓→";

               possibleStep = 0;

               break;
            case 3:

               possibleStep = 20 - positionX;

               if(steps <= possibleStep)
               {
                  for(int column = 0; column < steps; column++)
                  {
                     sketchpad[positionY][positionX++] = "-";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "→";

               possibleStep = 0;
               break;
            case 4:

               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0) || (column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                     sketchpad[positionY--][positionX++] = "/";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }
               sketchpad[positionY][positionX] = "↑→";

               possibleStep = 0;
               break;
            case 5:

               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0))
                     {
                        row = 0;
                        column = 0;
                        possibleStep++;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     sketchpad[positionY--][positionX] = "|";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid. "+ possibleStep);
               }

               sketchpad[positionY][positionX] = "↑";

               possibleStep = 0;
               break;
            case 6:
               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0) || (column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     sketchpad[positionY--][positionX--] = "\\";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "←↑";

               possibleStep = 0;
               break;
            case 7:
               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     sketchpad[positionY][positionX--] = "-";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "←";

               possibleStep = 0;
               break;
            case 8:

               for(int row = positionY; row < sketchpad.length; row++ ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 19) || (column == 0))
                     {
                        row = 19;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                     sketchpad[positionY++][positionX--] = "/";
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }
               sketchpad[positionY][positionX] = "←↓";

               possibleStep = 0;
               break;

         }

      }
      else
      {
         switch(direction)
         {
            case 1:

               possibleStep = 20 - positionY;

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                    positionY++;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "↓";

               possibleStep = 0;

               break;
            case 2:

               for(int row = positionY; row < sketchpad.length; row++ ) {
                  for (int column = positionX; column < sketchpad[row].length; column++)
                  {
                     if((row == 19) || (column == 19))
                     {
                        row = 19;
                        column = 19;
                     }
                     else
                     {
                        possibleStep++;
                        row++;
                     }
                  }
               }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                     positionY++;
                     positionX++;
                  }
               }
               sketchpad[positionY][positionX] = "↓→";

               possibleStep = 0;

               break;
            case 3:

               possibleStep = 20 - positionX;

               if(steps <= possibleStep)
               {
                  for(int column = 0; column < steps; column++)
                  {
                     positionX++;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "→";

               possibleStep = 0;
               break;
            case 4:

               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0) || (column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                    positionY--;
                    positionX++;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }
               sketchpad[positionY][positionX] = "↑→";

               possibleStep = 0;
               break;
            case 5:

               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0))
                     {
                        row = 0;
                        column = 0;
                        possibleStep++;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     positionY--;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid. "+ possibleStep);
               }

               sketchpad[positionY][positionX] = "↑";

               possibleStep = 0;
               break;
            case 6:
               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 0) || (column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     positionY--;
                     positionX--;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "←↑";

               possibleStep = 0;
               break;
            case 7:
               for(int row = positionY; row >= 0; row-- ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((column == 0))
                     {
                        row = 0;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }

               if(steps <= possibleStep)
               {
                  for(int row = 0; row < steps; row++)
                  {
                     positionX--;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }

               sketchpad[positionY][positionX] = "←";

               possibleStep = 0;
               break;
            case 8:

               for(int row = positionY; row < sketchpad.length; row++ ) {
                  for (int column = positionX; column >= 0; column--)
                  {
                     if((row == 19) || (column == 0))
                     {
                        row = 19;
                        column = 0;
                     }
                     else
                     {
                        possibleStep++;
                        row--;
                     }
                  }
               }
               if(steps <= possibleStep) {
                  for (int counter = 1; counter <= steps; counter++) {
                     positionY++;
                     positionX--;
                  }
               }
               else
               {
                  System.out.println("The steps requested are not valid.");
               }
               sketchpad[positionY][positionX] = "←↓";

               possibleStep = 0;
               break;

         }
      }

   }

   public static void endOfDate()
   {
      real = false;
   }



   public static void turnRight()
   {
      if(direction == 8)
      {
         direction = 1;
      }
      else if(direction <= 8)
      {
         direction++;
      }
   }



   public static void turnLeft()
   {
      if(direction == 0)
      {
         direction = 8;
      }
      if(direction >= 0)
      {
         direction--;
      }
   }


}
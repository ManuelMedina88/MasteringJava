// SimulationTheTortoiseAndTheHare.java
// @uthor : Manuel Medina.
// Date : dic 23 2017 08:56 a.m.
// The simulation of the tortoise and the hare.
import java.security.SecureRandom;
import java.util.Scanner;


public class SimulationTheTortoiseAndTheHare
{
   private static int tortoisePosition = 0;
   private static int harePosition = 0;
   private static String[] positions = new String[70];


   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);

      SecureRandom random = new SecureRandom();
      int tortoisesPlod = 0;
      int haresHob = 0;
      final int RANGO = 10;

      for(int i = 0; i < positions.length; i++)
      {
         if(i % 2 == 0)
         {
            positions[i] = "—";
         }
         else
         {
            positions[i] = "—";
         }
      }


      System.out.println("BANG !!!!!");
      System.out.println("AND THEY'RE OFF !!!!!");
      do
      {

         for(int i = 0; i < positions.length; i++)
         {
            if(i % 2 == 0)
            {
               positions[i] = "_";
            }
            else
            {
               positions[i] = "/";
            }
         }


         tortoisesPlod = 1 + random.nextInt(RANGO);
         haresHob = 1 + random.nextInt(RANGO);

         switch(tortoisesPlod )
         {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

               tortoisePosition += 3;
               tortoiseStep();
               System.out.println("Fast plod " + tortoisePosition);
               break;
            case 6:
            case 7:
               tortoisePosition -= 6;
               tortoiseStep();
               System.out.println("Slip " + tortoisePosition);
               break;
            default:

               tortoisePosition += 1;
               tortoiseStep();
               System.out.println("Slow plod " + tortoisePosition);
               break;
         }

         switch(haresHob)
         {
            case 1:
            case 2:

               hareStep();
               System.out.println("Sleep " + harePosition);
               break;
            case 3:
            case 4:

               harePosition += 9;
               hareStep();
               System.out.println("Big hop " + harePosition);
               break;
            case 5:
               harePosition -= 12;
               hareStep();
               System.out.println("Big slip " + harePosition);
               break;
            case 6:
            case 7:
            case 8:
               harePosition += 1;
               hareStep();
               System.out.println("Small hop " + harePosition);
               break;
            default:
               harePosition -= 2;
               hareStep();
               System.out.println("Small slip " + harePosition);
               break;
         }


         /*System.out.println();
         for(int i = 0; i < positions.length; i++)
         {
            System.out.print(positions[i]);
         }
         System.out.println();*/




      }while(harePosition < 69 && tortoisePosition < 69);

      System.out.println();

      for(int i = 69; i >= 0; i--)
      {
         for(int j = 0; j <= i; j++)
         {
            if(j < i)
            {
               System.out.print(" ");
            }
            else
            {
               System.out.print(positions[i]);
            }
         }

         System.out.println();
      }

      System.out.println();

      /*System.out.println();
      for(int i = 0; i < positions.length; i++)
      {
         System.out.print(positions[i]);
      }
      System.out.println();*/



      if(tortoisePosition < harePosition)
      {
         System.out.println("Hare wins. yuch.");
      }
      else if(tortoisePosition > harePosition)
         System.out.println("TORTOISE WINS!!! YAY!!!.");
      else
      {
         System.out.println("It's a tie.");
      }



   }

   public static void tortoiseStep()
   {
      if(tortoisePosition >= 69)
      {
         //System.out.println(1);
         if(tortoisePosition == harePosition){
            positions[69] = "TH";
            tortoisePosition = 69;
         }else
         {
            //System.out.println(2);
            positions[69] = "T I WON !!!!!";
            positions[harePosition] = "'H' NOOOOOOOOOOO!!!!!";
            tortoisePosition = 69;
         }
      }
      else
      {
         //System.out.println(3);
         if(tortoisePosition != harePosition)
         {
            //System.out.println(4);
            if(tortoisePosition < 0)
            {
               //System.out.println(5);
               tortoisePosition = 0;

               if(tortoisePosition == harePosition)
               {
                  //System.out.println(6);
                  positions[tortoisePosition] = "TH  OUCH!!!";
               }
               else {
                 // System.out.println(7);
                  positions[tortoisePosition] = "T";
               }
            }
            else
            {
               //System.out.println(8);
               positions[tortoisePosition] = "T";
            }

         }
         else
         {
            //System.out.println(9);
            positions[tortoisePosition] = "TH  OUCH!!!";
         }
      }
   }


   public static void hareStep()
   {
      if(harePosition >= 69)
      {
         if(tortoisePosition == harePosition)
         {
            positions[69] = "TH";
            harePosition = 69;
         }else
         {
            positions[69] = "H I knew you would lose";
            positions[tortoisePosition] = "'T' noooo!!!";
            harePosition = 69;
         }
      }
      else
      {
         if(tortoisePosition != harePosition)
         {
            if(harePosition < 0)
            {
               harePosition = 0;

               if(tortoisePosition == harePosition)
               {
                  positions[harePosition] = "TH  OUCH!!!";
               }
               else {
                  positions[harePosition] = "H";
               }
            }
            else
            {
               positions[harePosition] = "H";
            }

         }
         else
         {
            positions[harePosition] = "TH  OUCH!!!";
         }
      }
   }

}
// CoinTossing.java
// @uthor : Manuel Medina.
// Date : dic 05th 2017 14:39
// program that simulates a coin tossing
import java.util.Scanner;
import java.security.SecureRandom;
public class CoinTossing
{
   private enum Side {HEADS, TAILS};
   private  static SecureRandom faces = new SecureRandom();
   private static Scanner scan = new Scanner(System.in);
   private static Side side;
   public static void main(String[] args)
   {

      boolean real = true;
      int number = 0;
      int heads = 0;
      int tails = 0;

      do{
         System.out.println("\t\tMenu\n");
         System.out.print("press 1 to TOSS COIN.\n");
         System.out.print("press 2 to exit.\n\n");
         number = scan.nextInt();

         if(number == 1)
         {
            flip();

            if( side == Side.TAILS)
            {
               tails++;
               //side = Side.TAILS;
               System.out.println("It was Tails\n\n");
            }
            if(side == Side.HEADS)
            {
               heads++;
               //side = Side.HEADS;
               System.out.println("It was Heads\n\n");
            }

         }
         else
         {
            System.out.printf("The number of Heads that were thrown was : %d%nThe number of Tails that were thrown was : %d%n%n", heads, tails);
            real = false;
         }
      }while(real);

   }

   public static void flip()
   {
      boolean face = faces.nextBoolean();

      if(face)
            side = Side.HEADS;
      else
        side = Side.TAILS;

   }
}
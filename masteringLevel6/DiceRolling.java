// DiceRolling.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 08:49am.
// app that calculate how many time a sum of time give a determine result.
import java.security.SecureRandom;

public class DiceRolling
{
   public static void main(String[] args)
   {
      SecureRandom randomNumbers = new SecureRandom();

      int[] sumRollingDice = new int[13];


      for(int counter = 1; counter <= 36000000; counter++)
      {
         sumRollingDice[(randomNumbers.nextInt(6) + 1) + (randomNumbers.nextInt(6) + 1)]++;
      }

      System.out.println("total of sum of the dices \n\n");
      for(int counter = 2; counter < sumRollingDice.length; counter++)
         System.out.printf("When the sum of dice sumed %d the amount was : %d%n", counter, sumRollingDice[counter]);
   }
}
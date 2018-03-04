// PerfectNumbers.java
// @uthor : Manuel Medina.
// Date : Dic 04st 2017.
// app that determine whether a number is perfect or not.
import java.util.Scanner;

public class PerfectNumbers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean truth = false;

      for(int value = 1; value < 8129; value++)
      {
         truth = isPerfect(value);

         if(truth)
         {
            System.out.println();
            for(int i = 1; i < value; i++ )
            {
               if(value % i == 0)
               {
                  System.out.printf("%d + ", i);
               }
            }

            System.out.printf("is equal to : %d%n", value);
         }
      }
   }


   public static boolean isPerfect(int value)
   {
      int comparative = 0;

      for(int i = 1; i < value; i++ )
      {
         if(value % i == 0)
            comparative += i;
      }

      if(comparative == value)
         return true;
      else
         return false;
   }

}
// SieveOfEratosthenes.java
// @uthor : Manuel Medina.
// Date : dic 23 2013 06:26am
// app that search and shows the prime numbers through an Array.

public class SieveOfEratosthenes
{
   public static void main(String[] args)
   {
      boolean[] prime = new boolean[1000];

      for(int i = 0 ; i < prime.length; i++)
      {
         prime[i] = true;
      }

      prime[0] = false;
      prime[1] = false;



      for(int i = 2; i < prime.length; i++)
      {
         if( prime[i] != false)
         {
            for (int j = i + 1; j < prime.length; j++) {
               if (j % i == 0)
                  prime[j] = false;
            }
         }
      }
      int counter = 0;
      for (int i = 2; i < prime.length; i++)
      {
         if(prime[i] != false) {
            System.out.printf("%d\t", i);
            counter++;
            if(counter % 10 == 0)
            {
               System.out.println();
               counter = 0;
            }
         }
      }

      System.out.println();
   }
} // end class SieveOfEratosthenes.
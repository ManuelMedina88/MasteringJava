// PrimeNumbers.java
// @uthor : Manuel Medina.
// Date : nov 4th 2017 8:50am
// app that determine is a program is prime or not.

public class PrimeNumbers
{
   public static void main(String[] args)
   {
      int counter = 0;

      for(int i = 1; i <= 10000; i++) {
         if (isPrime(i)) {
            System.out.printf("%d\t", i);
            counter++;

            if (counter % 10 == 0)
               System.out.println();
         }
      }

      System.out.printf("%n%nThere are %d prime integers numbers between 1 and 10,000.%n%n", counter);

      System.out.println("\n");
   }

   public static boolean isPrime(int number)
   {
      int counter = 0;

      for(int i = 2; i <= number; i++)
      {
         if(number%i == 0)
            counter++;

         if(counter > 1)
            break;

      }

      if(counter == 1) {
         return true;
      }
      else{
         return false;
      }

   }
}
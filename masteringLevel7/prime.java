public class prime
{
   private static prime = 2;

   public static void main(String[] args)
   {
     System.out.printf("%d ", nextPrime());
   }

   public static void nextPrime() {
      for (int j = prime; j < 100)
      {
         int counter = 0;
         for (int i = 1; i <= 100; i++) {
            if (prime % i == 0) {
               counter++;
            }

            if (counter > 2) {
               break;
            }
         }

         if(counter <= 2)
         {
            prime =
         }
      }
   }
}
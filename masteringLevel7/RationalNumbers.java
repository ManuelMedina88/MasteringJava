// RationalNumbers.java
// @uthor : Manuel Medina.
// Date : Jan 3rd 2018 05:48 a.m.

public class RationalNumbers
{
   private static int numeratorA;
   private static int denominatorB;
   private static int numeratorC;
   private static int denominatorD;

   public RationalNumbers(int a , int b, int c , int d) {

      for(int prime = 2; prime <= a && prime <= b;)
      {
         if( ( a % prime == 0 ) && ( b % prime == 0 ))
         {
            a /= prime;
            b /= prime;
         }
         else {
            int number = prime;

            int next1 = 0;
            //number;

            int counter = 0;

            for(int i = number; i > 1; i++)
            {
               for(int j = 2; j <= i; j++)
               {
                  if(i % j == 0) {
                     counter++;
                  }

                  if(counter == 2)
                     break;
               }

               if(counter == 1)
               {
                  if(i > number) {
                     next1 = i;
                     break;
                  }
               }

               counter = 0;
            }

            prime = next1;
         }
      }

      for(int prime = 2; prime <= c && prime <= d;)
      {
         if( ( c % prime == 0 ) && ( d % prime == 0 ))
         {
            c /= prime;
            d /= prime;
         }
         else {
            int number = prime;

            int next1 = 0;
            //number;

            int counter = 0;

            for(int i = number; i > 1; i++)
            {
               for(int j = 2; j <= i; j++)
               {
                  if(i % j == 0) {
                     counter++;
                  }

                  if(counter == 2)
                     break;
               }

               if(counter == 1)
               {
                  if(i > number) {
                     next1 = i;
                     break;
                  }
               }

               counter = 0;
            }

            prime = next1;
         }

      }

      numeratorA = a;
      denominatorB = b;
      numeratorC = c;
      denominatorD = d;

   }

   public static int getA()
   {
      return  numeratorA;
   }

   public static int getB()
   {
      return  denominatorB;
   }

   public static int getC()
   {
      return numeratorC;
   }

   public static int getD()
   {
      return denominatorD;
   }

   public static String add()
   {
      int a = (getA() * getD()) + (getB() * getC());
      int b = getB() * getD();

      for(int prime = 2; prime <= a && prime <= b;)
      {
         if( ( a % prime == 0 ) && ( b % prime == 0 ))
         {
            a /= prime;
            b /= prime;
         }
         else {
            prime = nextPrime(prime);
         }
      }

      return String.format("%d/%d", a, b);
   }

   public static String multiply()
   {
      int a = (getA() * getC());
      int b = (getB() * getD());

      for(int prime = 2; prime <= a && prime <= b;)
      {
         if( ( a % prime == 0 ) && ( b % prime == 0 ))
         {
            a /= prime;
            b /= prime;
         }
         else {
            prime = nextPrime(prime);
         }
      }

      return String.format("%d/%d", a, b);
   }

   public static String subtract()
   {
      int a = (getA() * getD()) - (getB() * getC());
      int b = getB() * getD();

      for(int prime = 2; prime <= a && prime <= b;)
      {
         if( ( a % prime == 0 ) && ( b % prime == 0 ))
         {
            a /= prime;
            b /= prime;
         }
         else {
            prime = nextPrime(prime);
         }
      }

      return String.format("%d/%d", a, b);
   }


   public static String divide()
   {
      int a = (getA() * getD());
      int b = (getB() * getC());

      for(int prime = 2; prime <= a && prime <= b;)
      {
         if( ( a % prime == 0 ) && ( b % prime == 0 ))
         {
            a /= prime;
            b /= prime;
         }
         else {
            prime = nextPrime(prime);
         }
      }

      return String.format("%d/%d", a, b);
   }

   public static int nextPrime(int number)
   {
      int next1 = 0;
      //number;

      int counter = 0;

      for(int i = number; i > 1; i++)
      {
         for(int j = 2; j <= i; j++)
         {
            if(i % j == 0) {
               counter++;
            }

            if(counter == 2)
               break;
         }

         if(counter == 1)
         {
            if(i > number) {
               next1 = i;
               break;
            }
         }

         counter = 0;
      }

      return next1;
   }
}
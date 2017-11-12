public class Fraction
{
   int a;
   int b;
   int c;
   int d;
   int resultNominator;
   int resultDenominator;

   public void denominator(int a, int b, int c, int d)
   {
      resultNominator = ((a * d) + (b * c));
      resultDenominator = b * d;
   }

   public int getResultNominator()
   {
      return resultNominator;
   }

   public int getResultDenominator()
   {
      return resultDenominator;
   }
}
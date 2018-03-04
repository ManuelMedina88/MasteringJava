import java.util.Scanner;

public class FactorialBTest
{
   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the factorial : ");
      int number = scan.nextInt();
      FactorialB factorial = new FactorialB();
      int[] calculus = new int[number];
      int counter = 1;
      int counter1 = 0;
      while(counter <= number)
      {
         calculus[counter1] = factorial.factorial(counter);
         counter1++;
         counter++;
      }

      Fraction fraction = new Fraction();
      int nominator = 0;
      int denominator = 0;

      counter1 = 0;
      while(counter1 < calculus.length)
      {
         System.out.println(calculus[counter1]);
         if(counter1 == 0) {

            fraction.resultNominator = 1;
            fraction.resultDenominator = calculus[counter1];
            nominator = fraction.getResultNominator();
            denominator = fraction.getResultDenominator();

         }

         if(counter1 > 0)
         {
            fraction.denominator(nominator, denominator, 1, calculus[counter1]);
            nominator = fraction.getResultNominator();
            denominator = fraction.getResultDenominator();
         }

         counter1++;
      }
      System.out.printf("the result is : e = %.5f - %.5f%n",Math.E , 1 + ((double)nominator/(double) denominator));
   }
}

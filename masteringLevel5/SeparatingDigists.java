// SeparatingDigists.java
// @uthor : Manuel Medina.
// Date : dic 3rd 2017 17:41
// Writing methods for a purpose
import java.util.Scanner;

public class SeparatingDigists
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      boolean real = true;

      do {

         System.out.print("Enter the number to evaluate among 1 and 99999 : ");
         int number = scan.nextInt();

         if(number >= 1 && number < 100000)
         {
            displayDigits(number);

            real = false;
         }else
         {
            System.out.println("You've entered an invalid number try again\n\n");
         }

      }while(real);
   }

   public static int integerPart(int a, int b)
   {
      int result = a / b;

      return result;
   }

   public static int integerRemainder(int a, int b)
   {
      int result = a % b;

      return result;
   }

   public static void displayDigits(int number)
   {
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;

      if(number >= 1 && number < 10)
      {
         System.out.printf("%d%n", number);
      }
      else if(number >= 10 && number < 100)
      {
         a = integerPart(number, 10);
         b = integerRemainder(number, 10);

         System.out.printf("%d  %d%n", a, b);
      }
      else if (number >= 100 && number < 1000)
      {
         c = integerRemainder(number, 10);

         b = integerRemainder(integerPart(number, 10), 10);

         a = integerPart(integerPart(number, 10), 10);

         System.out.printf("%d  %d  %d%n", a, b, c);
      }
      else if(number >= 1000 && number < 10000)
      {
         d = integerRemainder(number, 10);

         c  = integerRemainder(integerPart(number, 10), 10);

         b =  integerRemainder(integerPart(integerPart(number, 10), 10), 10);

         a = integerPart(integerPart(integerPart(number, 10),10), 10);

         System.out.printf("%d  %d  %d  %d%n", a, b, c, d);
      }
      else if (number >= 10000 && number < 100000)
      {
         e = integerRemainder(number, 10);

         d =  integerRemainder(integerPart(number, 10), 10);

         c = integerRemainder(integerPart(integerPart(number, 10), 10), 10);

         b = integerRemainder(integerPart(integerPart(integerPart(number, 10), 10),10),10);

         a = integerPart(integerPart(integerPart(integerPart(number, 10), 10),10),10);

         System.out.printf("%d  %d  %d  %d  %d%n", a, b, c, d, e);
      }

   }

}
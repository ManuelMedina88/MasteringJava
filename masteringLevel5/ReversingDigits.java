// ReversiongDigits.java
// @uthor : Manuel Medina.
// Date : dic 4th 2017 10:06am
// app that takes an integer value and returns the number with its digits reversed.
import java.util.Scanner;

public class ReversingDigits
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number to reverse : ");
      int number = scan.nextInt();

      System.out.printf("%nthe reverse of the number you've entered is %s%n%n", reversingDigits(number));
   }

   public static String reversingDigits(int number)
   {
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      int f = 0;
      int g = 0;
      String num = "";

      if(number >= 10 && number < 100)
      {
         a = number % 10;
         b = number / 10;
         num = String.format("%d%d", a,b);
      }
      else if (number >= 100 && number < 1000)
      {
         a = number % 10;
         b = (number / 10)%10;
         c = ((number / 10)/10);

         num = String.format("%d%d%d", a,b,c);

      }
      else if (number >= 1000 && number < 10000)
      {
         a = number % 10;
         b = (number / 10)%10;
         c = ((number / 10)/10)%10;
         d = ((number / 10)/10)/10;

         num = String.format("%d%d%d%d", a,b,c,d);
      }
      else if (number >= 10000 && number < 100000)
      {
         a = number % 10;
         b = (number / 10)%10;
         c = ((number / 10)/10)%10;
         d = (((number / 10)/10)/10)%10;
         e = (((number / 10)/10)/10)/10;

         num = String.format("%d%d%d%d%d", a,b,c,d,e);
      }
      else if (number >= 100000 && number < 1000000)
      {
         a = number % 10;
         b = (number / 10)%10;
         c = ((number / 10)/10)%10;
         d = (((number / 10)/10)/10)%10;
         e = ((((number / 10)/10)/10)/10)%10;
         f = ((((number / 10)/10)/10)/10)/10;

         num = String.format("%d%d%d%d%d%d", a,b,c,d,e,f);
      }
      else if (number >= 1000000 && number < 10000000)
      {
         a = number % 10;
         b = (number / 10)%10;
         c = ((number / 10)/10)%10;
         d = (((number / 10)/10)/10)%10;
         e = ((((number / 10)/10)/10)/10)%10;
         f = (((((number / 10)/10)/10)/10)/10)%10;
         g = (((((number / 10)/10)/10)/10)/10)/10;

         num = String.format("%d%d%d%d%d%d%d", a,b,c,d,e,f,g);
      }

      return num;
   }
}
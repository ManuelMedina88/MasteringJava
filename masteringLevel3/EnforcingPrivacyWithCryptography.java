// EnforcingPrivacyWithCryptography.java
// @uthor : Manuel Medina.
// Date : nov 12th 2017.
// app that encrypts a number of four-digits.
import java.util.Scanner;

public class EnforcingPrivacyWithCryptography
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the number of four-digits: ");
      String fourDigits1 = scan.nextLine();

      int fourDigits = Integer.parseInt(fourDigits1);

      String result = encripted(fourDigits);

      String result2 = desencripted(Integer.parseInt(result));


      System.out.println(result);
      System.out.println(result2);
      System.out.println();


   }

   public static String encripted(int digits)
   {

      int digit1 = 0;
      int digit2 = 0;
      int digit3 = 0;
      int digit4 = 0;

      if(digits < 10 )
      {
         digit1 = 0;
         digit2 = 0;
         digit3 = 0;
         digit4 = digits;
      }
      else if(digits < 100)
      {
         digit1 = 0;
         digit2 = 0;
         digit3 = digits/10;
         digit4 = digits%10;
      }
      else if (digits < 1000)
      {
         digit1 = 0;
         digit2 = (digits/10)/10;
         digit3 = (digits/10)%10;
         digit4 = digits%10;
      }
      else {
         digit1 = digits / 1000 % 100;
         digit2 = digits / 100 % 10;
         digit3 = digits / 10 % 10;
         digit4 = digits % 10;
      }


      digit1 = (digit1 + 7)%10;
      digit2 = (digit2 + 7)%10;
      digit3 = (digit3 + 7)%10;
      digit4 = (digit4 + 7)%10;

      int temp = digit1;
      digit1 = digit3;
      digit3 = temp;
      temp = digit2;
      digit2 = digit4;
      digit4 = temp;

      digits = (digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4;

      String digits1 = String.format("%d%d%d%d", digit1, digit2, digit3, digit4);

      return digits1;
   }

   public static String desencripted(int digits)
   {
      int digit1 = 0;
      int digit2 = 0;
      int digit3 = 0;
      int digit4 = 0;

      if(digits < 10 )
      {
         digit1 = 0;
         digit2 = 0;
         digit3 = 0;
         digit4 = digits;
      }
      else if(digits < 100)
      {
         digit1 = 0;
         digit2 = 0;
         digit3 = digits/10;
         digit4 = digits%10;
      }
      else if (digits < 1000)
      {
         digit1 = 0;
         digit2 = (digits/10)/10;
         digit3 = (digits/10)%10;
         digit4 = digits%10;
      }
      else {
         digit1 = digits / 1000 % 100;
         digit2 = digits / 100 % 10;
         digit3 = digits / 10 % 10;
         digit4 = digits % 10;
      }

      int temp = digit1;
      digit1 = digit3;
      digit3 = temp;
      temp = digit2;
      digit2 = digit4;
      digit4 = temp;

      if(digit1 > 6)
         digit1 = digit1 - 7;
      else
         digit1 = digit1 + 10 - 7;

      if(digit2 > 3)
         digit2 = digit2 - 7;
      else
         digit2 = digit2 + 10 - 7;

      if(digit3 > 3)
         digit3 = digit3 - 7;
      else
         digit3 = digit3 + 10 - 7;

      if(digit4 > 3)
         digit4 = digit4 - 7;
      else
         digit4 = digit4 + 10 - 7;

      String digits1 = String.format("%d%d%d%d", digit1, digit2, digit3, digit4);

      return digits1;
   }
}
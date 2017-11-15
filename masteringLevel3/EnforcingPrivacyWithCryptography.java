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

      String fourDigits1;
      int fourDigits;

      System.out.print("Enter the number of four-digits: ");
      fourDigits1 = scan.nextLine();

      fourDigits = Integer.parseInt(fourDigits1);

      String result = encripted(fourDigits);

      System.out.println(result);


   }

   public static String encripted(int digits)
   {
      int digit1 = 0;
      int digit2 = 0;
      int digit3 = 0;
      int digit4 = 0;

      digit1 = digits/1000%100;
      digit2 = digits/100%10;
      digit3 = digits/10%10;
      digit4 = digits%10;

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

      String digits1 = String.format("%d%d%d%d%n", digit1, digit2, digit3, digit4);


      return digits1;
   }
}
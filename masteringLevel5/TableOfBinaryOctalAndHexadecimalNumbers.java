// TableOfBinaryOctalAndHexadecimalNumbers.java
// @uthor : Manuel Medina.
// Date : dic 6th 2017 6:17am
// app that displays a table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1 through 256.

public class TableOfBinaryOctalAndHexadecimalNumbers
{
   public static void main(String[] args)
   {
      System.out.println("Table of Binary, Octal and Hexadecimal Numbers.\n\n");
      System.out.println("Dec\tBinary\t\tOct\tHex");

      for(int i = 1; i <= 256; i++)
      {
         System.out.printf("%d\t%s\t%s\t%s%n", i, toBinary(i), toOctal(i), toHexadecimal(i));
      }

   }

   public static String toBinary(int number)
   {
      String resultado = "";
      if(number == 1)
      {
         resultado = "1";
      }
      while(number >= 2)
      {
         resultado += "" + (number % 2);
         if(number == 2 || number == 3 || number == 1)
            resultado += "" + (number / 2);

         number /= 2;
      }

      String resultado2 = "";
      for(int i = (resultado.length() - 1); i >= 0 ; i--)
      {
         resultado2 += "" + resultado.charAt(i);
      }

      if(resultado2.length() < 8)
      {
         String extraZeros = "";

         for(int i = 1; i <= (8 - resultado2.length()); i++)
         {
            extraZeros += ""+"0";
         }

         resultado2 = extraZeros + resultado2;
      }

      return resultado2;

   }

   public static String toOctal(int number)
   {
      String resultado = "";

      while(number >= 1)
      {
         resultado += "" + (number % 8);
         number /= 8;
      }

      String resultado2 = "";

      for(int i = (resultado.length() - 1); i >= 0 ; i--)
      {
         resultado2 += "" + resultado.charAt(i);
      }

      if(resultado2.length() < 3)
      {
         String extraZeros = "";

         for(int i = 1; i <= (3 - resultado2.length()); i++)
         {
            extraZeros += ""+"0";
         }

         resultado2 = extraZeros + resultado2;
      }

      return resultado2;
   }

   public static String toHexadecimal(int number)
   {

      String resultado = "";

      while(number >= 1)
      {
         int remaining = (number % 16);

         if(remaining == 10)
            resultado += "A";
         else if (remaining == 11)
            resultado += "B";
         else if (remaining == 12)
            resultado += "C";
         else if (remaining == 13)
            resultado += "D";
         else if (remaining == 14)
            resultado += "E";
         else if (remaining == 15)
            resultado += "F";
         else
            resultado += "" + number % 16;

         number /= 16;
      }

      String resultado2 = "";

      for(int i = (resultado.length() - 1); i >= 0 ; i--)
      {
         resultado2 += "" + resultado.charAt(i);
      }

      return resultado2;
   }
}
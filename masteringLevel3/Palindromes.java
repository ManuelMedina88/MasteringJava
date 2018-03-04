// Palindromes.java
// @uthor : Manuel Medina.
// Date : nov 9th 2017.
// app that read in a five-digit integer and determines whether it's a palindrome.
import java.util.Scanner;

public class Palindromes
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int posiblePalindromes;
      int number1;
      int number2;
      int number3;
      int number4;
      int number5;

      boolean cont = true;

      while(cont) {
         System.out.print("Enter the number to evaluate : ");
         posiblePalindromes = input.nextInt();
         if(posiblePalindromes > 9999) {
            if(posiblePalindromes <= 99999) {

               number5 = posiblePalindromes % 10;
               number4 = posiblePalindromes % 100 / 10;
               number3 = posiblePalindromes % 1000 / 100;
               number2 = posiblePalindromes % 10000 / 1000;
               number1 = posiblePalindromes / 10000;

               if(number1 == number5) {
                  if (number2 == number4) {
                     System.out.println("The number you've introduced is a palindromes");
                  }
               }
               else{
                  System.out.println("The number you've introduced is not a palindromes");
               }

               cont = false;

            }else{
               System.out.println("The number entered must be five digit long\n\n");
            }
         }else{
            System.out.println("The number entered must be five digit long\n\n");
         }

      }
   }
}
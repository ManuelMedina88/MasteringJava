// PrintingTheDecimalEquivalentOfABinaryNumber.java
// @uthor : Manuel Medina.
// Date : Nov 10th 2017.
// app that inputs an integer containing only 0s and 1s and prints its decimal equivalent.
import java.util.Scanner;

public class PrintingTheDecimalEquivalentOfABinaryNumber
{
   // method main begins all java apps
   public static void main(String[] args)
   {
      // create a scanner object
      Scanner scan = new Scanner(System.in);

      // read the number from user as String.
      System.out.print("Enter a binary number : ");
      String stringNumber = scan.nextLine();

      // verify the number of digits that the user've introduced.
      int digits = stringNumber.length();

      // convert the String in int
      int realNumber = Integer.parseInt(stringNumber);


      // determines how many digits have realNumber,for comparing is there are 0s to the left;
      int result2 = 1;
      int digits2 = 0;

      boolean cont1 = true;
      while(cont1)
      {
         result2 *= 10;
         if(realNumber > result2)
            digits2 += 1;
         else{
            cont1 = false;
            digits2 += 1;
         }
      }




      // save and store the number in a array wheter the digits are equal to digits2
      int[] numbers = new int[digits];

      if(digits2 == digits)
      {
         int cont = 1;
         int potencia1 = 10;
         int potencia2 = 10;
         while(cont <= digits)
         {
            if(cont == 1)
            {
               numbers[digits - cont] = realNumber %  potencia1;
               potencia1 *= 10;
            }

            if(cont > 1)
               if(cont < digits)
               {
                  numbers[digits - cont] = realNumber % potencia1 / potencia2;
                  potencia1 *= 10;
                  potencia2 *= 10;
               }

            if(cont == digits)
               numbers[0] = realNumber / (potencia1/10);


            cont++;
         }

      }






// save and store the number in a array wheter the digits are different to digits2
      int control = digits - digits2;
      if(digits2 != digits)
      {
         int cont3 = 0;
         int cont4 = digits - 1;
         int potencia3 = 10;
         int potencia4 = 10;
         int hollowPosition = 1;
         while(cont3 < digits)
         {
            if(cont3 < control)
            {
               numbers[cont4] = 0;
            }

            if(cont3 >= control)
            {
               if(cont3 == control)
               {
                  numbers[digits - hollowPosition] = realNumber %  potencia3;
                  potencia3 *= 10;
               }

               if(cont3 > control)
               {
                  if(cont3 < digits)
                  {
                     numbers[digits - hollowPosition] = realNumber % potencia3 / potencia4;
                     potencia3 *= 10;
                     potencia4 *= 10;
                  }
               }

               if(cont3 == digits)
                  numbers[digits - hollowPosition] = realNumber / (potencia3/10);

               hollowPosition++;

            }

            cont4--;
            cont3++;
         }

      }


      // put the number introduced in reverse
      int[] numbers2 = new int[digits];

      int counter = 0;
      int counter2 = numbers.length - 1;
      while(counter < digits)
      {
         numbers2[counter] = numbers[counter2];
         counter++;
         counter2--;
      }



      // convert from binary to decimal.
      int[] suma = new int[digits];
      int cont2 = 0;
      int doble = 2;

      while(cont2 < digits)
      {
         if(cont2 == 0)
         {
            suma[cont2] = numbers2[cont2] * 1;

         }

         if(cont2 > 0)
            {
               suma[cont2] = numbers2[cont2] * doble;

               doble *= 2;
            }

         cont2++;
      }


      // show the result.
      cont2 = 0;
      int suma1 = 0;
      while(cont2 < digits)
      {
         suma1 += suma[cont2];
         cont2++;
      }

      System.out.printf("The decimal equivalent of %s is %d%n", stringNumber, suma1);
   }
}
// TemperatureConversions.java
// @uthor : Manuel Medina.
// Date dic 4st 2017 03:44am
// app that converts from celsius to fahrenheit temperature and viceversa.
import java.util.Scanner;

public class TemperatureConversions
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double actualTempeture;
      boolean real = true;

      do {

         System.out.println("to convert from fahrenheit to celsius press 1. \n" +
            "to convert from celsius to fahrenheit press 2.\n\n");
         int option = scan.nextInt();

         if (option == 1) {

            System.out.print("Enter the value in fahrenheit : ");
            actualTempeture = scan.nextDouble();

            System.out.printf("The temperature in celcius is %.1f\n\n", celcius(actualTempeture));

            real = false;

         } else if (option == 2) {
            System.out.print("Enter the value in celsius : ");
            actualTempeture = scan.nextDouble();

            System.out.printf("The temperature in fahrenheit is %.1\n\n", fahrenheit(actualTempeture));

            real = false;

         } else
            System.out.println("the value introduced is an invalid number, try again");

      }while(real);





   }

   public static double celcius(double fahrenheit)
   {
      double celcius = 5.0/9.0 * (fahrenheit - 32);

      return celcius;
   }

   public static double fahrenheit(double celcius)
   {
      double fahrenheit = 9.0/5.0 * celcius + 32;

      return fahrenheit;
   }
}
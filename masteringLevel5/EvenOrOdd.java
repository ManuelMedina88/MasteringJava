// EvenOrOdd.java
// @uthor : Manuel Medina.
// Date : dic 3rd 2017 12:20
// app that determines is a number is even or odd.
import java.util.Scanner;

public class EvenOrOdd {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int number = 0;
      boolean real = true;
      do{
         System.out.print("Enter the number to evaluate or enter -1 to exit : ");
         number = scan.nextInt();

         if(evenOrOdd(number))
         {
            System.out.println("The number entered is an even number.");
         }else{
            System.out.println("The number entered is an odd number.");
         }

         if(number == -1)
            real = false;

         System.out.println("\n");

      }while(real);
   }

   public static boolean evenOrOdd(int number)
   {
      if(number % 2 == 0)
         return true;
      else
         return false;
   }
}
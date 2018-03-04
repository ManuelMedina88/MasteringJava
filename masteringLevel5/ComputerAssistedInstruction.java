// ComputerAssistedInstruction.java
// @uthor : Manuel Medina.
// Date : dic 6th 2017 10:15am
// App that helps an elementary school student learn multiplication.
import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;
      int answer = 0;
      int ask = 0;

      do{
         ask = multiplication();
         answer = scan.nextInt();

         if(answer == ask)
         {
            System.out.println("Very good!\n\n");
         }
         else if(answer == -1)
         {
            real = false;
            System.out.println("You've entered the value -1 and the program will end automatically.");
         }
         else
         {
            boolean cont = true;

            do {
               System.out.println("No. Please try again.");
               System.out.print("What is the answer : ");
               answer = scan.nextInt();

               if(answer == ask) {
                  System.out.println("Very good!\n\n");
                  cont = false;
               }
               if(answer == -1)
               {
                  System.out.println("You've entered the value -1 and the program will end automatically.");
                  cont = false;
                  real = false;
               }

            }while(cont);
         }
      }while (real);
   }

   public static int multiplication()
   {
      SecureRandom random = new SecureRandom();
      int a = 1 + random.nextInt(9);
      int b = 1 + random.nextInt(9);

      System.out.printf("How much is %d times %d? or enter -1 to exit : ", a, b);

      return a * b;
   }
}
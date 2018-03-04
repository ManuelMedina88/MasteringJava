// ComputerAssistedInstructionReduccingStudentFatigue.java
// @uthor : Manuel Medina.
// Date : dic 6th 2017 10:54am
// App that modify ComputerAssistedInstruction.java to reducing the fatigue in computer assisted instruction environment.
import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstructionReduccingStudentFatigue
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
            message(1);
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
               message(0);
               System.out.print("What is the answer : ");
               answer = scan.nextInt();

               if(answer == ask) {
                  message(1);
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

   public static void message(int type)
   {
      SecureRandom random = new SecureRandom();
      int a = random.nextInt(4);

      if(type == 1)
      {
         switch(a){
            case 0:
               System.out.println("Keep up the good work!\n\n");
               break;
            case 1:
               System.out.println("Very good!\n\n");
               break;
            case 2:
               System.out.println("Excellent!\n\n");
               break;
            case 3:
               System.out.println("Nice work!\n\n");
               break;
         }
      }
      else
      {
         switch(a){
            case 0:
               System.out.println("No.Please try again.");
               break;
            case 1:
               System.out.println("Wrong. Try once more.");
               break;
            case 2:
               System.out.println("Don't give up!");
               break;
            case 3:
               System.out.println("No. Keep trying.");
               break;
         }
      }
   }
}
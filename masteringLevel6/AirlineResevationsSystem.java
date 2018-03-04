// AirlineReservationsSystem.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 15:37
// A small airline has just purchased a computer for its new automated reservations system.
import java.util.Scanner;

public class AirlineResevationsSystem
{
   public static void main(String[] args)
   {
      boolean[] seats = new boolean[10];
      boolean real = true;
      int option = 0;
      Scanner scan = new Scanner(System.in);
      int first = 0;
      int economy = 0;


      do
      {

         System.out.println("\n\nPlease type 1 for First Class.\nPlease type 2 for Economy.\n\n");
         option = scan.nextInt();

         if(option == 1)
         {

               if(seats[first] == false && first <= 4)
               {
                  System.out.printf("\tBoarding Pass%nSeat number : %d\tSection : first class.%n%n", first + 1);
                  seats[first++] = true;




                  if((first + economy) == 10)
                  {
                     System.out.println("All the sections are full there are not more seats empty\nThe next flight leaves in three hours");
                     real = false;
                  }


               }
               else
               {

                  System.out.println("First class is currently full\nIs it acceptable to be placed in economy section\npress 1 for yes or 2 for no\n\n");
                  option = scan.nextInt();

                  if(option == 1)
                  {
                     if(seats[economy + 5] == false && (economy + 5) <= 9)
                     {

                        System.out.printf("\tBoarding Pass%nSeat number : %d\tSection : economy.%n%n", economy + 6);
                        seats[(5 + economy++)] = true;


                        if((first + economy) >= 10)
                        {
                           System.out.println("All the sections are full there are not more seats empty\nThe next flight leaves in three hours");
                           real = false;
                        }


                     }
                  }
                  else
                  {
                     option = 0;
                     System.out.println("Next flight leaves in three hours\n\n");
                  }
               }

         }
         else if(option == 2)
         {
            if(economy < 5)
            {
               if (seats[economy + 5] == false && (economy + 5) <= 9) {

                  System.out.printf("\tBoarding Pass%nSeat number : %d\tSection : economy.%n%n", economy + 6);
                  seats[(5 + economy++)] = true;


                  if ((first + economy) >= 10) {
                     System.out.println("All the sections are full there are not more seats empty\nThe next flight leaves in three hours");
                     real = false;
                  }


               }
            }
            else
            {

               System.out.println("economy section is currently full\nIs it acceptable to be placed in first class\npress 1 for yes or 2 for no\n\n");
               option = scan.nextInt();

               if(option == 1)
               {

                  if(seats[first] == false && first <= 4)
                  {
                     System.out.printf("\tBoarding Pass%nSeat number : %d\tSection : first class.%n%n", first + 1);
                     seats[first++] = true;




                     if((first + economy) == 10)
                     {
                        System.out.println("All the sections are full there are not more seats empty\nThe next flight leaves in three hours");
                        real = false;
                     }


                  }

               }
               else
               {
                  System.out.println("Next flight leaves in three hours\n\n");
               }
            }
         }
         else
         {
            System.out.println("The number you've entered is not an option.");
         }

      }while(real);
   }
}
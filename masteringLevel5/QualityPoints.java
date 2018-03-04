// QualityPoints.java
// @uthor : Manuel Medina.
// Date : dic 05 2017. 14:05
/*method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
that reads a value from the user and displays the result.*/
import java.util.Scanner;

public class QualityPoints {

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean real = true;
      int number = 0;

      do{
         System.out.print("Enter the student's average : ");
         number = scan.nextInt();

         if(number >= 0 && number <= 100)
            real = false;
         else
            System.out.println("You have to enter a number between 0 and 100. please try again.\n");

      }while(real);

      System.out.println("the student's score is : " + qualityPoint(number)+ "\n\n");
   }

   public static int qualityPoint( int average)
   {
      int calculus = average/10;


      switch(calculus)
      {
         case 10:
         case 9:
            average = 4;
            break;
         case 8:
            average = 3;
            break;
         case 7:
            average = 2;
            break;
         case 6:
            average = 1;
            break;
         default:
            average = 0;
            break;
      }

      return average;
   }
}
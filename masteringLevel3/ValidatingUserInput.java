// ValidatingUserInput.java
// @uthor : Manuel Medina.
// Date : nov 8th 2017.
// program that
import java.util.Scanner; // class uses class Scanner

public class ValidatingUserInput
{
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initializing variables in declarations
      int passes =  0;
      int failures = 0;
      int studentCounter = 1;

      // process 10 students using counter-controlled loop
      while (studentCounter <= 10)
      {
         // prompt user for input and obtain value from user
         System.out.print("Enter result (1 = pass, 2 = fail): ");
         int result = input.nextInt();

         // if...else is nested in the while statement
         if (result == 1)
            passes = passes + 1;
         else if (result == 2)
         {
            failures = failures + 1;
         }
         else
         {
            System.out.println("the number you've entered is not acceptable\n");
               studentCounter = studentCounter - 1;

         }


         // increment studentCounter so loop eventually terminates
         studentCounter = studentCounter + 1;
      }

      // termination phase; prepare and display results
      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

      // determine whether more than 8 students passed
      if (passes > 8)
         System.out.println("Bonus to instructor!");
   }
} // end class Analysis
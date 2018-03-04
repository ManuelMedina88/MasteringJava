// NegativePositiveAndZeroValues.java
// @uthor : Manuel Medina.
// Date : Oct 30th 2017.
// apps that inputs five numbers and determines and prints the numbers of negative numbers input,
// the numbers positives numbers imput and the number of zeros input.
import java.util.Scanner; // the program uses a Scanner object.

public class NegativePositiveAndZeroValues
{
   // method main begins and execute all java apps.
   public static void main(String[] args) {
      //create a scanner object
      Scanner input = new Scanner(System.in);

      // create the variables needed
      int positives = 0;
      int negatives = 0;
      int zeros = 0;
      int numbers;

      //Prompt and ask user the numbers
      System.out.print("Enter the first number: ");
      numbers = input.nextInt();

      // calculates whether the number is -, + or 0
      if(numbers > 0)
         positives = positives + 1;
      if (numbers < 0)
         negatives = negatives + 1;
      if (numbers == 0)
         zeros = zeros + 1;

      //Prompt and ask user the numbers
      System.out.print("Enter the second number: ");
      numbers = input.nextInt();

      // calculates whether the number is -, + or 0
      if(numbers > 0)
         positives = positives + 1;
      if (numbers < 0)
         negatives = negatives + 1;
      if (numbers == 0)
         zeros = zeros + 1;

      //Prompt and ask user the numbers
      System.out.print("Enter the third number: ");
      numbers = input.nextInt();

      // calculates whether the number is -, + or 0
      if(numbers > 0)
         positives = positives + 1;
      if (numbers < 0)
         negatives = negatives + 1;
      if (numbers == 0)
         zeros = zeros + 1;

      //Prompt and ask user the numbers
      System.out.print("Enter the fourth number: ");
      numbers = input.nextInt();

      // calculates whether the number is -, + or 0
      if(numbers > 0)
         positives = positives + 1;
      if (numbers < 0)
         negatives = negatives + 1;
      if (numbers == 0)
         zeros = zeros + 1;

      //Prompt and ask user the numbers
      System.out.print("Enter the fifth number: ");
      numbers = input.nextInt();

      // calculates whether the number is -, + or 0
      if(numbers > 0)
         positives = positives + 1;
      if (numbers < 0)
         negatives = negatives + 1;
      if (numbers == 0)
         zeros = zeros + 1;

      System.out.printf("%s%d%n%s%d%n%s%d%n", "Positives = ", positives,
         "Negatives = ", negatives, "Zeros = ", zeros);

   } // end method main
} // end class NegativePositiveAndZeroValues

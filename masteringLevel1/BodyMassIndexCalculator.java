// BodyMassIndexCalculator.java
// @uthor : Manuel Medina.
// Date : Oct 30th 2017.
// apps that calculates the body mass index.
import java.util.Scanner; // this program uses a Scanner object

public class BodyMassIndexCalculator
{
   // method main begins and executes all Java apps.
   public static void main(String[] args)
   {
      // create a Scanner object.
      Scanner input = new Scanner(System.in);

      // variables needed
      int weightInPounds;
      int heightInInches;

      // ask and prompt the user enter her/his weight in pound and height in inches
      System.out.print("Enter your weight in pounds: ");
      weightInPounds = input.nextInt();

      System.out.print("Enter your height in inches: ");
      heightInInches = input.nextInt();


      // calculates and show the procesed information of the BMI
      System.out.printf("Your body mass index is %d%n", (weightInPounds * 703)/(heightInInches * heightInInches));

      // show the informacion provided by the
      System.out.printf("%n%n%s%n%s%n%s%n%s%n%s%n", "BMI VALUES", "Underweight:\tless than 18.5",
         "Normal:\t\tbetween 18.5 and 24.9", "Overweight:\tbetween 25 and 29.9", "Obese:\t\t30 or greater");

   }// end method main
} // end class BodyMassIndexCalculator
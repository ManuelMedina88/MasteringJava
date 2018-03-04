// WorldPopulationGrowthCalculator.java
// @uthor : Manuel Medina.
// Date : Oct 30th 2017.
// app that inputs the current world population and the annual world population growth rate then
// displays the estimated world population after one, two, three, four and five.
import java.util.Scanner; // the program uses a scanner object.

public class WorldPopulationGrowthCalculator
{
   // method main begins and execute all java apps.
   public static void main(String[] args)
   {
      // create a Scanner object
      Scanner input = new Scanner(System.in);

      // variables needed
      double currentPopulation;
      double annualGrowthrate;


      // prompt and input the needed information
      System.out.println("You are going to enter the current world population\nin the following terms for example : if there are\n 6,254,542,654 millions your only have to introduce 6.254542654\n\n");
      System.out.print("Enter the current world population: ");
      currentPopulation = input.nextDouble();
      System.out.print("Enter the annual world growth rate: ");
      annualGrowthrate = input.nextDouble();

      currentPopulation = (currentPopulation + ((currentPopulation/100) * annualGrowthrate));
      System.out.printf("the population in one year will be of : %.9f MM%n", currentPopulation);

      currentPopulation = (currentPopulation + ((currentPopulation/100) * annualGrowthrate));
      System.out.printf("the population in two year will be of : %.9f MM%n", currentPopulation);

      currentPopulation = (currentPopulation + ((currentPopulation/100) * annualGrowthrate));
      System.out.printf("the population in three year will be of : %.9f MM%n", currentPopulation);

      currentPopulation = (currentPopulation + ((currentPopulation/100) * annualGrowthrate));
      System.out.printf("the population in four year will be of : %.9f MM%n", currentPopulation);

      currentPopulation = (currentPopulation + ((currentPopulation/100) * annualGrowthrate));
      System.out.printf("the population in five year will be of : %.9f MM%n", currentPopulation);

   } // end method main
} // end class WorldPopulationGrowthCaculation
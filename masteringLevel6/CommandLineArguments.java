// CommandLineArguments.java
// @uthor : Manuel Medina.
// Date : dic 12th 2017 08:20am.
// program that modify the another program.
public class CommandLineArguments
{
   public static void main(String[] args)
   {
      int size = 10;

      if(args.length > 0)
         size = Integer.parseInt(args[0]);

      // declare variable array and initialize it with and array object
      int[] array = new int[size]; // create the array object

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings

      // output each array element's value
      for (int counter = 0; counter < array.length; counter++)
         System.out.printf("%5d%8d%n", counter, array[counter]);
   }
} // end class InitArray
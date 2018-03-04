// Addition.java
// @uthor : Manuel Medina.
// Date : nov 1st 2017.
// // Addition program that inputs two numbers then displays their sum.
import javax.swing.JOptionPane; // this class uses JOptionPane

public class Addition
{
   // method main begins and executes all Java apps.
   public static void main(String[] args)
   {
      // create and receive the first number from the user.
      int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number : "));

      // create and receive the second number from the user.
      int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number : "));

      // calcutate de sum of firstNumber and secondNumber and store the result.
      int result = firstNumber + secondNumber;

      // create the message through String.format.
      String message = String.format("The result of %d + %d = %d", firstNumber, secondNumber, result);

      // show the sum in a proper way.
      JOptionPane.showMessageDialog(null, message);
   }
}
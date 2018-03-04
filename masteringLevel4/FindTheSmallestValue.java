// FindTheSmallestValue.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 19:51
// write an application that finds the smallest of several integers. assume that the first value read specifies the number of values to input from the user.
import javax.swing.JOptionPane;

public class FindTheSmallestValue
{
   public static void main(String[] args)
   {
      int number = Integer.parseInt(JOptionPane.showInputDialog("Program for finding the smallest number\nEnter the number of value to read"));

      int cont = 1;
      int smallest = 0;
      while(cont <= number)
      {
         String string = String.format("Enter the number %d please:", cont);
         int number1 = Integer.parseInt(JOptionPane.showInputDialog(string));
         if(cont == 1) {
            smallest = number1;
         }
         else {
            if(smallest > number1)
               smallest = number1;
         }
         cont++;
      }

      String string1 = String.format("The smallest number is : %d", smallest);
      JOptionPane.showMessageDialog(null,string1);

   }
} // end class FindTheSmallestValue
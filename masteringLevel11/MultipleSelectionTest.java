// MultipleSelectionTest.java
// @uthor : Manuel Medina.
// Date : Feb 18th 2018 08:42.
// Testing MultipleSelectionFrame.
import javax.swing.JFrame;

public class MultipleSelectionTest
{
   public static void main(String[] args)
   {
      MultipleSelectionFrame multipleSelectionFrame =
         new MultipleSelectionFrame();
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(350, 150);
      multipleSelectionFrame.setVisible(true);
   }
} // end class MultipleSelectionTest
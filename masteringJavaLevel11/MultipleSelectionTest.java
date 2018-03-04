// MultipleSelectionTest.java
// @uthor : Manuel Medina.
// Date : nov 16th 2017.
// Testing MultipleSelectionFrame
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
}
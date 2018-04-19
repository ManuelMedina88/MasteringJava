// CheckBoxTest.java
// @uthor : Manuel Medina.
// Date : March 6th 2018 16:37.
// Testing CheckBoxFrame.
import javax.swing.JFrame;

public class CheckBoxTest
{
   public static void main(String[] args)
   {
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
      BullsEyes bullsEyes = new BullsEyes();
      checkBoxFrame.add(bullsEyes);
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      checkBoxFrame.setSize(275, 100);
      checkBoxFrame.setVisible(true);
   }
} // end class CheckBoxTest
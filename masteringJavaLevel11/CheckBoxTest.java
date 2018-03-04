// CheckBoxTest.java
// @uthor : Manuel Medina.
// Date : nov 14th 2017.
// Testing CheckBoxFrame.
import javafx.scene.control.CheckBox;

import javax.swing.JFrame;

public  class CheckBoxTest
{
   public static void main(String[] args)
   {
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      checkBoxFrame.setSize(275, 100);
      checkBoxFrame.setVisible(true);
   }
} // end class CheckBoxTest
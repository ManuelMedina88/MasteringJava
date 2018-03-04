// RadioButtonTest.java
// @uthor : Manuel Medina.
// Date : Feb 17th 2018 01:38
// Testing RadioButtonFrame.
import javafx.scene.control.RadioButton;

import javax.swing.JFrame;

public class RadioButtonTest
{
   public static void main(String[] args)
   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      radioButtonFrame.setSize(400, 100);
      radioButtonFrame.setVisible(true);
   }
} // end class RadioButtonTest

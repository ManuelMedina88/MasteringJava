// TextFieldTest.java
// @uthor : Manuel Medina.
// Date : March 04th 2018 22:33 p.m.
// Testing TextFieldFrame.
import javax.swing.JFrame;

public class TextFieldTest
{
   public static void main(String[] args)
   {
      TextFieldFrame textFieldFrame = new TextFieldFrame();
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldFrame.setSize(350, 100);
      textFieldFrame.setVisible(true);
   }
} // end class TextFieldTest
// ButtonTest.java
// @uthor : Manuel Medina.
// Date : nov 14th 2017.
// Testing ButtonFrame.
import javax.swing.JFrame;

public class ButtonTest
{
   public static void  main(String[] args)
   {
      ButtonFrame buttonFrame = new ButtonFrame();
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonFrame.setSize(275, 110);
      buttonFrame.setVisible(true);
   }
} // end class ButtonTest
// BullsEyesTest.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 09:54am
// show the capabilities of class BullsEyes
import javax.swing.JFrame;

public class BullsEyesTest
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      BullsEyes panel = new BullsEyes();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(320, 320);
      app.setVisible(true);
   }
}
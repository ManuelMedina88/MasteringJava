// DrawRainbow.java
// @uthor : Manuel Medina.
// Date : dic 10th 2017 08:17.
// Test application to display a rainbow.
//import oracle.jrockit.jfr.JFR;
import javax.swing.JFrame;

public class DrawRainbowTest
{
   public static void main(String[] args)
   {
      DrawRainbow panel = new DrawRainbow();
      JFrame application = new JFrame();

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(400, 250);
      application.setVisible(true);
   }
} // end class DrawRainbowTest
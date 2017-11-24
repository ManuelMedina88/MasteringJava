// DrawPanelTest.java
// @uthor : Manuel Medina.
// Date : nov 22th 2017 21:53
// Creating JFrame to display DrawPanel.
import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main(String[] args)
   {
      // create a panel that contains out drawing
      DrawPanel panel = new DrawPanel();

      // create a new frame to hold the panel
      JFrame application = new JFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(300, 300);
      application.setVisible(true);
   }
}
// DrawPanelTest.java
// @uthor : Manuel Medina.
// Date : dic 27th 2017 23:43
// Creating a JFrame to display a DrawPanel.
import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      DrawPanel panel = new DrawPanel();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(300, 300);
      app.setVisible(true);
   }
}
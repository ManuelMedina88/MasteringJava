// DrawPanel2Test.java
// @uthor : Manuel Medina
// Date : Dic 29th 2017 8:56 a.m.
// App that shows the capabilities of DrawPanel
import javax.swing.JFrame;

public class DrawPanel2Test
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      DrawPanel2 panel = new DrawPanel2();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(400, 400);
      app.setVisible(true);
   }
}
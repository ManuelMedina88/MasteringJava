// DrawLinesRectTest01.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// app that demonstrates the capabilities of DrawLinesRectTest01
import javax.swing.JFrame;

public class DrawLinesRectTest01
{
   public static void main(String[] args)
   {
      DrawLinesRect01 panel = new DrawLinesRect01();
      JFrame app = new JFrame();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(300, 300);
      app.setVisible(true);
   }
}
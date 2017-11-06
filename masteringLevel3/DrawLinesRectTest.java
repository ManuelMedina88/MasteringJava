// DrawLinesRectTest.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// app that shows the drawing.
import javax.swing.JFrame;

public class DrawLinesRectTest
{
   public static void main(String[] args)
   {
      DrawLinesRect panel = new DrawLinesRect();
      JFrame app = new JFrame();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(300, 300);
      app.setVisible(true);
   }
}
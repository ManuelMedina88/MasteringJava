// DrawLinesFourPointTest.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// app that show the drawing of DrawLinesFourPoint
import javax.swing.JFrame;

public class DrawLinesFourPointTest
{
   public static void main(String[] args)
   {
      DrawLinesFourPoint panel = new DrawLinesFourPoint();
      JFrame app = new JFrame();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(300, 300);
      app.setVisible(true);
   }
}
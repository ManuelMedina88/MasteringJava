// DrawLineTest.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// app that shows the result of drawing on DrawLines.java
import javax.swing.JFrame;

public class DrawLineTest
{
   public static void main(String[] args)
   {
      DrawLines panel = new DrawLines();

      JFrame app = new JFrame();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(300, 300);
      app.setVisible(true);
   }
} // end class DrawLineTest
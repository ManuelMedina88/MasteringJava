// DrawingACircularSpiralsTest.java
// @uthor : Manuel Medina.
// Date : dic 11th 2017 08:22 a.m.
// app that show the capabilities os DrawingACircularSpirals
import javax.swing.JFrame;

public class DrawingACircularSpiralsTest
{
   public static void main(String[] args)
   {
      JFrame application = new JFrame();
      DrawingACircularSpirals panel = new DrawingACircularSpirals();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(400, 400);
      application.setVisible(true);
   }
}

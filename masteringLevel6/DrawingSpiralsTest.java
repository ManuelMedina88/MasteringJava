// DrawingSpiralsTest.java
// @uthor : Manuel Medina.
// Date : dic 10th 2017 08:53am
// app that shows the capabilities of DrawingSpirals.java
import javax.swing.JFrame;

public class DrawingSpiralsTest {
   public static void main(String[] args)
   {
      DrawingSpirals panel = new DrawingSpirals();

      JFrame application = new JFrame();

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(400, 400);
      application.setVisible(true);
   }
}
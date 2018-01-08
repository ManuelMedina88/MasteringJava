// ShapesTest.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 17:31
// app that test the Shapes class' capabilities
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class ShapesTest
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      Shapes panel = new Shapes();
      JLabel label = new JLabel(panel.toString());
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.add(label, BorderLayout.SOUTH);
      app.setSize(800, 800);
      app.setVisible(true);

   }
}
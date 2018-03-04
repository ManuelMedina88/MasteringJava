// Painter.java
// @uthor : Manuel Medina.
// Date : nov 18th 2017. 09:01
// Testing PaintPanel
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
   public static void main(String[] args)
   {
      // create JFrame
      JFrame application = new JFrame("A simple paint program");

      PaintPanel paintPanel = new PaintPanel();
      application.add(paintPanel, BorderLayout.CENTER);

      // create a label and place it in SOUTH of BorderLayout
      application.add(new JLabel("Drag the mouse to draw"),
         BorderLayout.SOUTH);

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setSize(400, 200);
      application.setVisible(true);
   }
} // end class Painter
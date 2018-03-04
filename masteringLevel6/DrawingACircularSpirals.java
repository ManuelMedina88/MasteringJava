// DrawingACircularSpirals.java
// @uthor : Manuel Medina.
// Date : dic 11th 2017 08:04am.
// panel for drawing a Circular Spirals
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingACircularSpirals extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int centerX = getWidth()/2;
      int centerY = getHeight()/2;

      for(int counter = 0; counter < 10; counter++)
      {
         g.drawArc((centerX) - 30 * counter, (centerY - 30) - 30 * counter, 60 + 60 * counter, 60 + 60 * counter, 0, 180);

         //if(counter == 0)
            g.drawArc((centerX - 30) - 30 * counter, (centerY - 60) + 30 * counter, 90 + 30 * counter, 110 + 30 * counter, 180, 180);

      }
   }
}
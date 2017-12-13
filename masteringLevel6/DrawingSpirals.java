// DrawingSpirals.java
// @uthor : Manuel Medina.
// Date : dic 10th 2017 08:30am.
// app that draws a spiral with square edge.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingSpirals extends JPanel
{


   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int centerX = getWidth()/2;
      int centerY = getHeight()/2;

      g.setColor(Color.MAGENTA);

      int proportion = 20;

      for(int counter = 0; counter < 10; counter++)
      {
         // right lines
         g.drawLine(centerX + proportion * counter, centerY - proportion * counter, centerX + proportion * counter, (centerY + proportion) + proportion * counter);

         // up lines
         g.drawLine((centerX - proportion) - proportion * counter, (centerY - proportion) - proportion * counter, (centerX + proportion) + proportion * counter, (centerY - proportion) - proportion * counter);

         // left lines
         g.drawLine((centerX - proportion) - proportion * counter, (centerY - proportion) - proportion * counter, (centerX - proportion) - proportion * counter, (centerY + proportion) + proportion * counter);

         // down lines
         g.drawLine((centerX - proportion) - proportion * counter, (centerY + proportion) + proportion * counter, (centerX) + proportion * counter, (centerY + proportion) + proportion * counter);

      }
   }
}
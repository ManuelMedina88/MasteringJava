// DrawLine.java
// @uthor : Manuel Medina.
// Date : nov 4 2017
// panel that houses the drawing of the lines.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int height = getHeight();
      int weight = getWidth();
      int advanceV = getHeight()/15;
      int advanceH = getWidth()/15;

      int counter = 1;
      while(counter <= 15)
      {
         if(counter == 1)
            g.drawLine(0, 0, 0, height);

         if(counter > 1) {

            g.drawLine(0, 0, advanceH, height - advanceV);

            advanceH += getWidth() / 15;
            advanceV += getHeight() / 15;
         }

         counter++;
      }
   }
}
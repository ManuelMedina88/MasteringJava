// DrawLinesRect.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// a sample drawing.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLinesRect extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int height = getHeight();
      int width = getWidth();

      int pHeight = height/15;
      int pWidth = width/15;

      int counter = 1;

      while(counter <= 15)
      {
         if ( counter == 1)
            g.drawLine(0, 0, pWidth, height);

         if (counter > 1)
            g.drawLine(0, pHeight ,pWidth * counter, height);

         pHeight += getHeight()/15;
         counter++;
      }
   }
}
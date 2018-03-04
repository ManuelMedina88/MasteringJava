// DrawLinesFourPoint.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// program that draws lines from the four squards.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLinesFourPoint extends JPanel {
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int height = getHeight();
      int weight = getWidth();
      int pHeight = getHeight()/15;
      int pWidth = getWidth()/15;

      int counter = 1;
      while(counter <= 15)
      {
         if(counter == 1)
         {
            g.drawLine(0, 0, 0, height);
            g.drawLine(0, height, 0, 0);
            g.drawLine(weight, height, 0, height);
            g.drawLine(weight, 0, 0, 0);
         }

         if(counter > 1)
         {
            g.drawLine(0, 0, pWidth, height - pHeight);
            g.drawLine(0, height, pWidth, pHeight);
            g.drawLine(weight, height, pWidth, height - pHeight);
            g.drawLine(weight, 0, pWidth, pHeight);

            pWidth += getWidth()/15;
            pHeight += getHeight()/15;
         }

         counter++;
      }
   }
}
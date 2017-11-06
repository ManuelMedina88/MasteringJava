// DrawLinesRect01.java
// @uthor : Manuel Medina.
// Date : nov 5th 2017.
// draw some images.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLinesRect01 extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int height = getHeight();
      int width = getWidth();

      int pHeight = height/15;
      int pWidth = width / 15;

      int pHeightB = height/15;
      int pWidthB = width/ 15;



      int counter = 1;

      while( counter <= 15)
      {
         if(counter == 1)
         {
            g.drawLine(0, 0, pWidth, height);
            g.drawLine(0, height, width, height - pHeight);
            g.drawLine(width, height, width - pWidth, 0 );
            g.drawLine(width, 0, 0, pHeight);
         }

         if(counter > 1)
         {
            g.drawLine(0, pHeightB, pWidth * counter, height);
            g.drawLine(pWidthB, height, width, height - pHeight * counter);
            g.drawLine(width, height - pHeightB, width - pWidth * counter, 0);
            g.drawLine(width - pWidth * counter,0, 0, pHeight * counter);


            pHeightB += getHeight()/15;
            pWidthB += getWidth()/15;
         }

         counter++;
      }
   }
}
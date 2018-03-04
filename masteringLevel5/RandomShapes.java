// RandomShapes.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 10:09am
// an app that shows differnce shapes.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class RandomShapes extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      int width = getWidth();
      int height = getHeight();
      boolean shape;
      Color color;

      // position and sizes
      int posX;
      int posY;
      int sizeX;
      int sizeY;

      SecureRandom random = new SecureRandom();

      for(int i = 1; i <= 10; i++)
      {
         posX = random.nextInt((width));
         posY = random.nextInt((height));
         sizeX = random.nextInt(width - posX);
         sizeY = random.nextInt(height - posY);

         shape = random.nextBoolean();
         color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

         if(shape)
         {
            g.setColor(color);
            g.fillOval(posX, posY, sizeX, sizeY);

         }
         else
         {
            g.setColor(color);
            g.fillRect(posX, posY, sizeX, sizeY);

         }
      }
   }
} // end class RandomShapes
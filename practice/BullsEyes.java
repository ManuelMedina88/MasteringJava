// BullsEyes.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 09:38am
// app that create a draw of a bull's eyes.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class BullsEyes extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      SecureRandom random = new SecureRandom();

      Color color1 = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
      Color color2 = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

      int circleSize = 300;
      int inicialPosition = 10;
      for(int i = 1; i <= 5; i++)
      {
         if(i % 2 == 1)
         {
            g.setColor(color1);
            g.fillOval(inicialPosition, inicialPosition, circleSize, circleSize);
            inicialPosition += 30;
            circleSize -= 60;
         }

         if(i % 2 == 0)
         {
            g.setColor(color2);
            g.fillOval(inicialPosition, inicialPosition, circleSize, circleSize);
            inicialPosition += 30;
            circleSize -= 60;
         }

      }
   }
}
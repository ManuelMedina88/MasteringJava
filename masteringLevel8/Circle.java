// Circle.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 16:30.
// this class draw a circle.
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends SuperShape
{
   private boolean fill;

   public Circle(int initX, int initY, int finalX, int finalY, Color color, boolean fill)
   {
      super(initX, initY, finalX, finalY, color);

      this.fill = fill;
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);

      if (fill)
      {
         g.fillOval(getIX(), getIY(), getFX(), getFY());
      }
      else
      {
         g.drawOval(getIX(), getIY(), getFX(), getFY());
      }
   }
}
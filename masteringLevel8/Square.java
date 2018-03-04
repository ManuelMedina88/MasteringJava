// Square.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 16:24.
// this class draw square.
import java.awt.Color;
import java.awt.Graphics;

public class Square extends SuperShape
{
   private boolean fill;

   public Square(int initX, int initY, int finalX, int finalY, Color color, boolean fill)
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
         g.fillRect(getIX(), getIY(), getFX(), getFY());
      }
      else
      {
         g.drawRect(getIX(), getIY(), getFX(), getFY());
      }
   }
}
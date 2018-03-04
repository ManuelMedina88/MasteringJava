// Line.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 15:36.
// this class draw a line.
import java.awt.Color;
import java.awt.Graphics;

public class Line extends SuperShape
{

   public Line(int initX, int initY, int finalX, int finalY, Color color)
   {
      super(initX, initY, finalX, finalY, color);
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      g.drawLine(getIX(), getIY(), getFX(), getFY());
   }
}
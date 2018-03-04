// MyLine.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 22:39 p.m.
// class MyLine extends the abstract class MyShape and implements its method draw.
import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape
{
   // constructor that call super constructor with no arguments.
   public MyLine()
   {
      super();
   }

   // constructor that call super constructor with argument
   public MyLine(int x1, int y1, int x2, int y2, Color color)
   {
      super(x1, y1, x2, y2, color);
   }

   // class MyLine implement method draw inherited from MyShape
   @Override
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      g.drawLine(getX1(), getY1(), getX2(), getY2());
   }
}
// MyRectangle.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 23:56
// Class that extends the abstract class MyShape
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape
{
   private boolean fill; // state that determine whether MyRectangle object is filled or not.

   public MyRectangle()
   {
      super();
   }

   public MyRectangle(int x1, int y1, int x2, int y2, Color color, Boolean fill)
   {
      super(x1, y1, x2, y2, color);

      this.fill = fill;
   }

   // method that get fill
   public boolean getFill()
   {
      return fill;
   }

   public void draw(Graphics g)
   {
      g.setColor(getColor());

      if(getFill())
      {
         g.fillRect(getX1(), getY1(), getX2(), getY2());
      }else
      {
         g.drawRect(getX1(), getY1(), getX2(), getY2());
      }
   }
} // end class MyRectangle.
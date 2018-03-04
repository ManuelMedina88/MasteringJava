// MyOval.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 23:04
// Class MyOval extends abstract class MyShape for after
// be treat in a polymorphically  way with other objects that inherit from that class
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape
{
   private boolean fill; // state that determine if the oval is fill or not.

   // constructor without parameter
   public MyOval()
   {
      super();
   }

   // constructor with 6 parameters.
   public MyOval(int x1, int y1, int x2, int y2, Color color, Boolean fill)
   {
      super(x1, y1, x2, y2, color);

      this.fill = fill;
   }

   // method that get fill
   public boolean getFill()
   {
      return fill;
   }

   // implementation of the method draw inherited from MyShape
   @Override
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      if(getFill())
      {
         g.fillOval(getX1(), getY1(), getX2(), getY2());
      }
      else
      {
         g.drawOval(getX1(), getY1(), getX2(), getY2());
      }
   }
} // end class MyOval
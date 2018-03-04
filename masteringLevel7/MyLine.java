// MyLine.java
// @uthor : Manuel Medina.
// Date : Dic 27th 2017 23:09
// MyLine class represents a line.
import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
   private int x1; // x-coordinate of first endpoint
   private int y1; // y-coordinate of first endpoint
   private int x2; // x-coordinate of second endpoint
   private int y2; // y-coordinate of second endpoint
   private Color color;

   public MyLine()
   {
      setX1(0);
      setY1(0);
      setX2(0);
      setY2(0);
      color = Color.BLACK;
   }
   public MyLine(int x1, int y1, int x2, int y2, Color color)
   {
      setX1(x1);
      setY1(y1);
      setX2(x2);
      setY2(y2);
      this.color = color;
   }

   public void setX1(int x1)
   {
      if(x1 >= 0)
      {
         this.x1 = x1;
      }
      else
      {
         this.x1 = 0;
      }
   }

   public void setY1(int y1)
   {
      if(y1 >= 0)
      {
         this.y1 = y1;
      }
      else
      {
         this.y1 = 0;
      }
   }

   public void setX2(int x2)
   {
      if(x2 >= 0)
      {
         this.x2 = x2;
      }
      else
      {
         this.x2 = 0;
      }
   }

   public void setY2(int y2)
   {
      if(y2 >= 0)
      {
         this.y2 = y2;
      }
      else
      {
         this.y2 = 0;
      }
   }

   public int getUpperLeftX()
   {
      return x1;
   }

   public int getUpperLeftY()
   {
      return y1;
   }

   public int getWidth()
   {
      return x2;
   }

   public int getHeight()
   {
      return y2;
   }

   // Draw the line in the specified color
   public void draw(Graphics g)
   {
      g.setColor(color);
      g.drawLine(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
   }
} // end class MyLine
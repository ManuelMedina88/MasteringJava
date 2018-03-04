// MyOval.java
// @uthor : Manuel Medina.
// Date : dic 29th 2017 07:31 p.m.
// app that draw an oval
import java.awt.Graphics;
import java.awt.Color;

public class MyOval
{
   private int x1;
   private int y1;
   private int x2;
   private int y2;
   private boolean flag;
   private Color color;

   public MyOval()
   {
      setX1(0);
      setY1(0);
      setX2(0);
      setY2(0);
      color = Color.BLACK;
      flag = false;
   }


   public MyOval(int x1, int y1, int x2, int y2, Color color, boolean flag)
   {
      setX1(x1);
      setY1(y1);
      setX2(x2);
      setY2(y2);
      this.color = color;
      this.flag = flag;
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

   public void drawMyOval(Graphics g)
   {
      g.setColor(color);

      if(flag)
      {
         g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() );
      }
      else
      {
         g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      }
   }
}
// MyShape.java
// @uthor : Manuel Medina.
// Date : Jan 10th 2018 22:05.
// abstract class that is a superclass for MyLine, MyOval and MyRectangle.
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape
{
   private int x1;  // coordinate x1
   private int y1; // coordinate y1
   private int x2; // coordinate x2
   private int y2; // coordinate y2
   private Color color; // color to apply to the shape.

   // constructor
   public MyShape()
   {
      this(0, 0, 0, 0, Color.BLACK);
   }

   // constructor with parameters
   public MyShape(int x1, int y1, int x2, int y2, Color color)
   {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      this.color = color;
   }

   // method that sets x1
   public void setX1(int x1)
   {
      this.x1 = x1;
   }

   // method that return x1
   public int getX1()
   {
      return x1;
   }

   // method that set y1
   public void setY1(int y1)
   {
      this.y1 = y1;
   }

   // method that gets Y1
   public int getY1()
   {
      return y1;
   }

   // method that sets x2
   public void setX2(int x2)
   {
      this.x2 = x2;
   }

   // method that return x2
   public int getX2()
   {
      return x2;
   }

   // method that sets y2
   public void setY2(int y2)
   {
      this.y2 = y2;
   }
   // method that gets y2
   public int getY2()
   {
      return y2;
   }

   // method that sets color
   public void setColor(Color color)
   {
      this.color = color;
   }

   // method that gets color
   public Color getColor()
   {
      return color;
   }

   public abstract void draw(Graphics g);
}
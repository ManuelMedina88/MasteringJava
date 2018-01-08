// SuperShape.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 16:19.
// this class is the super class for all the shapes.
import java.awt.Color;
import java.awt.Graphics;

public class SuperShape
{
   private int initX;
   private int initY;
   private int finalX;
   private int finalY;
   private Color color;

   public SuperShape(int initX, int initY, int finalX, int finalY, Color color)
   {
      this.initX = initX;
      this.initY = initY;
      this.finalX = finalX;
      this.finalY = finalY;
      this.color = color;
   }

   protected int getIX()
   {
      return initX;
   }

   protected int getIY()
   {
      return initY;
   }

   protected int getFX()
   {
      return finalX;
   }

   protected int getFY()
   {
      return finalY;
   }

   public void draw(Graphics g)
   {
      g.setColor(color);
   }
}
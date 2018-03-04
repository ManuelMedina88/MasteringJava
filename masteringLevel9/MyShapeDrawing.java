// MyShapeDrawing.java
// @uthor : Manuel Medina.
// Date : Jan 11th 2018 00:08 a.m.
// Apps that uses all the classes that inherit from MyShape class
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class MyShapeDrawing extends JPanel
{
   private SecureRandom secureRandom = new SecureRandom();
   private MyShape[] myShapes;
   private int linesNumber;
   private int ovalsNumber;
   private int rectNumber;

   public MyShapeDrawing()
   {
      initializeShapes();
   }

   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      for(int i = 0; i < myShapes.length; i++)
      {
         myShapes[i].draw(g);
      }
   }

   public void setLinesNumber(int linesNumber) {
      this.linesNumber = linesNumber;
   }

   public int getLinesNumber() {
      return linesNumber;
   }

   public void setOvalsNumber(int ovalsNumber) {
      this.ovalsNumber = ovalsNumber;
   }

   public int getOvalsNumber() {
      return ovalsNumber;
   }

   public void setRectNumber(int rectNumber) {
      this.rectNumber = rectNumber;
   }

   public int getRectNumber() {
      return rectNumber;
   }

   private final void initializeShapes()
   {
      int lines = 1 + secureRandom.nextInt(5);
      MyLine[] myLines = new MyLine[lines];

      for(int i = 0; i < myLines.length ; i++)
      {
         int x1 = 1 + secureRandom.nextInt(400);
         int y1 = 1 + secureRandom.nextInt(400);
         int x2 = 1 + secureRandom.nextInt(400);
         int y2 = 1 + secureRandom.nextInt(400);

         Color color = new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256));

         myLines[i] = new MyLine(x1, y1, x2, y2, color);
      }

      int ovals = 1 + secureRandom.nextInt(5);
      MyOval[] myOvals = new MyOval[ovals];

      for(int i = 0; i < myOvals.length ; i++)
      {
         int x1 = 1 + secureRandom.nextInt(400);
         int y1 = 1 + secureRandom.nextInt(400);
         int x2 = 1 + secureRandom.nextInt(400);
         int y2 = 1 + secureRandom.nextInt(400);

         Color color = new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256));

         boolean fill = secureRandom.nextBoolean();

         myOvals[i] = new MyOval(x1, y1, x2, y2, color, fill);
      }

      int rects = 1 + secureRandom.nextInt(5);
      MyRectangle[] myRectangles = new MyRectangle[rects];

      for(int i = 0; i < myRectangles.length ; i++)
      {
         int x1 = 1 + secureRandom.nextInt(400);
         int y1 = 1 + secureRandom.nextInt(400);
         int x2 = 1 + secureRandom.nextInt(400);
         int y2 = 1 + secureRandom.nextInt(400);

         Color color = new Color(secureRandom.nextInt(256), secureRandom.nextInt(256), secureRandom.nextInt(256));

         boolean fill = secureRandom.nextBoolean();

         myRectangles[i] = new MyRectangle(x1, y1, x2, y2, color, fill);
      }


      myShapes = new MyShape[lines + ovals + rects];

      setLinesNumber(lines);
      setOvalsNumber(ovals);
      setRectNumber(rects);

      int counter = 0;

      for(int i = 0; i < myLines.length; i++)
      {
         myShapes[counter++] = myLines[i];
      }

      for(int i = 0; i < myOvals.length; i++)
      {
         myShapes[counter++] = myOvals[i];
      }

      for(int i = 0; i < myRectangles.length; i++)
      {
         myShapes[counter++] = myRectangles[i];
      }
   }

   public String toString()
   {
      return String.format("lines: %d, ovals: %d, rectangles: %d", getLinesNumber(),
         getOvalsNumber(), getRectNumber());
   }
}
// DrawPanel2.java
// @uthor : Manuel Medina.
// Date : Dic 29th 2017 08:02 a.m.
// class that create object of MyLine, MyOval and MyRectangle.
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

public class DrawPanel2 extends JPanel
{
   private SecureRandom random = new SecureRandom();
   private MyLine[] myline;
   private MyRectangle[] myRectangle;
   private MyOval[] myOvals;

   public DrawPanel2()
   {
      myline = new MyLine[1 + random.nextInt(5)];
      myOvals = new MyOval[1 + random.nextInt(5)];
      myRectangle = new MyRectangle[1 + random.nextInt(5)];

      for(int i = 0; i <  myline.length; i++)
      {
         int x1 = random.nextInt(400);
         int y1 = random.nextInt(400);
         int x2 = random.nextInt(400);
         int y2 = random.nextInt(400);
         Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
         myline[i] = new MyLine(x1, y1, x2, y2, color);
      }

      for(int i = 0; i <  myRectangle.length; i++)
      {
         int x1 = random.nextInt(400);
         int y1 = random.nextInt(400);
         int x2 = random.nextInt(400);
         int y2 = random.nextInt(400);
         Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
         boolean flag = random.nextBoolean();
         myRectangle[i] = new MyRectangle(x1, y1, x2, y2, color, flag);
      }

      for(int i = 0; i <  myOvals.length; i++)
      {
         int x1 = random.nextInt(400);
         int y1 = random.nextInt(400);
         int x2 = random.nextInt(400);
         int y2 = random.nextInt(400);
         Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
         boolean flag = random.nextBoolean();
         myOvals[i] = new MyOval(x1, y1, x2, y2, color, flag);
      }

   }

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      for(MyOval oval : myOvals)
      {
         oval.drawMyOval(g);
      }

      for(MyRectangle rectangle : myRectangle)
      {
         rectangle.drawMyRectangle(g);

      }

      for(MyLine line : myline)
      {
         line.draw(g);
      }
   }
}
// Shapes.java
// @uthor : Manuel Medina.
// Date : Jan 6th 2018 16:56
// class that a composition of all the class with SuperShapes as a superclass
import java.awt.Graphics;
import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private Line[] lines;
   private Square[] squares;
   private Circle[] circles;
   private SecureRandom random = new SecureRandom();

   public Shapes()
   {
      {

         int quantityLines = 1 + random.nextInt(5);
         lines = new Line[quantityLines];

         int quantitySquare = 1 + random.nextInt(5);
         squares = new Square[quantitySquare];

         int quantityCircle = 1 + random.nextInt(5);
         circles = new Circle[quantityCircle];


         for(int i = 0; i < lines.length; i++)
         {
            int iX = random.nextInt(400);
            int iY = random.nextInt(400);
            int fX = random.nextInt(400);
            int fY = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            lines[i] = new Line(iX, iY, fX, fY, color);
         }

         for(int i = 0; i < circles.length; i++)
         {
            int iX = random.nextInt(400);
            int iY = random.nextInt(400);
            int fX = random.nextInt(400);
            int fY = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            boolean real = random.nextBoolean();
            circles[i] = new Circle(iX, iY, fX, fY, color, real);
         }

         for(int i = 0; i < squares.length; i++)
         {
            int iX = random.nextInt(400);
            int iY = random.nextInt(400);
            int fX = random.nextInt(400);
            int fY = random.nextInt(400);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            boolean real = random.nextBoolean();
            squares[i] = new Square(iX, iY, fX, fY, color, real);
         }
      }
   }

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      for(int i = 0; i < lines.length; i++)
      {
         lines[i].draw(g);
      }

      for(int i = 0; i < squares.length; i++)
      {
         squares[i].draw(g);
      }

      for(int i = 0; i < circles.length; i++)
      {
         circles[i].draw(g);
      }
   }

   public String toString()
   {
      return String.format("Lines: %d, Ovals: %d, Rectangles: %d", lines.length, circles.length, squares.length);
   }
}
// DrawPanel.java
// @uthor : Manuel Medina.
// Date : Dic 27th 2017 23:24
// Program that uses class MyLine
// to draw random lines.
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private SecureRandom randomNumber = new SecureRandom();
   private MyLine[] myLines; // array of lines

   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground(Color.WHITE);

      myLines = new MyLine[5 + randomNumber.nextInt(5)];

      // create lines
      for (int count = 0; count < myLines.length; count++)
      {
         // generate random coordinates
         int x1 = randomNumber.nextInt(300);
         int y1 = randomNumber.nextInt(300);
         int x2 = randomNumber.nextInt(300);
         int y2 = randomNumber.nextInt(300);

         Color color = new Color(randomNumber.nextInt(256), randomNumber.nextInt(250), randomNumber.nextInt(256));

         // add the line to the list of lines to be displayed
         myLines[count] = new MyLine(x1, y1, x2, y2, color);
      }
   }

   public void paintComponent(Graphics g)
   {

      super.paintComponent(g);

      // draw the lines
      for (MyLine line : myLines)
         line.draw(g);
   }
} // end class DrawPanel


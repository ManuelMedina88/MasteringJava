// RandomShapesTest.java
// @uthor : Manuel Medina.
// Date : nov 29th 2017 10:28am
// App that show all the capabilities of RandomShapes.java
import javax.swing.JFrame;

public class RandomShapesTest
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      RandomShapes panel = new RandomShapes();

      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(400,400);
      app.setVisible(true);
   }
} // end class RandomShapesTest
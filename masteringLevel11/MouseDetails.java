// MouseDetails.java
// @uthor : Manuel Medina.
// Date : Feb 20th 2018 18:12
// Testing MouseDetailsFrame.
import javax.swing.JFrame;

public class MouseDetails
{
   public static void main(String[] args)
   {
      MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
      mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mouseDetailsFrame.setSize(400, 150);
      mouseDetailsFrame.setVisible(true);
   }
} // end class MouseDetails
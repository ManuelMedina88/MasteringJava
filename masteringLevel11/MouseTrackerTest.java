// MouseTrackerTest.java
// @uthor : Manuel Medina.
// Date : Feb 18th 2018 20:08
// Testing MouseTrackerFrame.
import javax.swing.JFrame;

public class MouseTrackerTest
{
   public static void main(String[] args)
   {
      MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
      mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mouseTrackerFrame.setSize(300, 100);
      mouseTrackerFrame.setVisible(true);
   }
} // end class MouseTracker
// MouseTrackerTest.java
// @uthor : Manuel Medina.
// Date : March 10th 2018 14:16 p.m.
// Testing MouseTrackerFrame.
import javax.swing.JFrame;

public class MouseTrackerTest
{
   public static void main(String[] args)
   {
      MouseTrackFrame mouseTrackFrame = new MouseTrackFrame();
      mouseTrackFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mouseTrackFrame.setSize(300, 100);
      mouseTrackFrame.setVisible(true);
   }
} // end class MouseTracker
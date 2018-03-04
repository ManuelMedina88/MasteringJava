// KeyDemo.java
// @uthor : Manuel Medina.
// Date : Feb 24th 2018 09:03am.
// Testing KeyDemoFrame.
import javax.swing.JFrame;

public class KeyDemo
{
   public static void main(String[] args)
   {
      KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
      KeyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      KeyDemoFrame.setSize(350, 100);
      KeyDemoFrame.setVisible(true);
   }
} // end class KeyDemo
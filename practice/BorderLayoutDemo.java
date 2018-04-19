// BorderLayoutDemo.java
// @uthor : Manuel Medina.
// Date : March 16th 2018 20:09 p.m.
// Testing BorderLayoutFrame.
import javax.swing.JFrame;
import java.awt.*;

public class BorderLayoutDemo
{
   public static void main(String[] args) {
      BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
      borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      borderLayoutFrame.setSize(300, 200);
      borderLayoutFrame.setVisible(true);
   }
}
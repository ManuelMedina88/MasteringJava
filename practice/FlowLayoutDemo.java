// FlowLayoutDemo.java
// @uthor : Manuel Medina.
// Date : March 16th 2018 18:35 p.m.
// Testing FlowLayoutFrame.
import javax.swing.JFrame;


public class FlowLayoutDemo
{
   static public void main(String... args_recun)
   {
      FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
      flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      flowLayoutFrame.setSize(300, 75);
      flowLayoutFrame.setVisible(true);
   }
}
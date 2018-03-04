// MyShapeDrawingTest.java
// @uthor : Manuel Medina.
// Date : Jan 11th 2018 6:58 a.m.
// class MyShapeDrawingTest shows all the capacities of inheritange and abstract class
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class  MyShapeDrawingTest
{
   public static void main(String[] args)
   {
      JFrame app = new JFrame();
      MyShapeDrawing panel = new  MyShapeDrawing();
      JLabel jLabel = new JLabel(panel.toString());
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.add(jLabel, BorderLayout.SOUTH);
      app.setSize(800, 800);
      app.setVisible(true);

   }
}
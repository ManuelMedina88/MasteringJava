// ConcentricCirclesTest.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 09:02 a.m.
// Show the capabilities of ConcentricCircles.java
import javax.swing.JFrame;

public class ConcentricCirclesTest
{
    public static void main(String[] args)
    {
        JFrame app = new JFrame();
        ConcentricCircles panel = new ConcentricCircles();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
} // end class ConcentricCirclesTest
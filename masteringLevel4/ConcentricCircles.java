// ConcentricCircles.java
// @uthor : Manuel Medina.
// Date : nov 24 2017 8:49am.
// Drawing circles from the center.
import java.awt.Graphics;
import javax.swing.JPanel;

public class ConcentricCircles extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;

        for(int i = 1; i <= 12; i++)
        {
            g.drawOval(xCenter - 10 * i, yCenter - 10 * i,
                    10 * i * 2, 10 * i * 2);
        }
    }
} // end class ConcentricCircle.
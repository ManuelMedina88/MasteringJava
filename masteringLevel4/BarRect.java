// BarRect.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 9:33 a.m.
// draw bars
import java.awt.Graphics;
import javax.swing.JPanel;

public class BarRect extends JPanel
{
    int bar1;
    int bar2;
    int bar3;
    int bar4;
    int bar5;

    public BarRect(int bar1,int bar2, int bar3, int bar4, int bar5)
    {
        this.bar1 = bar1;
        this.bar2 = bar2;
        this.bar3 = bar3;
        this.bar4 = bar4;
        this.bar5 = bar5;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int x = getWidth();
        int y = getHeight();

        for(int i = 150; i <= 230; i += 20)
        {
            if(i == 150)
                g.drawRect(i, y - bar1 * 10, 20, bar1 * 10);
            if(i == 170)
                g.drawRect(i, y - bar2 * 10, 20, bar2 * 10);
            if(i == 190)
                g.drawRect(i, y - bar3 * 10, 20, bar3 * 10);
            if(i == 210)
                g.drawRect(i, y - bar4 * 10, 20, bar4 * 10);
            if(i == 230)
                g.drawRect(i, y - bar5 * 10, 20, bar5 * 10);
        }
    }
} // end class BarRect
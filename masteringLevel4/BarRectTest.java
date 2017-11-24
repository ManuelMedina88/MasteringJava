// BarRectTest.java
// @uthor : Manuel Medina.
// Date : nov 24th 2017 9:53am.
// Display the graphics of BarRect
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BarRectTest
{
    public static void main(String[] args)
    {
        boolean truth = true;
        int a = 0;
        while(truth) {
            a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first bar number"));
            if(a >= 1 && a <= 30 )
                truth = false;
            if( a < 1 || a > 30 )
                JOptionPane.showMessageDialog(null, "The number entered is smaller than 1 or bigger than 30\nPlease enter a number among 1 and 30");
        }

        truth = true;
        int b = 0;
        while(truth) {
            b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second bar number"));
            if(b >= 1 && b <= 30 )
                truth = false;
            if( b < 1 || b > 30 )
                JOptionPane.showMessageDialog(null, "The number entered is smaller than 1 or bigger than 30\nPlease enter a number among 1 and 30");
        }

        truth = true;
        int c = 0;
        while(truth) {
            c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third bar number"));
            if(c >= 1 && c <= 30 )
                truth = false;
            if( c < 1 || c > 30 )
                JOptionPane.showMessageDialog(null, "The number entered is smaller than 1 or bigger than 30\nPlease enter a number among 1 and 30");
        }
        truth = true;
        int d = 0;
        while(truth) {
            d = Integer.parseInt(JOptionPane.showInputDialog("Enter the fourth bar number"));
            if(d >= 1 && d <= 30 )
                truth = false;
            if( d < 1 || d > 30 )
                JOptionPane.showMessageDialog(null, "The number entered is smaller than 1 or bigger than 30\nPlease enter a number among 1 and 30");
        }

        truth = true;
        int e = 0;
        while(truth) {
            e = Integer.parseInt(JOptionPane.showInputDialog("Enter the fith bar number"));
            if(e >= 1 && e <= 30 )
                truth = false;
            if( e < 1 || e > 30 )
                JOptionPane.showMessageDialog(null, "The number entered is smaller than 1 or bigger than 30\nPlease enter a number among 1 and 30");
        }

        JFrame app = new JFrame();
        BarRect panel = new BarRect(a,b,c,d,e);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 400);
        app.setVisible(true);
    }
}
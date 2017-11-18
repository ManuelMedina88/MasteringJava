// KeyDemoFrame.java
// @uthor : Manuel Medina.
// Date : nov 18th 2017 11:28am
// Key event handling.
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener
{
   private final String line1 = ""; // first line of text area
   private final String line2 = ""; // second line of text area
   private final String line3 = ""; // third line of text area
   private final JTextArea textArea; // text area to display output

   // KeyDemoFrame constructor
   public KeyDemoFrame()
   {
      super("Demonstrating Keystroke Events");

      textArea = new JTextArea(10, 15); // set up JTextArea
      textArea.setText("Press any key on the keyboard...");
      textArea.setEnabled(false);
      textArea.setDisabledTextColor(Color.BLACK);
      add(textArea); // add text area to JFrame

      addKeyListener(this);  // allow frame to process key event
   }


}
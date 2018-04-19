// KeyDemoFrameV2.java
// @uthor : Manuel Medina.
// Date : March 15th 2018 17:45 p.m.
// Key event handling.
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrameV2 extends JFrame
{
   private String line1;
   private String line2;
   private String line3;
   private final JTextArea textArea;

   public KeyDemoFrameV2()
   {
      super("Demonstrating Keystroke Events");

      textArea = new JTextArea(10, 15);
      textArea.setText("Press any key on the keyboard...");
      textArea.setEnabled(false);
      textArea.setDisabledTextColor(Color.BLUE);
      this.add(textArea);

      this.addKeyListener(

         new KeyListener()
         {

            @Override
            public void keyPressed(KeyEvent event)
            {
               line1 = String.format("Key pressed: %s",
                  KeyEvent.getKeyText(event.getKeyCode()));
               setLines2and3(event);
            }

            @Override
            public void keyReleased(KeyEvent event)
            {
               line1 = String.format("Key released: %s",
                  event.getKeyCode());
               setLines2and3(event);
            }

            @Override
            public void keyTyped(KeyEvent event)
            {
               line1 = String.format("key typed: %s", event.getKeyChar());
               setLines2and3(event);
            }
         }
      );
   }

   private void setLines2and3(KeyEvent event)
   {
      line2 = String.format("this key is %san action key",
         (event.isActionKey()? "" : "not "));

      String temp = KeyEvent.getKeyModifiersText(event.getModifiers());

      line3 = String.format("Modifier keys pressed: %s",
         (temp.equals("")? "nome" : temp)); // output modifiers

      textArea.setText(String.format("%s\n%s\n%s\n",
         line1, line2, line3));
   }
}


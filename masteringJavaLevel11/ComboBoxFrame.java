// ComboBoxFrame.java
// @uthor : Manuel Medina.
// Date : nov 15th 2017.
// JComboBox that displays a list of image names.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{
   private final JComboBox<String> imagesJComboBox; // holds icon names
   private final JLabel label; // display selected icon

   private static final String[] names =
      {"bug1.GIF", "bug2.GIF", "travelbug.gif", "buganim.gif"};

   private final Icon[] icons = {
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])),
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3]))};

   // ComboBoxFrame constructor adds JComboBox to JFrame
   public ComboBoxFrame()
   {
      super("Testing JComboBox");
      setLayout(new FlowLayout()); // set frame layout

      imagesJComboBox = new JComboBox<String>(names); // set up JComboBox
      imagesJComboBox.setMaximumRowCount(3); // display three rows

      imagesJComboBox.addItemListener(
         new ItemListener() // anonymous inner class
         {
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // determine whether item selected
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            }
         } // end anonymous inner class
      ); // end class to addItemListener

      add(imagesJComboBox); // add combo box to JFrame
      label = new JLabel(icons[0]); // display first icon
      add(label); // add label to JFrame
   }
} // end class ComboBoxFrame
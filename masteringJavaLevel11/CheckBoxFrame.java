// CheckBoxFrame.java
// @uthor : Manuel Medina.
// Date : nov 14th 2017.
// JCheckBoxes and item events.
import javafx.scene.control.CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
   private final JTextField textField; // display text in changing font
   private final JCheckBox boldJCheckBox; // to select/deselect bold
   private final JCheckBox italicJCheckBox; // to select/deselect italic

   // CheckBoxFrame constructor adds JCheckBoxes to JFrame
   public CheckBoxFrame()
   {
      super("JCheckBox Text");
      setLayout(new FlowLayout());

      // set up JTextField and set its font
      textField = new JTextField("Watch the font style change", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField); // add textField to JFrame

      boldJCheckBox = new JCheckBox("Bold");
      italicJCheckBox = new JCheckBox("Italic");
      add(boldJCheckBox); // add bold checkbox to JFrame
      add(italicJCheckBox); // add italic checkbox to JFrame

      // register listeners for JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
   }

   private class CheckBoxHandler implements ItemListener
   {
      // respond to checkbox events
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; // stores the new Font

         // determine which CheckBoxes are checked and create Font
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);

         textField.setFont(font);
      }
   }
} // end class CheckBoxFrame
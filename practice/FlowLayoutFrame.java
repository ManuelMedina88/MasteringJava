// FlowLayoutFrame.java
// @uthor : Manuel Medina.
// Date : March 16th 2018 18:13 p.m.
// FlowLayout allows components to flow over multiple lines.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
   private final JButton leftButton; // button to set alignment left
   private final JButton centerButton; // button to set alignment center
   private final JButton rightJButton; // button to set alignment right
   private final FlowLayout layout; // layout object
   private final Container container; // container to set layout

   // set up GUI and register button listeners
   public FlowLayoutFrame()
   {
      super("FLowLayout Demo");

      layout = new FlowLayout();
      container = getContentPane(); // get container to layout
      setLayout(layout);

      // set up leftJButton and register listener
      leftButton = new JButton("Left");
      add(leftButton); // add left button to frame
      leftButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process leftButton event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               layout.setAlignment(FlowLayout.LEFT);

               // realign attached components
               layout.layoutContainer(container);
            }
         }
      );

      // set up centerJButton and register listener
      centerButton = new JButton("Center");
      add(centerButton); // add center button to frame
      centerButton.addActionListener(
         new ActionListener() // anonymous inner class
         {
            // process centerJButton event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               layout.setAlignment(FlowLayout.CENTER);

               layout.layoutContainer(container);
            }
         }
      );

      // set up rightJButton and register listener
      rightJButton = new JButton("Right");
      add(rightJButton); // add Right button to frame
      rightJButton.addActionListener(
         new ActionListener()  // anonymous inner class
         {
            // process rightJButton event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               layout.setAlignment(FlowLayout.RIGHT);

               // realign attached components
               layout.layoutContainer(container);
            }
         }
      );
   } // end FlowLayoutFrame constructor
} // end class FlowLayoutFrame
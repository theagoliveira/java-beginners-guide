// Demonstrate check boxes.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener {
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        // Create a new JFrame container.
        var jfrm = new JFrame("Demonstrate Check Boxes");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(280, 120);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create emtpy labels.
        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        // Make check boxes.
        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        // Add item listeners.
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        // Add the components to the content pane.
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        // Display the frame
        jfrm.setVisible(true);
    }

    // This is the handler for the check boxes.
    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        // Obtain a reference to the check box that
        // caused the event.
        JCheckBox cb = (JCheckBox) ie.getItem();

        // Report what check box changed.
        if (cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected.");
        else
            jlabChanged.setText(cb.getText() + " was just cleared.");

        // Report all selected boxes.
        if (jcbAlpha.isSelected()) {
            str += "Alpha ";
        }

        if (jcbBeta.isSelected()) {
            str += "Beta ";
        }

        if (jcbGamma.isSelected()) {
            str += "Gamma ";
        }

        jlabSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
}

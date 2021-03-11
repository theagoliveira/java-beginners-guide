/*
 * 17. Bonus challenge: Convert the Help class developed in Try This 4-1 into a Swing-based GUI
 * program. Display the keywords (for, while, switch, and so on) in a JList. When the user selects
 * one, display the keyword's syntax.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class HelpGUI implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Create an array of names.
    String[] commands = {"if", "switch", "for", "while", "do-while", "break", "continue"};
    String[] definitions = {
            "<html>The if:<br><br>if (condition) statement;<br>else statement;</html>",
            "<html>The switch:<br><br>switch (expression) {<br>&nbsp;&nbsp;case 'constant':<br>&nbsp;&nbsp;&nbsp;&nbsp;statement sequence<br>&nbsp;&nbsp;&nbsp;&nbsp;break;<br>&nbsp;&nbsp;// ...<br>}</html>",
            "<html>The for:<br><br>for(init; condition; iteration)<br>&nbsp;&nbsp;statement;</html>",
            "<html>The while:<br><br>while (condition) statement;</html>",
            "<html>The do-while:<br><br>do {<br>&nbsp;&nbsp;statement;<br>} while (condition)</html>",
            "<html>The break:<br><br>break; or break label;</html>",
            "<html>The continue:<br><br>continue; or continue label;</html>"};

    HelpGUI() {
        // Create a new JFrame container.
        var jfrm = new JFrame("Help");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(220, 270);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList.
        jlst = new JList<String>(commands);

        // Set the list selection mode to single-selection.
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add list to a scroll pane.
        jscrlp = new JScrollPane(jlst);

        // Set the preferred size of the scroll pane.
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlab = new JLabel("Please choose a command");

        // Add list selection handler.
        jlst.addListSelectionListener(this);

        // Add the components to the content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Display the frame
        jfrm.setVisible(true);
    }

    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        // Get the index of the changed item.
        int idx = jlst.getSelectedIndex();

        // Display selection, if item was selected.
        if (idx != -1)
            jlab.setText(definitions[idx]);
        else // Otherwise, reprompt.
            jlab.setText("Please choose a command");
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelpGUI();
            }
        });
    }
}

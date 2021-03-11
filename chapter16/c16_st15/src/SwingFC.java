/*
 * 15. Add a check box to the file comparer developed in Try This 16-1 that has the following text:
 * Show position of mismatch. When this box is checked, have the program display the location of the
 * first point in the files at which a mismatch occurs.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {
    JTextField jtfFirst; // holds the first file name
    JTextField jtfSecond; // holds the second file name

    JButton jbtnComp; // button to compare the files
    JCheckBox jchkMismatch;

    JLabel jlabFirst; // displays prompts
    JLabel jlabSecond;
    JLabel jlabResult; // display results and error messages

    SwingFC() {
        // Create a new JFrame container.
        var jfrm = new JFrame("Compare Files");

        // Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(230, 250);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text fields for the files names.
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // Set the action commands for the text fields.
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        // Create the Compare button.
        jbtnComp = new JButton("Compare");

        jchkMismatch = new JCheckBox("Show position of mismatch");

        // Add action listener for the Compare button.
        jbtnComp.addActionListener(this);

        // Create the labels.
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        // Add the components to the content pane.
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jchkMismatch);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        // Display the frame.
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i = 0;
        int j = 0;
        int ln = 1;
        int col = 1;

        // First, confirma that both file names have
        // been entered.
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }

        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }

        // Compare files. Use try-with-resources to manage the files.
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
                FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if (i != j)
                    break;
                col++;
                if (i == 10) {
                    ln++;
                    col = 1;
                }
            } while (i != -1 && j != -1);

            if (i != j) {
                String result = "<html>Files are not the same.";
                if (jchkMismatch.isSelected())
                    result += ("<br>Mismatch position:<br>line " + ln + ", column " + col);
                result += "</html>";
                jlabResult.setText(result);
            } else
                jlabResult.setText("Files compare equal.");
        } catch (IOException e) {
            jlabResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });
    }
}

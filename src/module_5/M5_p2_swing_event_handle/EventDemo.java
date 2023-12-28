package module_5.M5_p2_swing_event_handle;
// this is a program in Swing that is used to demonstrate the event handling mechanism of swing using two buttons and a label
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame {
    JLabel jlab;

    // Main constructor of the EventDemo class
    EventDemo() {

        // Set the frame title and set it to close when clicked on the close button
        JFrame jfrm = new JFrame("An Event example");

        // Set the frame layout to FlowLayout
        jfrm.setLayout(new FlowLayout()); 

        // Set the frame size to 220x90
        jfrm.setSize(220, 90);

        // Set the default operation when the frame is closed to exit the program
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Create an OK button
        JButton jbtOK = new JButton("OK");
        
        // Create a Cancel button
        JButton jbtCancel = new JButton("Cancel");

        // Add an ActionListener to the OK button to perform an action when the button is clicked
        jbtOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlab.setText("OK Button is clicked.");
            }
        });

        // Add an ActionListener to the Cancel button to perform an action when the button is clicked
        jbtCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Cancel Button is clicked.");
            }
        });

        // Add the buttons to the frame
        jfrm.add(jbtOK);
        jfrm.add(jbtCancel);

        // Create a label and add it to the frame
        jlab = new JLabel("Press a button!");
        jfrm.add(jlab);

        // Display the frame
        jfrm.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the EventDemo class
        new EventDemo();
    }
}
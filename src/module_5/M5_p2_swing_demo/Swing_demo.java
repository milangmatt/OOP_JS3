package module_5.M5_p2_swing_demo;
// simple program to demonstrate the Swing package using a JFrame and JLabel
import javax.swing.*;

public class Swing_demo {
    Swing_demo() {

        // Set title to the frame
        JFrame jfrm = new JFrame("A Simple Swing");

        // Set the size of the JFrame
        jfrm.setSize(275, 100);

         // Set the default close operation for the JFrame
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the text message
        JLabel jlab = new JLabel("Hello welcome to a simple swing program");

         // Add the JLabel to the JFrame
        jfrm.add(jlab);

        // Make the JFrame visible
        jfrm.setVisible(true);
    }
    public static void main(String args[]) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 // Create a new instance of the Swing_demo class
                new Swing_demo();
            }
        });
    }
}

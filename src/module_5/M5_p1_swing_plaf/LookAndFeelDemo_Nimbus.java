package module_5.M5_p1_swing_plaf;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookAndFeelDemo_Nimbus {
    private JFrame frame;

    public LookAndFeelDemo_Nimbus() {
        

        // Create the frame
        frame = new JFrame("Single PLAF Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with dummy components
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Hello, Swing!");

        panel.add(button);
        panel.add(label);
        // Set the Look and Feel to Metal
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            // Update the UI with the new Look and Feel
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        // Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the Swing application on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new LookAndFeelDemo_Nimbus().display());
    }
}

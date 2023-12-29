package module_5.M5_p4_Layouts;

import javax.swing.*;
import java.awt.*;


public class GridBagLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {           
                 new GridBagLayoutExample().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);

        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        // Add components to the panel using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(ageLabel, gbc);

        gbc.gridx = 1;
        panel.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        gbc.gridy = 3;
        panel.add(cancelButton, gbc);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}


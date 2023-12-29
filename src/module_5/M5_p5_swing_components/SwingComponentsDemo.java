package module_5.M5_p5_swing_components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SwingComponentsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SwingComponentsDemo().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels for different components
        JPanel labelPanel = createLabelPanel("Label Panel");
        JPanel buttonPanel = createButtonPanel("Button Panel");
        JPanel toggleButtonPanel = createToggleButtonPanel("Toggle Button Panel");
        JPanel checkBoxPanel = createCheckBoxPanel("Checkbox Panel");
        JPanel radioButtonPanel = createRadioButtonPanel("Radio Button Panel");
        JPanel textFieldPanel = createTextFieldPanel("Text Field Panel");
        JPanel listPanel = createListPanel("List Panel");
        JPanel comboBoxPanel = createComboBoxPanel("Combo Box Panel");

        // Set layout for the main frame
        frame.setLayout(new GridLayout(4, 2));

        // Add panels to the main frame
        frame.add(labelPanel);
        frame.add(buttonPanel);
        frame.add(toggleButtonPanel);
        frame.add(checkBoxPanel);
        frame.add(radioButtonPanel);
        frame.add(textFieldPanel);
        frame.add(listPanel);
        frame.add(comboBoxPanel);

        // Set frame properties
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    private JPanel createLabelPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(panelName);
        panel.add(label);
        return panel;
    }

    private JPanel createButtonPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Event: Button Clicked!");
            }
        });
        panel.add(label);
        panel.add(button);
        return panel;
    }

    private JPanel createToggleButtonPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (toggleButton.isSelected()) {
                    label.setText("Event: Toggle Button Selected");
                } else {
                    label.setText("Event: Toggle Button Deselected");
                }
            }
        });
        panel.add(label);
        panel.add(toggleButton);
        return panel;
    }

    private JPanel createCheckBoxPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");
        ItemListener checkBoxListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String eventText = "Event: ";
                if (checkBox1.isSelected()) {
                    eventText += "Option 1 selected ";
                }
                if (checkBox2.isSelected()) {
                    eventText += "Option 2 selected ";
                }
                if (checkBox3.isSelected()) {
                    eventText += "Option 3 selected";
                }
                label.setText(eventText);
            }
        };
        checkBox1.addItemListener(checkBoxListener);
        checkBox2.addItemListener(checkBoxListener);
        checkBox3.addItemListener(checkBoxListener);
        panel.add(label);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        return panel;
    }

    private JPanel createRadioButtonPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        ItemListener radioButtonListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (radioButton1.isSelected()) {
                    label.setText("Event: Option 1 selected");
                } else if (radioButton2.isSelected()) {
                    label.setText("Event: Option 2 selected");
                } else if (radioButton3.isSelected()) {
                    label.setText("Event: Option 3 selected");
                }
            }
        };
        radioButton1.addItemListener(radioButtonListener);
        radioButton2.addItemListener(radioButtonListener);
        radioButton3.addItemListener(radioButtonListener);
        panel.add(label);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        return panel;
    }

    private JPanel createTextFieldPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        JTextField textField = new JTextField(10);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Event: Text Entered - " + textField.getText());
            }
        });
        panel.add(label);
        panel.add(textField);
        return panel;
    }

    private JPanel createListPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        String[] data = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(data);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                label.setText("Event: Item Selected - " + list.getSelectedValue());
            }
        });
        panel.add(label);
        panel.add(new JScrollPane(list));
        return panel;
    }

    private JPanel createComboBoxPanel(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Event: ");
        String[] data = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(data);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Event: Option Selected - " + comboBox.getSelectedItem());
            }
        });
        panel.add(label);
        panel.add(comboBox);
        return panel;
    }
}

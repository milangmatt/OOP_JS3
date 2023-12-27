package module_4.M4_p5_awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class AWTFrameExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Frame Example");

        // Create a panel for the top part (label and text field)
        Panel topPanel = new Panel();
        Label label = new Label("Enter something:");
        TextField textField = new TextField(20); // 20 columns
        topPanel.add(label);
        topPanel.add(textField);

        // Create a panel for the bottom part (three buttons)
        Panel bottomPanel = new Panel();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        bottomPanel.add(button1);
        bottomPanel.add(button2);
        bottomPanel.add(button3);

        // Add panels to the frame
        frame.add(topPanel, "North"); // "North" indicates the top part
        frame.add(bottomPanel, "South"); // "South" indicates the bottom part

        // Set the size of the frame
        frame.setSize(400, 100);
    

        // Make the frame visible
        frame.setVisible(true);
    }
}

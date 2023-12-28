package module_5.M5_p4_Layouts;
//this is a example program to demonstrate the alignment options of FlowLayout
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create five panels with FlowLayout and different alignment values using the createPanel() method which is user defined
        createPanel(frame, "Left Alignment", FlowLayout.LEFT);
        createPanel(frame, "Center Alignment", FlowLayout.CENTER);
        createPanel(frame, "Right Alignment", FlowLayout.RIGHT);
        createPanel(frame, "Leading Alignment", FlowLayout.LEADING);
        createPanel(frame, "Trailing Alignment", FlowLayout.TRAILING);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void createPanel(JFrame frame, String title, int alignment) {
        //creates a panel
        JPanel panel = new JPanel();
        //sets a border layout with the title
        panel.setBorder(BorderFactory.createTitledBorder(title));
        //sets the alignment
        panel.setLayout(new FlowLayout(alignment));

        // Add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JLabel("Label"));

        // adding panel to frame
        frame.add(panel);
    }
}

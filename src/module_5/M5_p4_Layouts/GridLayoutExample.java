package module_5.M5_p4_Layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setLayout(new GridLayout(4, 4));

        // Create buttons and add them to the frame
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                JButton button = new JButton("(" + row + "," + col + ")");
                frame.add(button);
            }
        }

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


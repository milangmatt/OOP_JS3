package module_5.M5_p4_Layouts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    private JPanel cardsPanel;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new CardLayoutExample().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardsPanel = new JPanel();
        cardLayout = new CardLayout();
        cardsPanel.setLayout(cardLayout);

        // Create cards with buttons
        for (int i = 1; i <= 5; i++) {
            JPanel card = createCardPanel("Card " + i);
            cardsPanel.add(card, "Card" + i);
        }

        // Add components to the main frame
        frame.add(cardsPanel, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private JPanel createCardPanel(String labelText) {
        JPanel card = new JPanel(new BorderLayout());

        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardsPanel);
            }
        });

        JLabel label = new JLabel(labelText);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        card.add(nextButton, BorderLayout.CENTER);
        card.add(label, BorderLayout.SOUTH);

        return card;
    }
}

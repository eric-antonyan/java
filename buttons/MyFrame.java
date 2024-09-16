import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {
    JButton button;
    JLabel label;

    MyFrame() {
        // Create and set up the label
        label = new JLabel();
        label.setText("Show text");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVisible(true);

        // Create and set up the button
        button = new JButton();
        button.setBackground(new Color(0x333333));
        button.setText("Hide Text");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleLabelVisibility();
            }
        });
        button.setBounds(140, 500, 250, 100);
        button.setFont(new Font("SF Pro Display", Font.BOLD, 20));
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.setBorder(null);

        // Set up the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    private void toggleLabelVisibility() {
        if (label.isVisible()) {
            button.setText("Show Text");
        } else {
            button.setText("Hide Text");
        }
        label.setVisible(!label.isVisible());
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class MyFrame extends JFrame {
    JButton button;
    JPanel panel;

    MyFrame() {
        new JPanel();
        button = new JButton();
        button.setBackground(new Color(0x333333));
        button.setText("Add to favorites");
        button.addActionListener(e -> this.actionPerformed(e));
        button.setBounds(100, 100, 250, 100);
        button.setFont(new Font("SF Pro Display", Font.BOLD, 20));
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.setBorder(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = button.getText();
            System.out.println(text);
        }
    }
}

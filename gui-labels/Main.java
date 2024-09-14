import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("react.png");
        Border border = BorderFactory.createLineBorder(Color.pink, 2);

        label.setText("Bro, do you even code?");
        label.setIcon(icon);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0xff0000));
        label.setFont(new Font("SF Pro Display", Font.BOLD, 20));

        label.setIconTextGap(-25);

        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setBorder(border);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        label.setBounds(0, 0, 1200 / 2, 700 / 2);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // frame.setSize(1200, 700);
        frame.setResizable(true);
        frame.setTitle("Title");
        // frame.setLayout(null);
        frame.setVisible(true);

        frame.add(label);
        frame.pack();
    }
}
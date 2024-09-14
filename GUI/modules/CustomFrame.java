package modules;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CustomFrame {
    public CustomFrame() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("assets/logo.webp");

        frame.setSize(420, 420);
        frame.setTitle("Eric Antonyan's title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(0xff0000));
    }
}

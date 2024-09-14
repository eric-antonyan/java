import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(0, 0, 250, 250);

        JPanel slatePanel = new JPanel();

        slatePanel.setBackground(Color.DARK_GRAY);
        slatePanel.setBounds(250, 0, 750 - 250, 250);

        JPanel grayPanel = new JPanel();

        grayPanel.setBackground(Color.GRAY);
        grayPanel.setBounds(0, 250, 750, 750 - 250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(blackPanel);
        frame.add(slatePanel);
        frame.add(grayPanel);
    }
}
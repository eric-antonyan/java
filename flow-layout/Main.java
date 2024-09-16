import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        StringBuilder input = new StringBuilder();

        JPanel header = new JPanel();
        header.setLayout(new BorderLayout());
        header.setPreferredSize(new Dimension(100, 100));

        JLabel label = new JLabel();
        header.add(label, BorderLayout.EAST);

        label.setText(input.toString());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("SF Pro Display", Font.BOLD, 20));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        Integer[] buttonValues = { 1, 2, 3, 4, 5, 6, 7, 8 };

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(250, 250));

        for (Integer buttonValue : buttonValues) {
            JButton button = new JButton();
            button.setText(buttonValue.toString());
            button.addActionListener((e) -> {
                input.append(Integer.parseInt(button.getText()));
                label.setText(input.toString());
            });
            panel.add(button);
        }

        frame.add(header, BorderLayout.NORTH);
        frame.add(panel);
    }
}
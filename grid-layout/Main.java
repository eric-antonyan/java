import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.script.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        StringBuilder input = new StringBuilder();

        JPanel header = new JPanel();
        header.setLayout(new BorderLayout());
        header.setPreferredSize(new Dimension(100, 100));

        LineBorder borderHeader = new LineBorder(Color.GRAY, 15);

        JLabel label = new JLabel();
        header.add(label, BorderLayout.EAST);
        header.setBorder(borderHeader);
        header.setBackground(Color.GRAY);

        label.setForeground(Color.WHITE);
        label.setText(input.toString());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("SF Pro Display", Font.BOLD, 30));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setTitle("Simple Calculator");

        String[] buttonValues = { "1", "2", "3", "+", "5", "6", "7", "-", "9", "0", "*", "/", "=", "(", ")", "DEL" };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.WHITE);
        LineBorder borderPanel = new LineBorder(Color.WHITE, 15);
        panel.setBorder(borderPanel);
        panel.setPreferredSize(new Dimension(250, 250));

        // for (Integer buttonValue : buttonValues) {
        // JButton button = new JButton();
        // button.setText(buttonValue.toString());
        // button.addActionListener((e) -> {
        // input.append(Integer.parseInt(button.getText()));
        // label.setText(input.toString());
        // });
        // panel.add(button);
        // }

        frame.add(header, BorderLayout.NORTH);
        // frame.add(panel);

        for (String buttonValue : buttonValues) {
            JButton button = new JButton();
            button.setText(buttonValue.toString());
            button.setPreferredSize(new Dimension(15, 15));
            button.setFont(new Font("SF Prop Display", Font.BOLD, 20));
            button.setBorder(null);
            button.setFocusable(false);
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));

            if (buttonValue == "=") {
                button.setBackground(Color.ORANGE);
            } else {
                button.setBackground(new Color(0x333333));
            }

            button.setForeground(Color.WHITE);

            button.addActionListener((e) -> {
                if (buttonValue == "DEL") {
                    input.deleteCharAt(input.length() - 1);
                    label.setText(input.toString());
                } else if (buttonValue.toString() != "=") {
                    input.append(buttonValue);
                    label.setText(input.toString());
                } else {
                    ScriptEngineManager manager = new ScriptEngineManager();

                    ScriptEngine engine = manager.getEngineByName("JavaScript");

                    try {
                        label.setText(engine.eval(input.toString()).toString());
                        input.setLength(0);
                        input.append(label.getText());
                    } catch (ScriptException e1) {
                        JOptionPane.showMessageDialog(null, "Expression is invalid!", "Simple Calculator",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            panel.add(button);
        }

        frame.add(panel);
    }
}
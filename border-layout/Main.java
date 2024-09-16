import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(500, 500);
        frame.setVisible(true);

        JPanel header = new JPanel();
        JPanel footer = new JPanel();
        JPanel leftSidebar = new JPanel();
        JPanel rightSidebar = new JPanel();
        JPanel main = new JPanel();

        header.setBackground(Color.RED);
        footer.setBackground(Color.MAGENTA);
        leftSidebar.setBackground(Color.ORANGE);
        rightSidebar.setBackground(Color.BLUE);
        main.setBackground(Color.GREEN);

        header.setPreferredSize(new Dimension(100, 100));
        footer.setPreferredSize(new Dimension(100, 100));
        leftSidebar.setPreferredSize(new Dimension(100, 100));
        rightSidebar.setPreferredSize(new Dimension(100, 100));
        main.setPreferredSize(new Dimension(100, 100));

        JLabel label = new JLabel();
        label.setText("Good day, Eric!");
        label.setHorizontalTextPosition(JLabel.CENTER);

        main.add(label);

        frame.add(header, BorderLayout.NORTH);
        frame.add(footer, BorderLayout.SOUTH);
        frame.add(leftSidebar, BorderLayout.WEST);
        frame.add(rightSidebar, BorderLayout.EAST);
        frame.add(main, BorderLayout.CENTER);

        System.out.println();
    }
}
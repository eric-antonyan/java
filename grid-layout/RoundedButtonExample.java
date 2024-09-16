import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoundedButtonExample {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Rounded Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create the rounded button
        RoundedButton roundedButton = new RoundedButton("Click Me");

        // Add an ActionListener to the button
        roundedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Rounded Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(roundedButton);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Custom rounded button class
    static class RoundedButton extends JButton {
        private static final int BORDER_RADIUS = 15;

        public RoundedButton(String text) {
            super(text);
            setContentAreaFilled(false);
            setFocusPainted(false);
            setBorderPainted(false);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isArmed()) {
                g.setColor(Color.LIGHT_GRAY);
            } else {
                g.setColor(getBackground());
            }

            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), BORDER_RADIUS, BORDER_RADIUS);

            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            // Optionally paint the border with rounded corners
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.DARK_GRAY);
            g2d.setStroke(new BasicStroke(2));
            g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, BORDER_RADIUS, BORDER_RADIUS);
        }

        @Override
        public Dimension getPreferredSize() {
            Dimension size = super.getPreferredSize();
            size.width += BORDER_RADIUS * 2;
            size.height += BORDER_RADIUS * 2;
            return size;
        }
    }
}

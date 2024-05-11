package bank.management.system;

import javax.swing.*;
import java.awt.*;

class TransparentTextField extends JTextField {
    public TransparentTextField(int columns) {
        super(columns);
        setOpaque(false); // Set the text field to be transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBackground().getAlpha() < 255) {
            // If transparent, fill the background manually to show transparency
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(getBackground());
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
        }
        super.paintComponent(g);
    }
}



package telas;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private Image backgroundImage;
    private boolean isBackground;

    public RoundedPanel(int radius, boolean isBackground) {
        this.isBackground = isBackground;
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
        if (isBackground) {
            try {
                backgroundImage = new ImageIcon(getClass().getResource("/images/cr72.jpg")).getImage();
            } catch (Exception e) {
                System.err.println("Erro ao carregar a imagem de fundo: " + e.getMessage());
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (isBackground && backgroundImage != null) {
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }

        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
        g2d.dispose();
    }
}
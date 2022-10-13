import java.awt.*;
import javax.swing.*;

public class GUI extends JPanel
{
    public void paintComponent(Graphics g)
    {
        this.setBackground(new java.awt.Color(170, 170, 220));
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 100);

    }
    
}


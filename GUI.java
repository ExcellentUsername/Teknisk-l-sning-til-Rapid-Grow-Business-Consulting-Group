import java.awt.*;
import javax.swing.*;

public class GUI extends JPanel
{
    JButton Convert = new JButton();
    JTextArea txtInput = new JTextArea(40,60);
    JTextArea txtOutput = new JTextArea(40,60);

    BorderLayout borderLayout1 = new BorderLayout(10,5);

    public void paintComponent(Graphics g)
    {
        this.setBackground(new java.awt.Color(170, 170, 220));
        
        // super.paintComponent(g);
        
        //layout
        this.setLayout(borderLayout1);
        this.add(Convert, BorderLayout.CENTER);
        this.add(txtInput, BorderLayout.EAST);
        this.add(txtOutput, BorderLayout.WEST);
      
      
    }
}



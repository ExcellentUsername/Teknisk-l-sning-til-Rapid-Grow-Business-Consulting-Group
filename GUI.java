import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class GUI extends JPanel
{
    JButton Convert = new JButton();
    JTextArea txtInputarea = new JTextArea("Input");
    JScrollPane txtInput = new JScrollPane(txtInputarea);
    JTextArea txtOutputarea = new JTextArea("Output");
    JScrollPane txtOutput = new JScrollPane(txtOutputarea);
    JLabel top = new JLabel("businefyer 1000");
    BorderLayout borderLayout1 = new BorderLayout();

    public void paintComponent()
    {
        Color color = new java.awt.Color(200, 200, 220);
        this.setBackground(color);
        txtInput.setPreferredSize(new Dimension(300, 300));
        txtInput.setBorder(new LineBorder(color, 10));
        txtInput.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtOutput.setPreferredSize(new Dimension(300, 300));
        txtOutput.setBorder(new LineBorder(color, 10));
        txtOutput.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        txtOutputarea.setEditable(false);

        Convert.setText("businefy");
        Convert.setPreferredSize(new Dimension(100, 20));
        Convert.setBorder(new LineBorder(color, 10));
       
        top.setHorizontalAlignment(JLabel.CENTER);
        top.setPreferredSize(new Dimension(10,50));

        //layout
        this.setLayout(borderLayout1);
        this.add(Convert, BorderLayout.CENTER);
        this.add(txtInput, BorderLayout.WEST);
        this.add(txtOutput, BorderLayout.EAST);
        this.add(top, BorderLayout.NORTH);
    }


     void setInput(File inputTekst) throws IOException
    {
        txtInputarea.setText(new String(Files.readAllBytes(Paths.get(inputTekst.getPath())), "UTF-8"));
    }

    void setOutput(String Output)
    {
        txtOutputarea.setText(Output);
    }
}



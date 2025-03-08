package Jframe;

import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {
    public MainCanvas(int w, int h) {
        setLayout(new GridLayout(2, 2));
        setPreferredSize(new Dimension(w, h));

        // new codeing function 
        // add(new GridCanvas(1));
        // add(new GridCanvas(2));
        // add(new GridCanvas(3));
        // add(new GridCanvas(4));

    }

    public MainCanvas() {
        this(600, 600);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the cross lines
        g.drawLine(0, 300, 600, 300);  // Horizontal line
        g.drawLine(300, 0, 300, 600);  // Vertical line
        
        // // Draw the oval
        g.drawOval(100, 100, 400, 400);  // Outline of the oval

        // Set colors and fill the four quarters of the circle
        g.setColor(new Color(0,255,255,255)); // Top-left quarter
        g.fillArc(100, 100, 400, 400, 0, 90);
        
        g.setColor(new Color(255,171,173,255));
        g.fillArc(100, 100, 400, 400, 90, 90);
       
        g.setColor(new Color( 0,255,0,255)); // Bottom-right quarter
        g.fillArc(100, 100, 400, 400, 180, 90);
        
        g.setColor(new Color(255,255,0,255)); // Bottom-left quarter
        g.fillArc(100, 100, 400, 400, 270, 90);
    }
}

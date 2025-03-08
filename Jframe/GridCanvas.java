package Jframe;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GridCanvas extends JPanel {
    private int id;

    public GridCanvas(int id, int w, int h) {
        setPreferredSize(new Dimension(w, h));
        this.id = id;
    }

    public GridCanvas(int id) {
        this(id, 300, 300);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.BOLD, 20));

        // Define circle position and size
        int x = 100, y = 100, width = 400, height = 400;

        switch (id) {
            case 1:
                // Top-left quadrant
                g.drawString("Q1", 25, 25);  
                g.setColor(Color.BLACK);
                g.drawLine(300,0,300,300);
                g.drawArc(x, y, width, height, 90, 90);  // Quarter circle
                g.drawLine(0,300,300,300);
                g.setColor(Color.PINK);
                g.fillArc(100,100, 400,400, 90, 90);  // Fill top-left quarter
                break;

            case 2:
                // Top-right quadrant
                g.drawString("Q2", 255, 25);  // Position it at the top right
                g.setColor(Color.BLACK);
                // g.translate(-300, 0);  // Move to the top-right
                g.drawArc(-200, 100, 400,400, 0, 90);  // Quarter circle
                g.drawLine(0,0,0,300);
                g.drawLine(0,300,300,300);
                g.setColor(Color.CYAN);
                g.fillArc(-200, 100, 400,400, 0, 90);  // Fill top-right quarter
                break;

            case 3:
              
                break;

            case 4:
               
                break;

            default:
                break;
        }
    }
}

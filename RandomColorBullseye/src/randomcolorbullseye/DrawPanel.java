package randomcolorbullseye;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radius = 500;
        int width = getWidth();
        int height = getHeight();
        
        int w = getSize().width - 5;
        int h = getSize().height -5;
        
        g.drawOval(15, 15, radius, radius);
        
    }
}

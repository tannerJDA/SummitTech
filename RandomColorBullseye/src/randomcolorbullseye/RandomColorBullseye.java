package randomcolorbullseye;

import javax.swing.JFrame;

public class RandomColorBullseye {
    
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame frame = new JFrame();
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
    
}

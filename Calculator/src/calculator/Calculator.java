package calculator;

/**
 * @author Tanner Armstrong
 * @version
 */
import javax.swing.*;
import java.awt.*;
import java.lang.Math.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Calculator extends JFrame{
    private JLabel headerL, oneL, twoL, threeL, finalL;
    private JTextField oneTF, twoTF, threeTF, finalTF;
    private JButton oneB, twoB, threeB, exitB, addB;
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    
    private AddButtonHandler abHandler;
    private ExitButtonHandler ebHandler;
    
    public Calculator(){
        //labels
        headerL = new JLabel("BasketBall Score Calculator", SwingConstants.CENTER);
        oneL = new JLabel("Enter Number of Free Throws", SwingConstants.RIGHT);
        twoL = new JLabel("Enter Number of 2 Point Shots", SwingConstants.RIGHT);
        threeL = new JLabel("Enter Number of 3 Point Shots", SwingConstants.RIGHT);
        finalL = new JLabel("Final Score", SwingConstants.RIGHT);
        
        //text fields
        oneTF = new JTextField(3);
        twoTF = new JTextField(3);
        threeTF = new JTextField(3);
        finalTF = new JTextField(4);
        
        //buttons
        addB = new JButton ("+");
        adHandler = new AddButtonHandler();
        addB.addActionListener(abHandler);
        
        exitB - new JButton("Exit");
        ebHandler - new ExitButtonHandler();
        exitB.addActionListener(ebHandler);
        
        setTitle("Basketball Score Calc");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(6,2));
        
        
    }
    
    public static void main(String[] args) {

    }
}

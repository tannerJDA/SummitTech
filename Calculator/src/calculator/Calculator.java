package calculator;

import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static java.lang.Math.*;

public class Calculator extends JFrame
{
   private JLabel headerL, header2L, oneL, twoL, threeL, finalL;
   private JTextField oneTF, twoTF, threeTF, finalTF;
   private JButton exitB, addB;
   
   private AddButtonHandler abHandler;
   private ExitButtonHandler ebHandler;
   
   private static final int WIDTH = 400;
   private static final int HEIGHT = 300;
   
   public Calculator()
   {
   
    headerL = new JLabel("BB Score Calc", SwingConstants.CENTER);
    header2L = new JLabel("    ", SwingConstants.CENTER);
    oneL = new JLabel("Enter Number of Free Throws",SwingConstants.RIGHT);
    twoL = new JLabel("Enter Number of 2 Point Shots",SwingConstants.RIGHT);
    threeL = new JLabel("Enter Number of 3 Point Shots",SwingConstants.RIGHT);
    finalL = new JLabel("Final Score",SwingConstants.RIGHT);
    
    //create new text fields
<<<<<<< HEAD
    oneTF = new JTextField(4);
    twoTF = new JTextField(4);
    threeTF = new JTextField(4);
    finalTF = new JTextField(5);
=======
    oneTF = new JTextField(3);
    twoTF = new JTextField(3);
    threeTF = new JTextField(3);
    finalTF = new JTextField(4);
>>>>>>> 103632ef3d2b81ace7393e08212d70b22d50d93f
 
    //create buttons
    addB = new JButton("+");
    abHandler = new AddButtonHandler();
    addB.addActionListener(abHandler);
    
    exitB = new JButton("Exit");
    ebHandler = new ExitButtonHandler();
    exitB.addActionListener(ebHandler);
    
    setTitle("Basketball Score Calc");
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(6,2));
    
    pane.add(headerL);
    pane.add(header2L);
    pane.add(oneL);
    pane.add(oneTF);
    pane.add(twoL);
    pane.add(twoTF);
    pane.add(threeL);
    pane.add(threeTF);
    pane.add(finalL);
    pane.add(finalTF);
    pane.add(addB);
    pane.add(exitB);
    
    setSize (WIDTH, HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
   
<<<<<<< HEAD
   
=======
>>>>>>> 103632ef3d2b81ace7393e08212d70b22d50d93f
    private class AddButtonHandler implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        int one, two, three, finalScore;
<<<<<<< HEAD
        
        one = Integer.parseInt(oneTF.getText());
        two = Integer.parseInt(twoTF.getText());
        three = Integer.parseInt(threeTF.getText());
        
        finalScore = (one * 1) + (two * 2) + (three * 3);
        
=======
        
        one = Integer.parseInt(oneTF.getText());
        two = Integer.parseInt(twoTF.getText());
        three = Integer.parseInt(threeTF.getText());
        
        finalScore = (one * 1) + (two * 2) + (three * 3);
>>>>>>> 103632ef3d2b81ace7393e08212d70b22d50d93f
        finalTF.setText(""+String.format("%d",finalScore));
        
        }
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 103632ef3d2b81ace7393e08212d70b22d50d93f
    private class ExitButtonHandler implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
        }
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 103632ef3d2b81ace7393e08212d70b22d50d93f
    public static void main(String[] args)
    {
        Calculator bbcalc = new Calculator();
    }
}
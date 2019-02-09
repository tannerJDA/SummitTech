package radical.calculator;

import javax.swing.JFrame;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
<<<<<<< HEAD
=======
import javax.swing.Timer;
import java.awt.Color;
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72

//importing all of awt because i don't know what part i need
import java.awt.*;

public class RadicalCalculator extends JFrame {
    private JLabel topHead, topHead2, firstInL, secondInL, outLabel, functionLabel, functionLabel2;
    private JTextField firstInTF, secondInTF, outputTF;
<<<<<<< HEAD
    private JButton addBut, subBut, multBut, divBut, sq1But, sq2But, log1But, log2But, exitBut, clearBut;
=======
    private JButton addBut, subBut, multBut, divBut, sq1But, sq2But, partyBut, log2But, exitBut, clearBut;
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
    
    //all of the freaking button handlers
    private AddButtonHandler addHandler;
    private SubButtonHandler subHandler;
    private MultiplyButtonHandler multHandler;
    private DivisionButtonHandler divHandler;
    private SquareOneButtonHandler sq1Handler;
    private SquareTwoButtonHandler sq2Handler;
<<<<<<< HEAD
    private LogorithmOneButtonHandler log1Handler;
=======
    private PartyButtonHandler partyHandler;
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
    private LogorithmTwoButtonHandler log2Handler;
    private ExitButtonHandler exitHandler;
    private ClearButtonHandler clearHandler;
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 500;
    
<<<<<<< HEAD
=======
    Container pane = getContentPane();

    
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
    public RadicalCalculator(){
        //labeling the labels
        topHead = new JLabel("Radical Calculator", SwingConstants.CENTER);
        topHead2 = new JLabel(" ");
        firstInL = new JLabel("Input First Number", SwingConstants.RIGHT);
        secondInL = new JLabel("Input Second Number", SwingConstants.RIGHT);
        outLabel = new JLabel("Output -->", SwingConstants.RIGHT);
        functionLabel = new JLabel("Functions", SwingConstants.CENTER);
        functionLabel2 = new JLabel(" ");
        
        //initiating the text fields
        firstInTF = new JTextField(4);
        secondInTF = new JTextField(4);
        outputTF = new JTextField(6);
        
        //makin some buttons
        addBut = new JButton("+");
        addHandler = new AddButtonHandler();
        addBut.addActionListener(addHandler);
        
        subBut = new JButton("-");
        subHandler = new SubButtonHandler();
        subBut.addActionListener(subHandler);
        
        multBut = new JButton("x");
        multHandler = new MultiplyButtonHandler();
        multBut.addActionListener(multHandler);
        
        divBut = new JButton("/");
        divHandler = new DivisionButtonHandler();
        divBut.addActionListener(divHandler);
        
        sq1But = new JButton("Sq 1st");
        sq1Handler = new SquareOneButtonHandler();
        sq1But.addActionListener(sq1Handler);
        
        sq2But = new JButton("Sq 2nd");
        sq2Handler = new SquareTwoButtonHandler();
        sq2But.addActionListener(sq2Handler);
        
<<<<<<< HEAD
        log1But = new JButton("Log 1st");
        log1Handler = new LogorithmOneButtonHandler();
        log1But.addActionListener(log1Handler);
=======
        partyBut = new JButton("Party");
        partyHandler = new PartyButtonHandler();
        partyBut.addActionListener(partyHandler);
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        
        log2But = new JButton("Log 2nd");
        log2Handler = new LogorithmTwoButtonHandler();
        log2But.addActionListener(log2Handler);
        
        exitBut = new JButton("EXIT");
        exitHandler = new ExitButtonHandler();
        exitBut.addActionListener(exitHandler);
        
        clearBut = new JButton("Clear");
        clearHandler = new ClearButtonHandler();
        clearBut.addActionListener(clearHandler);
        
        setTitle("Tanner's Radical Calculator");
<<<<<<< HEAD
        Container pane = getContentPane();
=======
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        pane.setLayout(new GridLayout(10,2));
        
        pane.add(topHead);
        pane.add(topHead2);
        pane.add(firstInL);
        pane.add(firstInTF);
        pane.add(secondInL);
        pane.add(secondInTF);
        pane.add(outLabel);
        pane.add(outputTF);
        pane.add(functionLabel);
        pane.add(functionLabel2);
        pane.add(addBut);
        pane.add(subBut);
        pane.add(multBut);
        pane.add(divBut);
        pane.add(sq1But);
        pane.add(sq2But);
<<<<<<< HEAD
        pane.add(log1But);
=======
        pane.add(partyBut);
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        pane.add(log2But);
        pane.add(exitBut);
        pane.add(clearBut);
        
<<<<<<< HEAD
=======
        
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private class AddButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = one + two;
            outputTF.setText("" + String.format("%.0f", out));            
        }
    }
    
    private class SubButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = one - two;
            outputTF.setText("" + String.format("%.0f", out));
        }
    }
    
    private class MultiplyButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = one * two;
            outputTF.setText("" + String.format("%.0f", out));
        }
    }
    
    private class DivisionButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = one / two;
            outputTF.setText("" + String.format("%.0f", out));
        }
    }
    
    private class SquareOneButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
            double one = Double.parseDouble(firstInTF.getText());
            
            double out = one * one;
            outputTF.setText("" + String.format("%.0f", out));
=======
                 for(int x = 0; x < 10; x++){
                 pane.setBackground(Color.RED);
                 pane.setBackground(Color.BLUE);
            }
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        }
    }
    
    private class SquareTwoButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = two * two;
            outputTF.setText("" + String.format("%.0f", out));
        }   
    }
    
<<<<<<< HEAD
    private class LogorithmOneButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            double out;
            
            outputTF.setText("Function not working");
=======
    private class PartyButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double one = Double.parseDouble(firstInTF.getText());
            
            double out = Math.log(one);
            outputTF.setText("" + String.format("%.2f", out));
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        }
    }
    
    private class LogorithmTwoButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
<<<<<<< HEAD
            double two = Double.parseDouble(firstInTF.getText());
            double out;
            
            outputTF.setText("Function not working");
=======
            double two = Double.parseDouble(secondInTF.getText());
            
            double out = Math.log(two);
            outputTF.setText("" + String.format("%.2f", out));
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        }
    }
    
    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
    private class ClearButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstInTF.setText("");
            secondInTF.setText("");
            outputTF.setText("");
<<<<<<< HEAD
=======
            pane.setBackground(Color.WHITE);
>>>>>>> a0e2f169f25941a1bcd9d852bcf219b6a042fa72
        }
    }
    
    public static void main(String[] args) {
        RadicalCalculator calc = new RadicalCalculator();
    }
    
}

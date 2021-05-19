import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    //Swing objects setup
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subtractButton, multiplyButton, divideButton;
    JButton decimalButton, equalsButton, deleteButton, clearButton;
    JPanel panel;
    //Font Custimisation
    Font calcFont = new Font("Courier New", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    double operator;
    
    //Constructor
    Calculator() {
        //Frame 
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        //Screen for calculator output
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(calcFont);
        textfield.setEditable(false);
        //Action buttons
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("x");
        divideButton = new JButton("÷");
        decimalButton = new JButton(".");
        equalsButton = new JButton("=");
        deleteButton = new JButton("CE");
        clearButton = new JButton("AC");

        functionButtons[0] = addButton;
        functionButtons[1] = addButton;
        functionButtons[2] = addButton;
        functionButtons[3] = addButton;
        functionButtons[4] = addButton;
        functionButtons[5] = addButton;
        functionButtons[6] = addButton;
        functionButtons[7] = addButton;
        //Button creatioon loops
        //Action
        for(int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(calcFont);
            functionButtons[i].setFocusable(false);
        }
        //Numbers
        for(int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(calcFont);
            numberButtons[i].setFocusable(false);
        }

        deleteButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);

        frame.add(panel);
        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    //Running method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

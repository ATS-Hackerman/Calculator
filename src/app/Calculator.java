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

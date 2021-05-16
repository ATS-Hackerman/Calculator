import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    
    JFrame frame;
    JTextField tectfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subtractButton, multiplyButton, divideButton;
    JButton decimalButton, equalsButton, deleteButton, clearButton;
    JPanel panel;

    Font calcFont = new Font("Courier New", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    double operator;
    
    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(null);
        
        
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

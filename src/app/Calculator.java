package app;

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
    
    Calculator() {
        
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

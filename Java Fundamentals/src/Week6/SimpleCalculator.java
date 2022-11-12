package Week6;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *Define an inner member class named MyListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method.  The method should add two numbers from the textField1 and textField2 text fields and display the result in the textField3 text field. You may find the following methods useful:
 *
 * setText(String text): Sets the text of this TextComponent to the specified text.
 * getText(): Returns the text contained in this TextComponent.
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class SimpleCalculator extends JFrame {
    private JTextField textField1, textField2, textField3;
    private JButton addButton;
    public SimpleCalculator() {
        super( "Calculator" );
        setLayout(new FlowLayout());
        JLabel label1 = new JLabel("=");
        textField3 = new JTextField(4);
        textField1 = new JTextField(4);
        textField2 = new JTextField(6);
        addButton = new JButton("+");
        getContentPane().add(textField1);
        getContentPane().add(addButton);
        getContentPane().add(textField2);
        getContentPane().add(label1);
        getContentPane().add(textField3);
        addButton.addActionListener( new MyListener() );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 150);
        setVisible(true);
    }
    //complete this
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent e ) {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int sum = num1 + num2;
            textField3.setText("" + sum);
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {new SimpleCalculator();}
        });
    }
}
package Week6;

/**
 *Define an inner member class named MyListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method.
 * The method should generate six random numbers between 1 and 40 (inclusive) when the button is clicked.
 * The required number format is shown in the example below. You must use the rand object to generate the 6 random numbers.
 * The 6 numbers are separated with a single space in between. Note: the statement "int number = rand.nextInt(40)" generates a random number between 0 to 39 (inclusive).
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LottoDemo extends JFrame  {
    JTextField textField1;
    JButton pressButton;
    Random rand = new Random(30);
    public LottoDemo() {
        textField1 = new JTextField(10);
        pressButton = new JButton("RANDOM LOTTO NUMBERS");
        pressButton.addActionListener( new MyListener());
        JPanel p = new JPanel();
        p.add(textField1);
        p.add(pressButton);
        getContentPane().add(p);
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //complete this
    class MyListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            StringBuffer buf = new StringBuffer();
            for (int i=0; i<6; i++) {
                int number = rand.nextInt(40)+1;
                buf.append(number + " ");
            }
            textField1.setText(buf.toString());
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new LottoDemo(); }
        });
    }
}

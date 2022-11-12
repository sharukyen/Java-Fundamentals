package Week6;

/**
 *Define an inner member class named MyListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should do the following:
 *
 * When the user presses the 'PRESS ME' button for the first time, the JTextField displays "YOU RANG!".
 * When the user presses the button for the second time, the JTextField displays "NOT NOW!".
 * When the user presses the button for the third time, the JTextField displays "MAYBE LATER!"
 * When the user presses the button for the fourth time, the JTextField displays "YOU RANG!" and so on.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PressMeDemo extends JFrame  {
    JTextField textField1;
    JButton pressButton;
    String[] messages = new String[]{"YOU RANG!", "NOT NOW!", "MAYBE LATER!"};
    int count;
    public PressMeDemo() {
        textField1 = new JTextField(10);
        pressButton = new JButton("PRESS ME");
        pressButton.addActionListener( new MyListener());
        JPanel p = new JPanel();
        p.add(textField1);
        p.add(pressButton);
        getContentPane().add(p);
        setSize(180, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//complete this
class MyListener implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        textField1.setText(messages[count]);
        count = (count+1) % messages.length;
    }
}
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new PressMeDemo(); }
        });
    }
}

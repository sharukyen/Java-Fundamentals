package ListModel_TableModel;

/**
 *1. Define an inner member class named AddListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should do the following:
 *
 * Get the text entered in the text field. You may find the getText() method useful.
 * Add the given text into the list model. You may find the addElement(String value) useful.
 * 2. Define an inner member class named RemoveListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should do the following:
 *
 * Get the selected index from the list. You may find the getSelectedIndex() method useful.
 * Remove the selected element from the list model if the selected index is >-1. You may find the removeElementAt(int index) useful.
 */

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;


public class NumberListDemo extends JFrame  {
    private JList<String> numberList;
    DefaultListModel<String> listModel;
    JTextField numberTextField;
    JButton addButton, removeButton;

    public NumberListDemo() {
        listModel = new DefaultListModel<String>();
        listModel.addElement("One");
        listModel.addElement("Two");
        numberList = new JList<String>(listModel);
        JPanel input_panel = new JPanel();
        input_panel.add(new JLabel("Enter:"));
        numberTextField = new JTextField("Three");
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        addButton.addActionListener(new AddListener());
        removeButton.addActionListener(new RemoveListener());
        input_panel.add(numberTextField);
        input_panel.add(addButton);
        input_panel.add(removeButton);
        getContentPane().add(input_panel, BorderLayout.SOUTH);
        getContentPane().add(new JScrollPane(numberList), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }
//complete inner classes
   class AddListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
            String value = numberTextField.getText();
            listModel.addElement(value);
       }
}
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int index = numberList.getSelectedIndex();
            if (index != -1)
                listModel.removeElementAt(index);
        }
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new NumberListDemo();}
        });
    }
}


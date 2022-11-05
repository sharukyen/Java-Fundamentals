package ListModel_TableModel;

/**
 *This example creates a JTable using an instance of DefaultTableModel.
 * Define an inner member class named MyListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method.
 * The method increments all the number of years by 1 when the changeButton has been clicked.
 */

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
public class DefaultTableModelDemo extends JFrame  {
    DefaultTableModel defaultTableModel;
    JButton changeButton;

    public DefaultTableModelDemo() {
        Object[][] data = {
                {"Mary", "Campione",
                        "Snowboarding", 5, Boolean.FALSE},
                {"Alison", "Huml",
                        "Rowing", 3, Boolean.TRUE},
                {"Kathy", "Walrath",
                        "Chasing toddlers", 2, Boolean.FALSE},
                {"Mark", "Andrews",
                        "Speed reading", 20, Boolean.TRUE},
                {"Angela", "Lih",
                        "Teaching high school", 4, Boolean.FALSE}
        };
        String[] columnNames = {"First Name", "Last Name","Sport", "Number of Years ","Vegetarian"};
        defaultTableModel = new DefaultTableModel(data, columnNames);
        changeButton = new JButton("Change");
        changeButton.addActionListener(new MyListener());

        JTable table = new JTable(defaultTableModel);
        getContentPane().add(changeButton, BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    //complete the inner member class here
    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int row=0; row<defaultTableModel.getRowCount(); row++) {
                Integer years = (Integer) defaultTableModel.getValueAt(row, 3);
                defaultTableModel.setValueAt(years+1, row, 3);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {new DefaultTableModelDemo();}
        });
    }
}

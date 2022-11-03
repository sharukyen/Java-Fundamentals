package ListModel_TableModel;

/**
 *
 */

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;
import java.io.*;
class BookTableModel extends AbstractTableModel {
    private String[] columnNames = {"Title","Number of Pages"};
    private ArrayList<Book> bookList = new ArrayList<Book>();
    public BookTableModel() {}
    public int getColumnCount() { return columnNames.length;}
    public int getRowCount() { return bookList==null?0:bookList.size(); }
    public Object getValueAt(int row, int col) {
        if (col == 0)
            return bookList.get(row).getTitle();
        else if (col == 1)
            return bookList.get(row).getNumberOfPages();
        else return null;
    }
    public String getColumnName(int col) {return columnNames[col];}
    public void addRow(Book book) {
        int row = getRowCount();
        bookList.add(book);
        fireTableRowsInserted(row, row);
    }
    public void removeRow(int index) {
        bookList.remove(index);
        fireTableRowsDeleted(index, index);
    }
}
class BookTableDemo extends JFrame  {
    JTable table;
    BookTableModel tableModel;
    JButton addButton, removeButton;
    JTextField nameTextField, numberTextField;

    public BookTableDemo() {
        tableModel = new BookTableModel();
        table = new JTable(tableModel);
        Book[] books = new Book[]{new Book("The Midnight Library",304), new Book("The Book Thief",600), new Book("Cilka's Journey",448), new Book("Aroha", 240), new Book("Becoming", 464)};
        for (Book b: books) tableModel.addRow(b);
        nameTextField = new JTextField("Book Name");
        numberTextField = new JTextField("123");
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        addButton.addActionListener(new AddListener());
        removeButton.addActionListener(new RemoveListener());

        JPanel input_panel = new JPanel();
        input_panel.add(new JLabel("Enter:"));
        input_panel.add(nameTextField);
        input_panel.add(numberTextField);
        input_panel.add(addButton);
        input_panel.add(removeButton);
        getContentPane().add(input_panel, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            int num = Integer.parseInt(numberTextField.getText());
            tableModel.addRow(new Book(name, num));
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int index = table.getSelectedRow();
            if (index != -1)
                tableModel.removeRow(index);
        }
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new BookTableDemo(); }
        });
    }
}

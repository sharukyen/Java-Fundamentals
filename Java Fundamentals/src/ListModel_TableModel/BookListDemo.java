package ListModel_TableModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *Define a class named BookListModel<Book> which extends the AbstractListModel<Book> class and contains the following:
 *
 * A private ArrayList<Book> data field named bookList which defines an array list of books.
 * A no-arg constructor which creates an object. The constructor should create an empty array list.
 * A method named getSize() which returns the number of books in the list.
 * A method named getElementAt(int index) which returns the book at the specified index.
 * A method named addElement(Book element) which adds the specified element to the end of the list. The method should notify all registered listeners that a new book has been added to the list model by calling the fireIntervalAdded() method. The parameters of the method are listed below:
 * source: this (the object itself).
 * index0 and index1 are the index of the new book.
 * A method named removeElementAt(int index) which removes the book at the specified index from the list. The method should notify all registered listeners that a book has been removed by calling the fireIntervalRemoved() method. The parameters of the method are listed below:
 * source: this (the object itself)
 * index0 and index1 are the index of the given book.
 *
 * 1Define an inner member class named SelectListener which implements the ListSelectionListener interface and implements the valueChanged(ListSelectionEvent e) method. The valueChanged() method is called whenever the value of the selection changes. The method displays the title of the selected book from the JList. The method should complete the following:
 *
 * Get the selected value selected from the bookList by invoking the getSelectedValue() method.
 * Cast the selected object to Book and get the book title by invoking the getTitle() method.
 * Display the title in the nameTextField.
 *
 * 1. Define an inner member class named AddListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should do the following:
 *
 * Get the name entered in nameTextField and the page number entered in numberTextField. You may find the getText() method useful.
 * Create a new Book object
 * Add the newly created Book into the list model. You may find the addElement(Book b) useful.
 * 2. Define an inner member class named RemoveListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should do the following:
 *
 * Get the selected index from the list. You may find the getSelectedIndex() method useful.
 * Remove the selected book from the list model if the selected index is >-1. You may find the removeElementAt(int index) useful.
 */
class Book {
    private String title;
    private int numberOfPages;
    public Book(String title, int n) {
        this.title = title;
        numberOfPages = n;
    }
    public String getTitle() {return title;}
    public int getNumberOfPages() {return numberOfPages;}
    public String toString() { return String.format("%s(%d)", title, numberOfPages);}
}

class BookListModel<Book> extends AbstractListModel<Book> {

    ArrayList<Book> bookList;

    public BookListModel() {
        bookList = new ArrayList<Book>();
    }

    public int getSize() {
        return bookList.size();
    }

    public Book getElementAt(int index) {
        return bookList.get(index);
    }

    public void addElement(Book element) {
        bookList.add(element);
        int index = bookList.size() - 1;
        fireIntervalAdded(this, index, index);
    }

    public void removeElementAt(int index) {
        bookList.remove(index);
        fireIntervalRemoved(this, index, index);
    }
}

public class BookListDemo extends JFrame  {
    JList<Book> bookList;
    BookListModel<Book> listModel;
    JButton addButton, removeButton;
    JTextField nameTextField, numberTextField;

    public BookListDemo() {
        listModel = new BookListModel<Book>();
        bookList = new JList<Book>(listModel);
        Book[] books = new Book[]{new Book("The Midnight Library",304), new Book("The Book Thief",600), new Book("Cilka's Journey",448), new Book("Aroha", 240), new Book("Becoming", 464)};
        for (Book b: books) listModel.addElement(b);
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
        getContentPane().add(new JScrollPane(bookList), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    //complete inner class here
    class SelectListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent arg0) {
            if (!arg0.getValueIsAdjusting()) {
                String title = ((Book)bookList.getSelectedValue()).getTitle();
                nameTextField.setText(title);
            }
        }
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            int page = Integer.parseInt(numberTextField.getText());
            listModel.addElement(new Book(name, page));
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int index = bookList.getSelectedIndex();
            if (index != -1)
                listModel.removeElementAt(index);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {new BookListDemo();}
        });

    }
}
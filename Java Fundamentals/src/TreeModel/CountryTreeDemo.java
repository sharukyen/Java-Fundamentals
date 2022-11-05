package TreeModel;

/**
 *This example creates a JTree using an instance of DefaultTreeModel. The tree displays a list of cites of "New Zealand". Users should be able to add a new city or remove an existing city from the tree. For simplicity, we only add a new node to the root and remove an existing node from the root.
 *
 * 1. Define an inner member class named AddListener which implements the ActionListener interface and implements the actionPerformed method. The method should do the following:
 *
 * Get the text entered from nameTextField. You may find the getText() method useful.
 * Get the number of children from the root. You may find the getChildCount() method useful.
 * Add a new tree node to the tree by calling the insertNodeInto() method. The parameters are:
 * the new DefaultMutableTreeNode node
 * the root of the tree
 * the index of the new node in the root of the tree
 * 2. Define an inner member class named RemoveListener which implements the ActionListener interface and implements the actionPerformed method. The method should do the following:
 *
 * Get the index entered from indexTextField.
 * If the index is valid, get the node (of type DefaultMutableTreeNode) by calling the getChild(root, index) method.
 * Remove the selected node by calling the removeNodeFromParent() method. The parameter is the current DefaultMutableTreeNode node obtained in the previous step.
 *
 * This example creates a JTree using an instance of DefaultTreeModel. The tree displays a list of cites of "New Zealand". Users should be able to display the name of the selected city from the JTree.
 *
 * Define an inner member class named SelectListener which implements TreeSelectionListener and implements the valueChanged(TreeSelectionEvent e) method. The valueChanged() method is called whenever the value of the tree selection changes. The method displays the name of the selected city from the JTree. The method should complete the following:
 *
 * Get the selected node by invoking the getLastSelectedPathComponent() method if the selection is not null.
 * Cast the selected object to the type of DefaultMutableTreeNode.
 * The method displays the name of the selected city if the selected node is not the root. Complete the following:
 * Get the underlying String object by invoking the getUserObject() method.
 * Display the name in the nameTextField text field by invoking the setText(String s) method.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class CountryTreeDemo extends JFrame {
    JTextField nameTextField, indexTextField;
    JButton addButton, removeButton;
    JTree tree;
    DefaultTreeModel treeModel;
    DefaultMutableTreeNode root;

    public CountryTreeDemo() {
        root = new DefaultMutableTreeNode("New Zealand");
        root.add(new DefaultMutableTreeNode("Auckland"));
        root.add(new DefaultMutableTreeNode("Hamilton"));
        root.add(new DefaultMutableTreeNode("Christchurch"));
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);

        nameTextField = new JTextField("Name", 20);
        indexTextField = new JTextField("1", 5);
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        addButton.addActionListener(new AddListener());
        removeButton.addActionListener(new RemoveListener());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(new JLabel("Enter:"));
        buttonsPanel.add(nameTextField);
        buttonsPanel.add(addButton);
        buttonsPanel.add(new JLabel("Remove by index:"));
        buttonsPanel.add(indexTextField);
        buttonsPanel.add(removeButton);
        getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
    //complete inner classes here
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { //add to root
            String name = nameTextField.getText();
            int index = treeModel.getChildCount(root); //new node position
            treeModel.insertNodeInto(new DefaultMutableTreeNode(name), root, index);
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { //remove from root
            int index = Integer.parseInt(indexTextField.getText());
            if (index <treeModel.getChildCount(root)) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeModel.getChild(root, index);
                treeModel.removeNodeFromParent(node); //get selected node
            }
        }
    }

    class SelectListener implements TreeSelectionListener {
        public void valueChanged(TreeSelectionEvent e) {
            if (tree.getLastSelectedPathComponent() != null) { //DefaultMutableTreeNode
                DefaultMutableTreeNode d = (DefaultMutableTreeNode)(tree.getLastSelectedPathComponent());
                if (d != root) {
                    nameTextField.setText("" + d.getUserObject());
                } else nameTextField.setText("ERROR: Invalid selection!");
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new CountryTreeDemo();}
        });

    }
}

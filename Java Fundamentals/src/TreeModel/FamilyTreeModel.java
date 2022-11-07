package TreeModel;

/**
 *Complete the FamilyTreeModel class below. The FamilyTreeModel class defines data structures for holding a list of Person objects to be presented by a JTree. The FamilyTreeModel must implement the TreeModel interface. The FamilyTreeModel contains the following data fields:
 *
 * A private Person data field named root that defines the root of the tree model.
 * A private ArrayList<TreeModelListener> data field named treeModelListeners that defines a list of tree model listeners.
 * Complete the following:
 *
 * A constructor which takes a root as a parameter and creates the object. The constructor should also create an empty array list for the tree model listeners.
 * A method named getChild(Object parent, int index) which returns the child of a parent at the parameter index in the parent's child array.
 * A method named getChildCount(Object parent) which returns the number of children of a parent.
 * A method named getIndexOfChild(Object parent, Object child) which returns the index of child in a parent.
 * A method named getRoot() which returns the root of a tree.
 * A method named isLeaf(Object node) which returns true if the parameter node is a leaf.
 *
 * Starting with your solution to the previous task, add the following methods to your FamilyTreeModel class to extend its functionality.
 *
 * A method named insertNodeInto(Person new_node, Person parent, int index) which inserts new_node at location index in parents children. The method should do the following:
 * Validate the parameter parent object. The method should only insert a new child if the parameter parent is an instance of the CompositePerson class.
 * Add the parameter new_node to the parent node by calling the add() of the CompositePerson class.
 * Notify all listeners that a new node has been inserted by calling the fireTreeNodesInserted() method. The parameters are:
 * source: the object itself (i.e. this
 * path: the path from root to the parent node by calling the getPath() method.
 * childIndices: index of the new node in the parent node. The type is an int array.
 * children: the new node (i.e. new_node). The type is an Object array.
 *
 * Starting with your solution to the previous task, add the following methods to your FamilyTreeModel class to extend its functionality.
 *
 * A method named removeNodeFromParent(FileComponent selectedNode) which removes the selected node from its parent. The method should do the following:
 * Get the parent node of the selected node by calling the getParent() method.
 * Get the index of selected node in parent by calling the indexOf() method.
 * Remove the selected node from its parent.
 * Notify all listeners that a node has been removed by calling the fireTreeNodesRemoved() method. The parameters are:
 * source: the object itself (i.e. this)
 * path: the path from root to the parent of the selected node by calling the getPath() method.
 * childIndices: the index of the selected node in it's parent. The type is int array.
 * children: the selected node. The type is an Object array.
 *
 * This example creates a JTree using an instance of FamilyTreeModel which defined in the previous question. Complete the event handling steps such that the contents in the tree model can be changed. i.e. add a new SinglePerson object, add a new CompositePerson object or remove the selected person.
 *
 * 1. Define an inner class named AddListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should handle the following:
 *
 * Get the text entered from the text field and create a SinglePerson object.
 * Get the selected path. You may find the getSelectionPath() useful.
 * If the selected path is not null, the method gets the selected node by calling the getLastPathComponent() method.
 * If the selected node is a CompositePerson object, the method gets the number of children in the selected node.
 * Insert the new object by calling the insertNodeInto(). The parameters are
 * newChild: the new object
 * parent: the selected node
 * index: the index of the new object in the selected node
 * 2. Define an inner class named AddParentListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should handle the following:
 *
 * Repeat the above step. The method should add a new CompositePerson object into selected node.
 * 3. Define an inner class named RemoveListener which implements the ActionListener interface and implements the actionPerformed(ActionEvent e) method. The method should handle the following:
 *
 * Get the selected path. You may find the getSelectionPath() method useful.
 * If the selected path is not null, the method gets the selected node by calling the getLastPathComponent() method.
 * If the selected node is not the root, the method removes the selected node from the tree model. You may find the removeNodeFromParent() method useful. The parameter is the selected node.
 */

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.*;
import javax.swing.event.*;

abstract class Person {
    private String name;
    Person parent = null;
    public Person(String name) { this.name = name; }
    public String getName() {return name; }
    public Person getParent() { return parent; }
    public void setParent(Person p) { parent = p; }
    public String toString() { return name; }
    public Person[] getPath() { return getPathToRoot(this, 0); }
    protected Person[] getPathToRoot(Person aNode, int depth) {
        Person[] retNodes;
        if(aNode == null) {
            if(depth == 0) return null;
            else retNodes = new Person[depth];
        } else {
            depth++;
            retNodes = getPathToRoot(aNode.getParent(), depth);
            retNodes[retNodes.length - depth] = aNode;
        }
        return retNodes;
    }
    public static void linkFamily(Person obj, Person[] kids) {
        CompositePerson p = (CompositePerson)obj;
        for (Person kid : kids)
            p.add(kid);
    }
}
class SinglePerson extends Person {
    public SinglePerson(String name) { super(name); }
}
class CompositePerson extends Person {
    private List<Person> children = new ArrayList<Person>();
    public CompositePerson(String name) { super(name); }
    public void add(Person p) {
        p.setParent(this);
        children.add(p);
    }
    public void remove(Person p) {
        children.remove(p);
        p.setParent(null);
    }
    public int getSize() { return children.size(); }
    public Person getChildAt(int index) { return children.get(index); }
    public int indexOf(Person kid) { return children.indexOf(kid); }
    public Person[] getChildren() {
        Person[] arr = new Person[children.size()];
        arr = children.toArray(arr);
        return arr;
    }
}
// complete the tree model
public class FamilyTreeModel implements TreeModel {
    private Person root;
    private ArrayList<TreeModelListener>  treeModelListeners  = new ArrayList<TreeModelListener>();
    public FamilyTreeModel(Person root) { this.root = root; }
    public Object getRoot() { return root; }
    public boolean isLeaf(Object node) {return node instanceof SinglePerson;}
    public int getChildCount(Object parent) {
        return (parent instanceof  CompositePerson)?  ((CompositePerson)parent).getSize():  0;
    }
    public Object getChild(Object parent, int index) {
        if (parent instanceof CompositePerson)
            return ((CompositePerson)parent).getSize() > index && index>=0 ? ((CompositePerson)parent).getChildAt(index) : null;
        else return null;
    }
    public int getIndexOfChild(Object parent, Object child) {
        return parent instanceof CompositePerson ? ((CompositePerson)parent).indexOf((Person)child) : -1;
    }
    public void addTreeModelListener(TreeModelListener l) {
        treeModelListeners.add(l);
    }
    public void removeTreeModelListener(TreeModelListener l) {
        treeModelListeners.remove(l);
    }
    protected void fireTreeNodesRemoved(Object source, Object[] path,int[] childIndices,Object[] children) {
        System.out.printf("Called fireTreeNodesRemoved: path=%s, childIndices=%s, children=%s\n", Arrays.toString(path), Arrays.toString(childIndices), Arrays.toString(children));
        final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
        for (final TreeModelListener l : treeModelListeners)
            l.treeNodesRemoved(event);
    }
    protected void fireTreeNodesInserted(Object source, Object[] path,int[] childIndices,Object[] children) {
        System.out.printf("Called fireTreeNodesInserted: path=%s, childIndices=%s, children=%s\n", Arrays.toString(path), Arrays.toString(childIndices), Arrays.toString(children));
        final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
        for (final TreeModelListener l : treeModelListeners)
            l.treeNodesInserted(event);
    }
    public void valueForPathChanged(TreePath path, Object newValue) {
        System.out.println("*** valueForPathChanged : " + path + " --> " + newValue);
    }
    public void insertNodeInto(Person new_node, Person parent, int index) {
        if (parent instanceof CompositePerson) {
            CompositePerson parentNode = (CompositePerson) parent;
            parentNode.add(new_node);
            fireTreeNodesInserted(this, parentNode.getPath(), new int[]{index},new Object[]{new_node});
        }
    }
    public void removeNodeFromParent(Person selectedNode) {
        CompositePerson parentNode = (CompositePerson)selectedNode.getParent();
        int index = parentNode.indexOf(selectedNode);
        parentNode.remove(selectedNode);
        fireTreeNodesRemoved(this, parentNode.getPath(), new int[]{index},new Object[]{selectedNode});

    }
}

class FamilyTreeDemo extends JFrame {
    JButton addButton, addParentButton, removeButton;
    JTextField nameTextField;
    JTree tree;
    FamilyTreeModel treeModel;
    Person root;

    public FamilyTreeDemo() {
        root = new CompositePerson("Jack");
        Person b1 = new SinglePerson("Peter");
        Person b2 = new SinglePerson("Zoe");
        Person.linkFamily(root, new Person[] { b1, b2 });
        treeModel = new FamilyTreeModel(root);
        tree = new JTree(treeModel);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        addButton = new JButton("Add");
        addParentButton = new JButton("Add Parent");
        removeButton = new JButton("Remove");
        nameTextField = new JTextField("David");
        addButton.addActionListener(new AddListener());
        addParentButton.addActionListener(new AddParentListener());
        removeButton.addActionListener(new RemoveListener());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(nameTextField);
        buttonsPanel.add(addButton);
        buttonsPanel.add(addParentButton);
        buttonsPanel.add(removeButton);
        getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    //complete inner classes here
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            if (tree.getLastSelectedPathComponent() != null && tree.getLastSelectedPathComponent() instanceof CompositePerson) {
                CompositePerson parent = (CompositePerson)tree.getLastSelectedPathComponent();
                int index = parent.getSize();
                treeModel.insertNodeInto(new SinglePerson(name), parent, index);
            }
        }
    }
    class AddParentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            TreePath currentSelection = tree.getSelectionPath();
            if (currentSelection != null && currentSelection.getLastPathComponent() instanceof CompositePerson) {
                CompositePerson parent = (CompositePerson)currentSelection.getLastPathComponent();
                int index = parent.getSize();
                treeModel.insertNodeInto(new CompositePerson(name), parent, index);
            }
        }
    }
    class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TreePath currentSelection = tree.getSelectionPath(); //should not remove root
            if (currentSelection != null && currentSelection.getLastPathComponent() != root) {
                Person selectedNode = (Person)currentSelection.getLastPathComponent();
                treeModel.removeNodeFromParent(selectedNode); //get selected node
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new FamilyTreeDemo(); } });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.priorityqueue_bst;

/**
 *
 * @author dell
 */
public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null; 
    }

    // Insert Method
    public void insert(Student std) {
        Node newNode = new Node(std);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (std.getId() < current.student.getId()) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Find Smallest
    public Student findSmallest() {
        if (root == null) return null;
        Node current = root;
        while (current.leftChild != null) {
            current = current.leftChild;
        }
        return current.student;
    }

    // Delete Smallest --> for Pop
    public Student deleteSmallest() {
        if (root == null) return null;

        Node current = root;
        Node parent = root;

        while (current.leftChild != null) {
            parent = current;
            current = current.leftChild;
        }

        Student removedData = current.student;

        if (current == root) {
            root = root.rightChild;
        } else {
            parent.leftChild = current.rightChild;
        }
        return removedData;
    }

    // Inorder Traversal
    public void inorderTraversal(Node localRoot) {
        if (localRoot != null) {
            inorderTraversal(localRoot.leftChild);
            localRoot.display();
            inorderTraversal(localRoot.rightChild);
        }
    }
}
    
    


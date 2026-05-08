/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.priorityqueue_bst;

/**
 *
 * @author dell
 */
public class priorityQueue {
    
    private BinarySearchTree bst;

    public priorityQueue() {
        bst = new BinarySearchTree();
    }

    // Push
    public void push(Student std) {
        bst.insert(std);
    }

    // Pop
    public Student pop() {
        return bst.deleteSmallest();
    }

    // Peak
    public Student peak() {
        return bst.findSmallest();
    }

    // Display
    public void display() {
        if (bst.root == null) {
            System.out.println("Queue is empty.");
        } else {
            bst.inorderTraversal(bst.root);
        }
    }
}



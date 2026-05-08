/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.priorityqueue_bst;

/**
 *
 * @author dell
 */
public class Node {
    
    public Student student ;
    public Node rightChild ;
    public Node leftChild ;

    public Node(Student student) {
        this.student = student;
        rightChild = null ;
        leftChild = null ;
    }
    // display
    public void display(){
        System.out.println(student.toString());
    }
    
}

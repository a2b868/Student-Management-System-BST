/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priorityqueue_bst;
/**
 *
 * @author dell
 */
public class PriorityQueue_BST {
    public static void main(String[] args) {
        
        //object 
        priorityQueue myQueue = new priorityQueue();
        
         Student std1 = new Student("Abdelrahman",101,78.8);
        myQueue.push(std1);
        
         Student std2 = new Student("Ahmed",102,80.0);
        myQueue.push(std2);
        
         Student std3 = new Student("Omar",105,90.7);
        myQueue.push(std3);
        
         Student std4 = new Student("Mohmed",107,67.4);
        myQueue.push(std4);
        
         Student std5 = new Student("Mahmoud",103,89.9);
        myQueue.push(std5);
        
         Student std6 = new Student("Anas",109,85.5);
        myQueue.push(std6);
        
        myQueue.display();
        System.out.println("********************");
        
        myQueue.pop();
        
        myQueue.display();
        System.out.println("*********************");
        
        System.out.println(myQueue.peak());
        
    }
}
 
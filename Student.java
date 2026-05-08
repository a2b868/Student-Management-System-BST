/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.priorityqueue_bst;

/**
 *
 * @author dell
 */
public class Student {
    
   private String name ;
   private int id ;
   private double grade ;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    // getName
    public String getName() {
        return name;
    }
    // setName
    public void setName(String name) {
        this.name = name;
    }
    // getId
    public int getId() {
        return id;
    }
    // setId
    public void setId(int id) {
        this.id = id;
    }
    // getGrade
    public double getGrade() {
        return grade;
    }
    // setGrade
    public void setGrade(double g) {
      if (g >= 0 && g <= 100) {
        this.grade = g;
      } else {
        System.out.println("The degree is illogical");
      }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", grade=" + grade + '}';
    }

}

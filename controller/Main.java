/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.StudentView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        StudentView sv = new StudentView();
        
        sc.menu(sv);
    }
}

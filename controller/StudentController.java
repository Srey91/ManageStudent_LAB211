/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import view.StudentView;

/**
 *
 * @author 84898
 */
public class StudentController extends Menu{
    public void menu(StudentView sv)
    {
        String[] content = {"Create", "Find and Sort", "Update/Delete", "Report", "Exit"};
        
        Menu m = new Menu("WELCOME TO STUDENT MANAGEMENT", content)
        {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: sv.continueCreate(); break;
                    case 2: sv.sort(sv.find()); break;
                    case 3: sv.updateOrDelete(); break;
                    case 4: sv.report(); break;
                }
            }
        };
        m.run();
    }

    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

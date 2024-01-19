/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import model.Student;
import model.StudentManagement;

/**
 *
 * @author 84898
 */
public class StudentView {
    StudentManagement sm = new StudentManagement();
    Validation v = new Validation();
    
    public void create()
    {
        String id = v.inputString("student id: ");
        String studentName = v.inputString("studnent name");
        String semester = v.inputString("semester: ");
        String courseName = v.input_CourseName("course name: ");

        Student student = new Student(id, studentName, semester, courseName);
        sm.getStudentList().add(student);
        System.out.println("Create successful!!!");
    }
    
    public StudentManagement find()
    {
        StudentManagement findStudent = new StudentManagement();
        
        if (sm.getStudentList().isEmpty())
        {
            System.out.println("Student list is empty!!!");
        }else
        {
            String name = v.inputString("student name or a part of student name.");
            
            for (Student student : sm.getStudentList())
            {
                if (student.getStudentName().contains(name))
                {
                    findStudent.getStudentList().add(student);
                }else
                {
                    System.out.println("Student not found!!!");
                }
            }
        }
         return findStudent;
    }
    
    public void sort(StudentManagement studentManagement)
    {
        Collections.sort(studentManagement.getStudentList(), (Student s1, Student s2) -> s1.getStudentName().compareTo(s2.getStudentName()));
        
        for (Student student : studentManagement.getStudentList())
        {
            System.out.println(student.get_FindString());
        }
    }
    
    public void updateOrDelete()
    {
        if (sm.getStudentList().isEmpty())
        {
            System.out.println("Student list is empty!!!");
        }else
        {
            String id = v.inputString("student id for update or delete");
            
            for (Student student : sm.getStudentList())
            {
                if (id.equals(student.getId()))
                {
                    int index = sm.getStudentList().indexOf(student);
                    char confirmOption = v.input_UpdateOrDelete();
                    
                    if (confirmOption == 'U')
                    {
                        String studentName = sm.getStudentList().get(index).getStudentName();
                        String semester = sm.getStudentList().get(index).getSemester();
                        String courseName = v.input_CourseName("course name");
                        
                        Student s = new Student(id, studentName, semester, courseName);
                        sm.getStudentList().add(s);
                        
                        System.out.println("Update successful!!!");
                    }else
                    {
                        sm.getStudentList().remove(student);
                        
                        System.out.println("Remove successful!!!");
                    }
                }else
                {
                    System.out.println("Student not found!!!");
                }
            }
        }
    }
    
    public void report()
    {
        Map <Student, Integer> map = new TreeMap<>();
        int count;
        
        for (int i = 0; i < sm.getStudentList().size(); i++)
        {
            count = 0;
            for (int j = 0; j < sm.getStudentList().size(); j++)
            {
                if (sm.getStudentList().get(i).equals(sm.getStudentList().get(j)))
                    count++;
            }
            map.put(sm.getStudentList().get(i), count);
        }
        
        System.out.println("The report as below:");
        for (Student student : map.keySet())
        {
            System.out.println(student.get_ReportString() + " | " + map.get(student));
        }
    }
    
    public void continueCreate()
    {
        char confirmOption = 'N';
        int count = 0;
        
        while (count < 10)
        {
            create();
            count++;
            
            if (count == 10)
                confirmOption = v.input_ConfirmOption();
        }
        
        while (confirmOption == 'Y')
        {
            create();
            confirmOption = v.input_ConfirmOption();
        }
    }
}

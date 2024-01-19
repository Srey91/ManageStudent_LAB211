/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84898
 */
public class Student {
    protected String id;
    protected String studentName;
    protected String semester;
    protected String courseName;

    public Student() {
    }

    
    
    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String get_ReportString()
    {
        return studentName + " | " + courseName;
    }
    
    public String get_FindString()
    {
        return studentName + " | " + semester + " | " + courseName;
    }
    
    @Override
    public String toString() {
        return id + " | " + studentName + " | " + semester + " | " + courseName;
    }
    
    
}

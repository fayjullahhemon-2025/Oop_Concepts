package Practices;

import java.util.ArrayList;

//Write a Java program to create a class called "Student"
// with a name, grade, and courses attributes,
// and methods to add and remove courses.

class Student{
    private String name;
    private double grade;
    private ArrayList courses ;
    public Student(String name,double grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList();
    }
    public void addCourses(String c){
        courses.add(c);
    }
    public void removeCourses(String c){
        courses.remove(c);
    }
    public ArrayList getCourses(){
        return courses;
    }
}
public class problem10 {
    public static void main(String[] args) {
        Student student = new Student("Emon",3.59);
        student.addCourses("AOOP");
        student.addCourses("PMG");
        student.addCourses("UI/Ux");
        student.addCourses("TOC");
        student.addCourses("DBMS");
        for(Object c : student.getCourses()){
            System.out.println(c);
        }
        student.removeCourses("DBMS");
        for(Object c: student.getCourses()){
            System.out.println(c);
        }
    }
}

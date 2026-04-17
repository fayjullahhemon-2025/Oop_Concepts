package Practices;
//Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes,
// and methods to add and remove students and teachers, and to create classes.
import java.util.ArrayList;

class School{
    private static ArrayList students;
    private static ArrayList teachers;
    private static ArrayList classes;
    public School(){
        students = new ArrayList();
        teachers = new ArrayList();
        classes = new ArrayList();
    }
    public void addClasses(String c){
        classes.add(c);
    }
    public static ArrayList getClasses(){
        return classes;
    }
    public void removeClass(String c){
        classes.remove(c);
    }
    public void addTeachers(String c){
        teachers.add(c);
    }
    public void removeTeachers(String c){
        teachers.remove(c);
    }
    public static ArrayList getTeachers(){
        return teachers;
    }
    public void addStudent(String c){
        students.add(c);
    }
    public void removeStudent(String c){
        students.remove(c);
    }
    public ArrayList getStudents(){
        return students;
    }
}
public class problem14 {
    public static void main(String[] args) {
        School school = new School();
        school.addClasses("one");
        school.addClasses("two");
        school.addClasses("three");
        school.addClasses("four");
        school.addClasses("five");
        school.addClasses("six");
        school.addClasses("seven");
        school.addClasses("eight");
        school.addClasses("nine");
        school.addClasses("ten");

        for(Object c : School.getClasses()){
            System.out.print(c+", ");
        }
        school.removeClass("nine");
        school.removeClass("ten");
        for(Object c : School.getClasses()){
            System.out.print(c+", ");
        }
        school.addTeachers("Emon");
        school.addTeachers("Payel");
        school.addTeachers("Moon");
        school.addTeachers("Rattry");

        for(Object c : School.getTeachers()){
            System.out.print(c+", ");
        }
        school.removeTeachers("Rattry");
        for(Object c: School.getTeachers()){
            System.out.print(c+" ");
        }
        school.addStudent("Afsar");
        school.addStudent("Rattry");
        school.addStudent("Mawa");
        school.addStudent("Saimon");
        school.addStudent("Ruhi");

        for(Object c: school.getStudents()){
            System.out.print(c+", ");
        }
        school.removeStudent("Ruhi");
        for(Object c: school.getStudents()){
            System.out.print(c+", ");
        }

    }
}

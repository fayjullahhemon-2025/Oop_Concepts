package Classes_Objects;

public class Student {
    //classes are blueprint of objects.
    String name;
    int id;
    double cgpa;
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
    }
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Emon";
        s1.id = 72;
        s1.cgpa = 3.59;

        s1.displayInfo();
    }
}

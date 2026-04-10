package Four.pillers.of.oop;
class Student{
    private String name;
    private int age;
    private int id;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
}
public class EncapsulationBasic {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Emon");
        s1.setAge(25);
        s1.setId(72);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());
    }
}

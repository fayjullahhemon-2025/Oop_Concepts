package Four.pillers.of.oop;
class ParentClass{
    String name;
    public void FromParentClass(){
        System.out.println("Child class inherits parent clases methods");
    }
}
class ChildClass extends ParentClass{
    int age;
    public void FromChildClass(){
        System.out.println("Calling from child class");
    }
}
public class inheritance {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.name = "Emon";
        c1.age = 26;
        System.out.println("name "+c1.name);
        System.out.println("age "+c1.age);
        c1.FromParentClass();
        c1.FromChildClass();
    }
}

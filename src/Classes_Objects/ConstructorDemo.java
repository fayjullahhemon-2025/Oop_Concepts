package Classes_Objects;

public class ConstructorDemo {
    int id;
    int age;
    ConstructorDemo(){
        System.out.println("Constructor run after creating object");
    }
    ConstructorDemo(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
        ConstructorDemo demo2 = new ConstructorDemo(72,26);
    }
}

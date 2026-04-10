package Four.pillers.of.oop;
class Animal{
    String name="Cat";
    public void run(){
        System.out.println("Running....");
    }
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal{
    String name = "Dog";
    public void name(){
        System.out.println(name);
        System.out.println(super.name);
    }
    public void run(){
        super.run();
        System.out.println("Cat run...");
    }
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name);
        d.name();
        d.run();
    }
}

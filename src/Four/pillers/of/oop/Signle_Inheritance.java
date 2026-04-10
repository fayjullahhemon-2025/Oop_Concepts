package Four.pillers.of.oop;
class A{
    public void eating(){
        System.out.println("Calling from class A");
    }
}
class B extends A{
    public void drinking(){
        System.out.println("Calling from class B");
    }
}
public class Signle_Inheritance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.eating();
        b1.drinking();
    }
}

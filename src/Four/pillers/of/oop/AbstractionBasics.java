package Four.pillers.of.oop;
abstract class Carss{
    abstract public void start();
    public void openGate(){
        System.out.println("Gate is open..");
    }
}
class Toyota extends Carss{
    public void start(){
        System.out.println("Toyota starts.....");
    }
}
public class AbstractionBasics {
    public static void main(String[] args) {
        Toyota T1 = new Toyota();
        T1.openGate();
        T1.start();
    }
}

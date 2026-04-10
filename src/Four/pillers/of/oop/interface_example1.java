package Four.pillers.of.oop;
interface Cars{
    public void start();
}
class ElectricCar implements Cars{
    public void start(){
        System.out.println("Electric car starts");
    }
}
class DieselCar implements Cars{
    public void start(){
        System.out.println("Diesel Car starts");
    }
}
public class interface_example1 {
    public static void main(String[] args) {
        Cars Tesla = new ElectricCar();
        Cars Suzuki = new DieselCar();
        Tesla.start();
        Suzuki.start();
    }

}

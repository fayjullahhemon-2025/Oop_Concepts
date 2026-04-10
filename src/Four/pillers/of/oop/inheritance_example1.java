package Four.pillers.of.oop;
class Vehicle{
    double price;
    double milage;
    String color;
    public void Display(){
        System.out.println("Price: "+price);
        System.out.println("milage: "+milage);
        System.out.println("Color: "+color);
    }
}
class Car extends Vehicle{
    String fuelType;
    boolean isSunroof;
    String brand;
    public void CarInfo(){
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Brand: "+brand);
        System.out.println("Sun roof: "+isSunroof);
    }
}
public class inheritance_example1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Suzuki";
        c1.price = 150000;
        c1.milage = 3.75;
        c1.color = "Blue";
        c1.fuelType = "Diesel";
        c1.isSunroof = true;
        c1.Display();
        c1.CarInfo();
    }
}

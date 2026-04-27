package Practices;
//Write a Java program to create a class called "Vehicle"
// with attributes for make, model, and year.
// Create subclasses "Car" and "Truck"
// that add specific attributes like trunk size for cars
// and payload capacity for trucks.
// Implement a method to display vehicle details in each subclass.
interface info{
    public void display();
}
class Vehicle{
    private String make;
    private String model;
    int year;
    public Vehicle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
class Car extends Vehicle implements info{
    private double trunkSize;
    public Car(String make, String model,int year,double trunkSize){
        super(make,model,year);
        this.trunkSize = trunkSize;
    }
    public void setTrunkSize(double trunkSize){
        this.trunkSize = trunkSize;
    }
    public double getTrunkSize(){
        return trunkSize;
    }
    @Override
    public void display(){
        System.out.println("Brand: "+getMake());
        System.out.println("Model: "+getModel());
        System.out.println("Released Year: "+getYear());
        System.out.println("Trunk Size: "+trunkSize);
    }
}
class Truck extends Vehicle implements info{
    private double payloadCapaity;
    public Truck(String make,String model,int year,double payloadCapaity){
        super(make,model,year);
        this.payloadCapaity = payloadCapaity;
    }
    public void setPayloadCapaity(double payloadCapaity){
        this.payloadCapaity = payloadCapaity;
    }
    @Override
    public void display(){
        System.out.println("Brand: "+getMake());
        System.out.println("Model: "+getModel());
        System.out.println("Released Year: "+getYear());
        System.out.println("Trunk Size: "+payloadCapaity);

    }
}
public class problem21 {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki","Swift",2001,15.1);
        c1.display();
        Truck t1 = new Truck("Ford","F-150",2005,3.5);
        t1.display();
    }
}

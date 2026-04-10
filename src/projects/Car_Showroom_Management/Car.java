package projects.Car_Showroom_Management;
import java.util.Scanner;
public class Car extends Showroom implements Utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_transmission;

    @Override
    public void get_Details(){
        System.out.println("Car Name: "+car_name);
        System.out.println("Car color: "+car_color);
        System.out.println("Car Fuel Type: "+car_fuel_type);
        System.out.println("Car Price: "+car_price);
        System.out.println("Car Transmission: "+car_transmission);
    }

    @Override
    public void set_Details(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------**Enter Car Details**--------------------");
        System.out.print("Car Name: ");
        car_name = input.nextLine();
        System.out.print("");
        System.out.print("Car color: ");
        car_color = input.nextLine();
        System.out.print("");
        System.out.print("Car Fuel Type: ");
        car_fuel_type = input.nextLine();
        System.out.print("");
        System.out.print("Car transmission: ");
        car_transmission = input.nextLine();
        System.out.print("");
    }
}

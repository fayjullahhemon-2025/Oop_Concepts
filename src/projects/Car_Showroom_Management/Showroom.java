package projects.Car_Showroom_Management;
import java.util.Scanner;
public class Showroom implements Utility{
    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_in_stock=0;
    String manager_name;

    @Override
    public void get_Details(){
        System.out.println("Showroom name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Total Employee: "+total_employee);
        System.out.println("Total cars in stock: "+total_cars_in_stock);
        System.out.println("Manager name: "+manager_name);
    }

    @Override
    public void set_Details(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------**Enter Showroom Details**--------------------");
        System.out.print("Showroom Name: ");
        showroom_name = input.nextLine();
        System.out.print("");
        System.out.print("Showroom Address:");
        showroom_address = input.nextLine();
        System.out.print("");
        System.out.print("Total Employee: ");
        total_employee = input.nextInt();
        System.out.print("");
        System.out.print("Total Cars in stock: ");
        total_cars_in_stock = input.nextInt();
        System.out.print("");
        System.out.print("Manager name: ");
        manager_name = input.nextLine();
        System.out.print("");

    }
}
